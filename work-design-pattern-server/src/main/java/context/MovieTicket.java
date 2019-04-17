package context;

import strategy.Discount;

/**
 * @Auther: allanyang
 * @Date: 2019/4/17 20:07
 * @Description:
 */
public class MovieTicket {

    private double price;
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return discount.calculate(this.price);
    }


}