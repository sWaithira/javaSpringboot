
public class ArithmeticOps {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println(" ARITHMETIC: ");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n RELATIONAL: ");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a >  b : " + (a > b));
        System.out.println("a <  b : " + (a < b));

        System.out.println("\n LOGICAL: ");
        boolean isAdult = true, hasID = false;
        System.out.println("isAdult && hasID : " + (isAdult && hasID));
        System.out.println("isAdult hasID : " + (isAdult || hasID));
        System.out.println("!isAdult: " + (!isAdult));
    }
}
