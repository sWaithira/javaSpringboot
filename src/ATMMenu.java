import java.util.Scanner;

public class ATMMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 15000.00;
        int choice;

        do {
            System.out.println("\nATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Balance: KES %.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Amount to deposit: ");
                    balance += sc.nextDouble();
                    System.out.println("Deposited!");
                    break;
                case 3:
                    System.out.print("Amount to withdraw: ");
                    double amt = sc.nextDouble();
                    if (amt <= balance) { balance -= amt; System.out.println("Dispensing cash..."); }
                    else                { System.out.println("Insufficient funds."); }
                    break;
                case 4:
                    System.out.println("Goodbye!"); break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }
}