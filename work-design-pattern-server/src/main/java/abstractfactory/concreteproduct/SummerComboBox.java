package abstractfactory.concreteproduct;

import abstractfactory.abstractproduct.ComboBox;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 14:00
 * @Description:
 */
public class SummerComboBox implements ComboBox {

    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}