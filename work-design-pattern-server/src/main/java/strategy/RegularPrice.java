package strategy;

import core.Movie;

/**
 * @Auther: allanyang
 * @Date: 2019/4/17 21:31
 * @Description:
 */
public class RegularPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double res = 2;
        if (daysRented > 2) {
            res += (daysRented - 2) * 1.5;
        }
        return 0;
    }
}