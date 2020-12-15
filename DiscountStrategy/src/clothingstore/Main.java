package clothingstore;

import discount.BlackFridayDiscountStrategy;
import enumcollections.Season;

public class Main {

    public static void main(String[] args) {
        Jacket j1 = new Jacket("Linnen Coat", Season.FALL, 2890.50);
        System.out.println("Linnen coat: " + j1.getPrice());

        j1.setDiscountStrategy(new BlackFridayDiscountStrategy());






        System.out.println("Linnen coat: " + j1.getPrice());

    }

}
