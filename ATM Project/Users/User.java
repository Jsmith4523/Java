package Users;

public class User {

    public String name;
    public String passcode;
    public String phoneNumber;
    public String email;
    public double balance;
    public double pocketCash;

    public User(String name, String passcode, String phoneNumber, String email, double balance) {
        this.name        = name;
        this.phoneNumber = phoneNumber;
        this.passcode    = passcode;
        this.email       = email;
        this.balance     = balance;
        this.pocketCash  = 200.00;
    }

    public void getCurrentInformation() {
        System.out.println("Here's your current information: ");
        System.out.println("Name: "+this.name);
        System.out.println("Email: "+this.email);
        System.out.println("Phone number: "+this.phoneNumber);
    }

   private void updateBalance() {
        System.out.println("Your NEW balance is $"+this.balance);
        System.out.println("Your pocket cash is $"+this.pocketCash);
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