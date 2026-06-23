public static class Product {
    private String name;
    private double price;
    private int stock;

    public Product() {
        this.name  = "Unknown";
        this.price = 0.0;
        this.stock = 0;
        System.out.println("Default product created");
    }

    public Product(String name, double price, int stock) {
        this.name  = name;
        this.price = price;
        this.stock = stock;
        System.out.println("Product created: " + name);
    }

    public Product(Product other) {
        this.name  = other.name + " (copy)";
        this.price = other.price;
        this.stock = other.stock;
        System.out.println("Copied: " + this.name);
    }

    public void display() {
        System.out.printf("%-15s KES %7.2f | Stock: %d%n", name, price, stock);
    }
}

    public static void main(String[] args) {
      // hello world
        Product p1 = new Product();
        Product p2 = new Product("Laptop", 85000, 12);
        Product p3 = new Product(p2);

        System.out.println("\n Catalogue ");
        p1.display();
        p2.display();
        p3.display();
    }