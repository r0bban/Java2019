package clothingstore;

import discount.DiscountStrategy;
import enumcollections.Season;

public abstract class Clothing {

    //Fields
    private String name;
    private Season season;
    private double basePrice;
    private double finalPrice;
    private boolean isOnSale = false;
    //Class pecific Methods

    //Constructors

    public Clothing(String name, Season season, double basePrice) {
        this.name = name;
        this.season = season;
        this.basePrice = basePrice;
    }
    
    
    //Fields and get/set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPrice() {
        if (isOnSale) {
            return finalPrice;
        } else {
            return basePrice;
        }
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        finalPrice = discountStrategy.priceByDiscount(this);
        this.isOnSale = true;
    }

}
