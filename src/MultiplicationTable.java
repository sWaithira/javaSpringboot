public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7;
        System.out.println(" Multiplication Table of " + number + " : ");

        for (int i = 1; i <= 7; i++) {
            System.out.printf("%2d x %2d = %3d%n", number, i, number * i);
        }

        // Nested for loop - print a pattern
        System.out.println("\n Star Pattern ");
        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}