class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

class SavingsAccount {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds!");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: KES " + balance);
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(1000);

        try {
            System.out.println("Attempting to withdraw KES 500...");
            account.withdraw(500);

            System.out.println();

            System.out.println("Attempting to withdraw KES 700...");
            account.withdraw(700);

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues normally.");
    }
}