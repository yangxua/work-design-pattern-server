package abstractfactory.concreteproduct;

import abstractfactory.abstractproduct.Button;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:58
 * @Description:
 */
public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}