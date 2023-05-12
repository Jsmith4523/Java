package FoodOrderingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderSystem {

    public static void main(String[] args) {
        Order order = new Order();
        order = startPointOfSale();
        showOrder(order);
    }

    ///Menu of foods offered by the shop
    static final Food[] menu = {
        new Food("Pizza", 3.00),
        new Food("Soda", 0.75),
        new Food("Hamburger", 5.00),
        new Food("Salad", 2.75),
        new Food("Corndog", 1.75),
        new Food("Water", 0.99),
        new Food("Hotdog", 1.99),
        new Food("Tuna Sandwich", 5.00)
    }; 

    public static Order startPointOfSale() {
        Scanner input;
        int i;
        Order order = new Order();

        System.out.println("Weclome to Maryland's Pizza and Subs!\nHere is our menu:\n");
        presentMenu();

        for(i = 0; i < 5; i++) {
            int foodNum;
            System.out.println("What would you like to eat?");;
            input = new Scanner(System.in);

             try {
                Food food;
                foodNum = input.nextInt();
                food = menu[foodNum];

                food.setupForOrder();
                //food.detail.specialInstructions(input);
                order.add(food);
             } catch(Exception e) {
                 System.out.println("Sorry, we don't have that item");
                
                 if (i != 0) {
                     //Retrying the submission...
                     i -= 1;
                 }
             }
        }

        return order;
    }

    private static void showOrder(Order order) {
        System.out.println("Here's your current order: \n");
        order.showDetailsOfOrder();

        
    }

    private static void presentMenu() {
        for(int i = 0; i < menu.length; i++) {
            System.out.println(i+1+")");
            menu[i].details();
        }
    } 
}
