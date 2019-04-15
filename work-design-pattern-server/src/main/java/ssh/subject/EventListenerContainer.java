package ssh.subject;

import ssh.listener.EventListener;

import java.io.Serializable;

/**
 * @Auther: allanyang
 * @Date: 2019/4/15 15:11
 * @Description:
 */
public class EventListenerContainer implements Serializable {

    private static final long serialVersionUID = -1842232495988284358L;

    private EventListener eventListener;

    private boolean isBlock;

    public EventListener getEventListener() {
        return eventListener;
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }
}