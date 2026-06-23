public class Calculator {

    public int add(int a, int b) {
        System.out.println("add(int, int)");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("add(double, double)");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("add(int, int, int)");
        return a + b + c;
    }

    public String add(String a, String b) {
        System.out.println("add(String, String) — concatenation");
        return a + b;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Result: " + calc.add(5, 3));
        System.out.println("Result: " + calc.add(5.5, 2.3));
        System.out.println("Result: " + calc.add(1, 2, 3));
        System.out.println("Result: " + calc.add("Hello ", "SUSAN!"));
    }
}
