package FoodOrderingSystem;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;


//This class is responsible for printing orders to the text file...

public class KitchenPrinter {

    private static FileOutputStream fileStream = null;
    private static PrintWriter outFs = null;
    
    public Order[] getCurrentOrder() {

        Order[] orders =  {
            
        };

        return orders;
    }

    static void addOrderToList(Order order) throws Exception {
        fileStream = new FileOutputStream("./FoodOrderingSystem/KitchenOrderList.txt", true);
        outFs = new PrintWriter(fileStream);

        
    }
}
