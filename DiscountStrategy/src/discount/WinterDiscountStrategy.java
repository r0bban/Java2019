package discount;

import clothingstore.Clothing;
import clothingstore.*;
import enumcollections.Season;

public class WinterDiscountStrategy implements DiscountStrategy {

    @Override
    public double priceByDiscount(Clothing clothing) {
        //double newPrice = clothing.getBasePrice();
        double discount = 1;

        if (clothing.getSeason().equals(Season.FALL)) {
            discount = discount - 0.4;
        } else if (clothing.getSeason().equals(Season.WINTER)) {
            discount = discount - 0.5;
        } else if (clothing.getSeason().equals(Season.SUMMER)) {
            discount = discount - 0.25;
        }

        if (clothing instanceof Jacket) {
            discount = discount - 0.1;
        }
        return clothing.getBasePrice()*discount;
    }

}
