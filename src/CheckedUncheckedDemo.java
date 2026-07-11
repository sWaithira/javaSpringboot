class FileNotFoundException extends Exception {
    public FileNotFoundException(String filename) {
        super("File not found: " + filename);
    }
}

class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(int number) {
        super("Number cannot be negative: " + number);
    }
}

public class CheckedUncheckedDemo {

    // CHECKED - declare 'throws' or surround caller with try-catch
    static void openFile(String filename) throws FileNotFoundException {
        if (filename == null || filename.isEmpty()) {
            throw new FileNotFoundException(filename);
        }
        System.out.println("Opened file: " + filename);
    }

    // UNCHECKED — no 'throws' needed
    static void squareRoot(int number) {
        if (number < 0) {
            throw new NegativeNumberException(number);
        }
        System.out.println("Square root of " + number + " = " + Math.sqrt(number));
    }

    public static void main(String[] args) {

        System.out.println("Checked exception");
        try {
            openFile("data.txt");
            openFile("");
        } catch (FileNotFoundException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Unchecked exception");
        try {
            squareRoot(25);
            squareRoot(-4);
        } catch (NegativeNumberException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Common built-in unchecked exceptions");
        try { int x = 5 / 0; }
        catch (ArithmeticException e)        { System.out.println("ArithmeticException: " + e.getMessage()); }

        try { String s = null; s.length(); }
        catch (NullPointerException e)       { System.out.println("NullPointerException caught"); }

        try { int[] arr = new int[3]; arr[10] = 1; }
        catch (ArrayIndexOutOfBoundsException e) { System.out.println("ArrayIndexOutOfBounds caught"); }

        try { int n = Integer.parseInt("abc"); }
        catch (NumberFormatException e)      { System.out.println("NumberFormatException: " + e.getMessage()); }
    }
}