package FoodOrderingSystem;

import java.util.*;

public class Food {

    private int id;
    private String name;
    private Double price;
    private OrderDetail detail; 

    public Food(String name, Double price) {
        this.name  = name;
        this.price = price;
    }

    public void setOrderID(int id) {
        //We're setting the id later so that the Order can properly add/remove based off the current size of the array
        this.id = id;
    }
    
    public void details() {
        //TODO: Print details of this object!
    }

    public double getPrice() {
        return price;
    }

    private class OrderDetail {
        private int quantity;
        private String instructions;

        public OrderDetail() {
            this.quantity = 1;
        }

        public void specialInstructions() {
            Scanner input = new Scanner(System.in);
    
            System.out.println("Enter special instructions for the "+name+":");
            
            this.instructions = input.nextLine();
        }

        public void updateQuantity(Order order, int quantity) {
            Scanner input = new Scanner(System.in);
            
            int requestedQuantity;

            System.out.println("How many of this item do you want? \n Currently, you have "+quantity+":");

            if (quantity == 0) {

            }
        }

        private void removeFromOrder(Order order) {
            System.out.println("Removing from order...");
            order.removeFromOrder(id);
        }
    }
}
