package FoodOrderingSystem;

import java.util.UUID;

public class Food {

    private int id;
    private String name;
    private Double price;

    public Food(String name, Double price) {
        this.name  = name;
        this.price = price;
    }

    public void setOrderID(int id) {
        this.id = id;
    }
    
    public void details() {
        //TODO: Print details of this object!
    }

    public double getPrice() {
        return price;
    }
}
