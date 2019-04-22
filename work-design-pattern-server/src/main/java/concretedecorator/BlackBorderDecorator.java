package concretedecorator;

import component.Component;
import decorator.ComponentDecorator;

/**
 * @Auther: allanyang
 * @Date: 2019/4/22 20:59
 * @Description:
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public  void setScrollBar() {
        System.out.println("为构件增加黑色边框！");
    }
}