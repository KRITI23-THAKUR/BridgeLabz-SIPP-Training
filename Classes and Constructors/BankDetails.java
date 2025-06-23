import java.util.Scanner;

class BankAccount {
 // Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
  // Method to display details
    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class BankDetails {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = inp.nextLine();

        System.out.print("Enter account number: ");
        String accNo = inp.nextLine();

        System.out.print("Enter initial balance: ");
        double bal = inp.nextDouble();

        BankAccount account = new BankAccount(name, accNo, bal);

        account.deposit(1000);
        account.withdraw(500);
        account.displayBalance();

        inp.close();
    }
}
