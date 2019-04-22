package decorator;

import component.Component;

/**
 * @Auther: allanyang
 * @Date: 2019/4/22 20:56
 * @Description:
 */
public class ComponentDecorator extends Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}