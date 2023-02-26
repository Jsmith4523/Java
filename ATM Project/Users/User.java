
static User[] users;

public class User {

    private String name;
    private String passcode;
    private String phoneNumber;
    private String email;
    private double balance;
    private double pocketCash;

    public User(String name, String, String passcode, String phoneNumber, String email, double balance) {
        this.name        = name;
        this.phoneNumber = phoneNumber;
        this.passcode    = passcode;
        this.email       = email;
        this.balance     = balance;
    }

    public void getCurrentInformation() {
        System.out.println("Here's your current information: ");
        System.out.println("Name: "+);
        System.out.println("Email: "+this.email);
        System.out.println("Phone number: "+this.phoneNumber);
    }

    public private void updateBalance() {
        System.out.println("Your NEW balance is $"+this.balance);
        System.out.println("Your pocket cash is $"+this.pocketCash)
    }

    public void withdraw(double reqBalance) {
        if (this.balance < reqBalance) {
            System.out.println("Your request is over your current balance of $"+this.balance);
        } 
        else if (this.pocketCash < reqBalance) {
            System.out.println("You are not carrying that amount of cash!");
        }
        else {
            this.pocketCash += reqBalance;
            this.balance -= reqBalance;
            this.updateBalance();
        }
    }

    public void deposit(double amount) {
        if (this.pocketCash < amount) {
            System.out.println("You are not carrying that amount of cash!");
        } else {
            this.pocketCash -= amount;
            this.balance += amount;
            this.getCurrentBalanceWithGreeting();
        }
    }

    public void getCurrentBalanceWithGreeting() {
        System.out.println("Hi "+this.name+", your current balance is $"+balance);
    }
}