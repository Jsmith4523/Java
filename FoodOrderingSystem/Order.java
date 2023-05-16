package FoodOrderingSystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import java.time.LocalDate;
import java.time.LocalTime;

public class Order {

    private LocalDate orderDate;
    private LocalTime orderTime;

    private int id;
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

        System.out.println("\n****"+food.name()+" has been added****\n");
    }

    public Boolean hasNoFood() {
        return foods.isEmpty();
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

                System.out.println("\n****"+food.name()+" quantity has been updated****\n");
                break;
            }
        }

        if (!isAlreadyIncluded) {
            this.addToOrder(food);
        }
    }

    public void showDetailsOfOrder() {
        Scanner input = new Scanner(System.in);

        for(Food food: foods) {
            food.showDetailsAsOrder();
        }

        System.out.printf("The total of this order is: $%.2f\n\n", this.totalAmount());

        System.out.println("Would you like to put in this order? Y or N");

        char decision = ' ';

        while(decision != 'Y' && decision != 'N') {
            try {
                decision = input.next().charAt(0);

                if (decision == 'Y') {
                    submitOrderToPrinter();
                } else if (decision == 'N') {
                    resetOrder();
                    System.out.println("Thank you! Come again!");
                } else {
                    throw new Exception("That is an invalid input!\n\n");
                }
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
                showDetailsOfOrder();
            }
        }
    }

    private void submitOrderToPrinter() {
        try  {
            this.orderDate = LocalDate.now();
            this.orderTime = LocalTime.now();

            this.id += 1;

            KitchenPrinter.addOrderToList(this);

            System.out.println("Thank you! Your order number is "+id);
        } catch (Exception e) {
            System.out.println("We were unable to submit your order. Please try again another time.");
        }
    }

    public String stringOrderDetails() {
         String orderDetails = """
            Order #: %d
            ---------------------
            Quantity: %d
            Total: $%.2f

            FOOD
            
            """;

        String orderDetailsFormatted = String.format(orderDetails, id, this.foods.size(), this.totalAmount());

        return orderDetailsFormatted;
    }

    private void resetOrder() {
        foods.clear();
    }
}
