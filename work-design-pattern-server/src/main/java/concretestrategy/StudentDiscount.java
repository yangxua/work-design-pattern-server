package concretestrategy;

import strategy.Discount;

/**
 * @Auther: allanyang
 * @Date: 2019/4/17 20:12
 * @Description:
 */
public class StudentDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}