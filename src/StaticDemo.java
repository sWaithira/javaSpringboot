public class StaticDemo {

    static int objectCount = 0;
    static final double PI = 3.14159;

    String name;

    public StaticDemo(String name) {
        this.name = name;
        objectCount++;
    }

    static void showCount() {
        System.out.println("Objects created: " + objectCount);
    }

    void greet() {
        System.out.println("Hello from " + name);
    }

    public static void main(String[] args) {

        System.out.println("Before creating any objects");
        StaticDemo.showCount();
        System.out.println("PI = " + PI);
        System.out.println();

        System.out.println("Creating three objects");
        StaticDemo a = new StaticDemo("Alice");
        StaticDemo b = new StaticDemo("Bob");
        StaticDemo c = new StaticDemo("Susan");
        a.greet();
        b.greet();
        c.greet();
        System.out.println();

        System.out.println("After creating three objects");
        StaticDemo.showCount();
    }
}