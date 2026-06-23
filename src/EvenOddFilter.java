public class EvenOddFilter {
    public static void main(String[] args) {
        System.out.println("CONTINUE: Print only even numbers ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i + " is even");
        }

        System.out.println("\n BREAK: Stop at first multiple of 7 ");
        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) {
                System.out.println("Found multiple of 7: " + i + " — stopping!");
                break;
            }
            System.out.println("Checking " + i + "...");
        }
    }
}