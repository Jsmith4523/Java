import Users.*;
import java.util.*;
import BankHolder.*;

public class ATM {

    static User[] users;
    static BankHolder[] bankHolders;

    static Scanner sncr = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    public static void atmSoftware() {
        System.out.print("Welcome to the ATM. Please type in your creditials:");
    }

    public static Boolean isAvaliableUser(String name, String passcode) {
        for(User usr: users) {
            if (usr.passcode.equals(passcode) && usr.name.equals(name)) {
                return true;
            }
        }

        for(BankHolder bankHdr: bankHolders) {
            if((bankHdr.passcode.equals(passcode))) {
                return true;
            }
        }


        return false;
    }
}