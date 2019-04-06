package abstractfactory.concreteproduct;

import abstractfactory.abstractproduct.Button;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:58
 * @Description:
 */
public class SummerButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}