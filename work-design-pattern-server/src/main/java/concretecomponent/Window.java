package concretecomponent;

import component.Component;

/**
 * @Auther: allanyang
 * @Date: 2019/4/22 20:54
 * @Description:
 */
public class Window extends Component {

    @Override
    public void display() {
        System.out.println("显示窗体！");
    }
}