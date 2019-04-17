package core;

import java.util.*;

/**
 * @Auther: allanyang
 * @Date: 2019/4/17 20:31
 * @Description:
 */
public class Customer {

    private String name;
    private List rentals = new ArrayList();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Iterator iterator = rentals.iterator();
        String result = "Rental Record for " + getName() + "\n";

        while (iterator.hasNext()) {
            Rental each = (Rental) iterator.next();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf( each.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int res = 0;

        Iterator iterator = rentals.iterator();
        while (iterator.hasNext()) {
            Rental each = (Rental) iterator.next();
            res += each.getFrequentRenterPoints();
        }

        return res;
    }

    private double getTotalCharge() {
        double res = 0;

        Iterator iterator = rentals.iterator();
        while (iterator.hasNext()) {
            Rental each = (Rental) iterator.next();
            res += each.getCharge();
        }

        return res;
    }
}