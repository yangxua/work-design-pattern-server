import component.Component;
import concretecomponent.ListBox;
import concretecomponent.TextBox;
import concretecomponent.Window;
import concretedecorator.BlackBorderDecorator;
import concretedecorator.ScrollBarDecorator;
import decorator.ComponentDecorator;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 12:49
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Component listBox = new ListBox();
        Component window = new Window();
        Component textBox = new TextBox();
        ComponentDecorator decorator1 = new BlackBorderDecorator(listBox);
        ComponentDecorator decorator2 = new BlackBorderDecorator(window);
        ComponentDecorator decorator3 = new ScrollBarDecorator(textBox);
        decorator1.display();
        decorator2.display();
        decorator3.display();
    }
}