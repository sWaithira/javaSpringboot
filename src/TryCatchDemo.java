public class TryCatchDemo {
    public static void main(String[] args) {

        // Basic try-catch
        System.out.println("Basic try-catch");
        try {
            int result = 10 / 0;          // throws ArithmeticException
            System.out.println(result);   // never reached
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println();

        //catch
        System.out.println("Multiple catch blocks");
        String[] names = {"Alice", null, "Susan"};
        for (String name : names) {
            try {
                System.out.println(name.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("Caught null value by skipping");
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
        System.out.println();

        // finally
        System.out.println("finally block");
        try {
            int[] arr = new int[3];
            arr[10] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: index out of bounds");
        } finally {
            System.out.println("finally always runs — cleanup here");
        }
        System.out.println();

        // try-with-resources
        System.out.println("try-with-resources");
        try {
            int num = Integer.parseInt("NOT_A_NUMBER");
        } catch (NumberFormatException e) {
            System.out.println("Caught: invalid number format");
        } finally {
            System.out.println("Resources released");
        }
    }
}