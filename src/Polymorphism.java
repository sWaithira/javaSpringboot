
class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public void makeSound() {
        System.out.println(name + " makes a generic sound");
    }
    public void describe() {
        System.out.print(name + " says: ");
        makeSound();
    }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
    @Override
    public void makeSound() { System.out.println("Woof! Woof!"); }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }
    @Override
    public void makeSound() { System.out.println("Meow"); }
}

class Cow extends Animal {
    public Cow(String name) { super(name); }
    @Override
    public void makeSound() { System.out.println("Moooo!"); }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal[] farm = {
                new Dog("Bosko"),
                new Cat("Whiskers"),
                new Cow("Rex"),
                new Dog("Buddy")
        };

        System.out.println(" Farm Sounds ");
        for (Animal a : farm) {
            a.describe();
        }
    }
}