package FoodOrderingSystem;

import java.util.*;

public class Food {

    private int id;
    private String name;
    private Double price;
    public  OrderDetail detail; 

    public Food(String name, Double price) {
        this.name  = name;
        this.price = price;
    }

    public void setOrderID(int id) {
        //We're setting the id later so that the Order can properly add/remove based off the current size of the array
        this.id = id;
    }
    
    public void details() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Price: $%.2f\n", price);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    public void showDetailsAsOrder() {

        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Quantity: x"+detail.quantity);
        System.out.printf("Name: %s\n", name);
        System.out.printf("Price: $%.2f\n", getPrice());
        System.out.printf("Instructions: %s\n\n", detail.instructions);
    }

    public double getPrice() {
        return this.detail.quantity * price;
    }

    public Boolean nameMatches(String name) {
        return this.name.equalsIgnoreCase(name);
    }

    public String name() {
        return this.name;
    }

    public int getID() {
        return this.id;
    }

    public void setupForOrder() {
        if (this.detail == null) {
            this.detail = new OrderDetail();
        }
    }

    public class OrderDetail {
        private int quantity;
        private String instructions;

        public OrderDetail() {
            this.quantity = 1;
        }

        public void specialInstructions(Scanner inputScanner) {
            if (this.instructions.isEmpty()) {
                Scanner input = inputScanner;
    
                System.out.println("Enter special instructions for the "+name+":");
                
                this.instructions = input.nextLine();
            }
        }

        public void updateQuantity(Order order, int quantity) {
            Scanner input = new Scanner(System.in);
            int requestedQuantity = 0;

            System.out.println("How many of this item do you want? \n Currently, you have "+quantity+":");

            try {
                requestedQuantity = input.nextInt();
            } catch(Exception e) {
                System.out.println("That is an invalid quantity!");
                //Exiting back out...
                return;
            }

            if (requestedQuantity < 0) {
                System.out.println("That is a invalid quantity!");
            }
            else if (requestedQuantity == 0) {
                removeFromOrder(order);
            } else {
                
            }
        }

        private void removeFromOrder(Order order) {
            System.out.println("Removing from order...");
            order.removeFromOrder(id);
        }

        public int getQuantity() {
            return this.quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}

