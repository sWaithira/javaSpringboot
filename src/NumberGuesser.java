import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {
    public static void main(String[] args) {
        Random rand    = new Random();
        int secret     = rand.nextInt(10) + 1;
        Scanner sc     = new Scanner(System.in);
        int guess      = 0;
        int attempts   = 0;

        System.out.println("Guess a number between 1 and 10!");

        while (guess != secret) {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            }
        }

        System.out.println("Correct! Took you " + attempts + " attempt(s).");
    }
}
