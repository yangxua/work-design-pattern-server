package abstractfactory.concreteproduct;

import abstractfactory.abstractproduct.TextField;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 13:59
 * @Description:
 */
public class SummerTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}