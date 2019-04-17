package strategy;

/**
 * @Auther: allanyang
 * @Date: 2019/4/17 21:28
 * @Description:
 */
public abstract class Price {

    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}