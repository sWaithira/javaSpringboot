class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(String owner, double initialBalance) {
        this.owner   = owner;
        this.balance = (initialBalance >= 0) ? initialBalance : 0;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited KES " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew KES " + amount);
        } else {
            System.out.println("Cannot withdraw KES " + amount);
        }
    }

    public void printStatement() {
        System.out.println("Owner: " + owner);
        System.out.printf("Balance: KES %.2f%n", balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("SUSAN", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(9999);
        acc.printStatement();
    }
}