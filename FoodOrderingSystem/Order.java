package FoodOrderingSystem;

import java.util.ArrayList;
import java.util.UUID;

public class Order {

    final UUID id = UUID.randomUUID();
    private ArrayList<Food> foods = new ArrayList<Food>();

    public Double totalAmount() {
        double total = 0;
        for(Food food: this.foods) {
            total += food.getPrice();
        }

        return total;
    }

    //Adds a food to an order and sets the food objects id to the current length of the order
    private void addToOrder(Food food) {
        int orderLength = this.foods.size();
        food.setOrderID(orderLength);
        this.foods.add(orderLength, food);
    }

    ///Removes food from list based upon if the entry number if valid or not.
    public void removeFromOrder(int id) {
        if (this.foods.size() == 0) {
            System.out.println("You have no items in your order");
            return;
        }

        try {
            this.foods.remove(id);
        } catch (Exception e) {
            System.out.println("That number is not valid within the given range.");
            return;
        }
    }

    ///Will check if the current food is already in the order and update the quantity; adds to order if not
    public void add(Food food) {
        Boolean isAlreadyIncluded = false;

        for (Food addedFood: foods) {
            if (addedFood.nameMatches(food.name())) {
                //Setting to true so we do not duplicate...
                isAlreadyIncluded = true;

                this.foods.remove(addedFood.getID());
                addedFood.detail.setQuantity(addedFood.detail.getQuantity()+1);
                this.foods.add(addedFood.getID(), food);
                break;
            }
        }

        if (!isAlreadyIncluded) {
            this.addToOrder(food);
        }
    }

    public void showDetailsOfOrder() {
        for(Food food: foods) {
            food.showDetailsAsOrder();
        }

        System.out.printf("The total of this order is: $%.2f", this.totalAmount());
    }

    public void confirm() {
        //TODO: Add order for order file
    }
}
