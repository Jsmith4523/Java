package FoodOrderingSystem;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//This class is responsible for printing orders to the text file...

public class KitchenPrinter {

    private static String source = "./FoodOrderingSystem/KitchenOrderList.txt";
    private static String countSource = "./FoodOrderingSystem/OrderListCount.txt";
    
    public Order[] getCurrentOrder() {

        Order[] orders =  {
            
        };

        return orders;
    }

    static void addOrderToList(Order order) throws Exception {
        FileOutputStream fileStream = new FileOutputStream(source, true);
        PrintWriter orderFs = new PrintWriter(fileStream);

        orderFs.println(order.stringOrderDetails());
        orderFs.close();
    }

    public static int getNextOrderID() throws Exception {
        char nextOrderID = 1;

        FileInputStream file = new FileInputStream(source);
        Scanner reader = new Scanner(file);

        try {
            int previousId = reader.nextInt();
            nextOrderID += previousId;
        } catch (Exception e) {
            //If there is no previous order, do nothing...
        }
        
        return nextOrderID;
    }
}
