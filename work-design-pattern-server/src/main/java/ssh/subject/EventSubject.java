package ssh.subject;

import lombok.extern.slf4j.Slf4j;
import ssh.annotation.Listener;
import ssh.event.EventObject;
import ssh.listener.EventListener;
import ssh.scanner.AnnotationScanner;
import utils.CollectionUtil;
import utils.SpringHelpUtil;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: allanyang
 * @Date: 2019/4/13 13:40
 * @Description:
 */
@Slf4j
public class EventSubject {

    protected Map<Class<? extends EventObject>, LinkedHashSet<EventListenerContainer>> eventListenerMap = new ConcurrentHashMap<>();

    private static EventSubject INSTANCE = null;

    private EventSubject() {
        eventListenerMap.clear();
        AnnotationScanner scanner = SpringHelpUtil.getBean(AnnotationScanner.class);
        List<Class<?>> classList = scanner.getAnnotationMap().get(Listener.class.getName());
        for(Class<?> clz : classList) {
            Listener annotation = clz.getAnnotation(Listener.class);
            EventListener listener = null;
            if (annotation != null) {
                try {
                    listener = (EventListener)clz.newInstance();
                } catch (Exception e) {
                    log.error("初始化异常");
                }
                addListener(annotation, listener);
            }
        }
    }

    private void addListener(Listener annotation, EventListener listener) {
        for (Class<? extends EventObject> type : annotation.events()) {
            LinkedHashSet<EventListenerContainer> set = eventListenerMap.get(type);
            if (CollectionUtil.isEmpty(set)) {
                set = new LinkedHashSet<>();
                eventListenerMap.put(type, set);
            }
            EventListenerContainer container = new EventListenerContainer();
            container.setBlock(annotation.block());
            container.setEventListener(listener);
            set.add(container);
        }
    }

    private void removeListener(Class<? extends EventObject> event, EventListenerContainer container) {
        LinkedHashSet<EventListenerContainer> set = eventListenerMap.get(event);
        if (CollectionUtil.isNotEmpty(set)) {
            set.remove(container);
        }
    }

    public static EventSubject getInstance() {
        if (null == INSTANCE) {
            synchronized (EventSubject.class) {
                if (null == INSTANCE) {
                    INSTANCE = new EventSubject();
                }
            }
        }

        return INSTANCE;
    }

    public void notify(final EventObject event) {
        LinkedHashSet<EventListenerContainer> set = eventListenerMap.get(event);
        if (CollectionUtil.isNotEmpty(set)) {
            for (EventListenerContainer container : set) {
                try {

                    if (container.isBlock()) {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                container.getEventListener().update(event);
                            }
                        }).start();
                    } else {
                        container.getEventListener().update(event);
                    }
                } catch (Exception e) {
                    log.error("事件监听器出现异常.{" + container.getEventListener().getClass().getName() + "}", e);
                }
            }
        }
    }


}