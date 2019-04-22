package concretecomponent;

import component.Component;

/**
 * @Auther: allanyang
 * @Date: 2019/4/22 20:55
 * @Description:
 */
public class TextBox extends Component {

    @Override
    public void display() {
        System.out.println("显示文本框！");
    }
}