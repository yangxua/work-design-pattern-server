package strategy;

import core.Movie;

/**
 * @Auther: allanyang
 * @Date: 2019/4/17 21:29
 * @Description:
 */
public class ChildrensPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double res = 1.5;
        if (daysRented > 3) {
            res += (daysRented - 3) * 1.5;
        }
        return res;
    }
}