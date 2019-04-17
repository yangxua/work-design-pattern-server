package concretestrategy;

import strategy.Discount;

/**
 * @Auther: allanyang
 * @Date: 2019/4/17 20:14
 * @Description:
 */
public class VIPDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("vip票：");
        return price * 0.5;
    }
}