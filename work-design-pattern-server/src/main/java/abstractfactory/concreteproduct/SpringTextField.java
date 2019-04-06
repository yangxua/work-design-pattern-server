package abstractfactory.concreteproduct;

import abstractfactory.abstractproduct.TextField;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:59
 * @Description:
 */
public class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}