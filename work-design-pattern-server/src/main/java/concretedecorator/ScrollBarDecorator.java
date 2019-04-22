package concretedecorator;

import component.Component;
import decorator.ComponentDecorator;

/**
 * @Auther: allanyang
 * @Date: 2019/4/22 20:57
 * @Description:
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public  void setScrollBar() {
        System.out.println("为构件增加滚动条！");

    }
}