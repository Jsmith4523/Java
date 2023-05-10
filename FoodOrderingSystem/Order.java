package FoodOrderingSystem;

import java.util.UUID;

public class Order {

    final UUID id = UUID.randomUUID();
    private Food[] foods;
    private Double total;

    public Double totalAmount() {
        for(Food food: this.foods) {
            total += food.getPrice();
        }
        return total;
    }

    //Adds a food to an order and sets the food objects id to the current length of the order
    public void addToOrder(Food food) {
        final int orderLength = this.foods.length;

        food.setOrderID(orderLength);
        this.foods[foods.length] = food;
    }

    ///Removes food from list based upon if the entry number if valid or not.
    public void removeFromOrder(int id) {
        if (this.foods.length == 0) {
            System.out.println("You have no item in your order");
            return;
        }

        try {
            //TODO: Figure out how to remove an item from an array...
        } catch (Exception e) {
            System.out.println("That number is not valid within the given range.");
            return;
        }
    }
}
