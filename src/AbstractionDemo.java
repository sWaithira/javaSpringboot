

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();

    public void display() {
        System.out.printf("Shape: %-10s Color: %-8s Area: %7.2f  Perimeter: %.2f%n",
                getClass().getSimpleName(), color, area(), perimeter());
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color); this.radius = radius;
    }
    @Override public double area()      { return Math.PI * radius * radius; }
    @Override public double perimeter() { return 2 * Math.PI * radius; }
}

class Rectangle extends Shape {
    private double w, h;
    public Rectangle(String color, double w, double h) {
        super(color); this.w = w; this.h = h;
    }
    @Override public double area()      { return w * h; }
    @Override public double perimeter() { return 2 * (w + h); }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Red", 5),
                new Rectangle("Blue", 4, 6)
        };
        System.out.println(" Shape Report ");
        for (Shape s : shapes) {
            s.display();
        }
    }
}