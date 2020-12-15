package discount;

import clothingstore.Clothing;
import clothingstore.*;

public class BlackFridayDiscountStrategy implements DiscountStrategy {

    //Not needed to have default constructor, but just to indicate that it exist no matter what.
    //when "new BlackFridayDiscountStrategy()" then is provided as argument for setDiscountStrategy(arg),...
    //...the priceByDiscount-method is implemented as defined in BlackFridayDiscountStrategy-method for the temporally created object of BlackFridayDiscountStrategy.
    //this object is den used within the setDiscountStrategy void method to run the accurate priceByDiscount method on the clothing object from which the setDiscountStrategy is invoked.
    public BlackFridayDiscountStrategy() {
    }
    
    

    @Override
    public double priceByDiscount(Clothing clothing) {
        if (clothing instanceof Jacket) {
            return clothing.getBasePrice() * 0.9;
        }
        if (clothing instanceof Socks) {        //don´t need else if since we have return after each if which exits the method
            return clothing.getBasePrice() * 0.8;
        } else {
            return clothing.getBasePrice() * 0.75;
        }

    }

}
