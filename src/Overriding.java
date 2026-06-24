
class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }

    public void printPayslip() {
        System.out.printf("%-15s  Type: %-12s  Pay: KES %.2f%n",
                name, getClass().getSimpleName(), calculatePay());
    }
}

class FullTimeEmployee extends Employee {
    private double bonus;
    public FullTimeEmployee(String name, double salary, double bonus) {
        super(name, salary); this.bonus = bonus;
    }
    @Override
    public double calculatePay() {
        return baseSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name, int hours, double rate) {
        super(name, 0); this.hoursWorked = hours; this.hourlyRate = rate;
    }
    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

public class Overriding {
    public static void main(String[] args) {
        Employee[] staff = {
                new FullTimeEmployee("Alice", 50000, 5000),
                new PartTimeEmployee("Bob", 80, 300),
                new Employee("Temp", 20000)
        };
        System.out.println(" Monthly Payroll ");
        for (Employee e : staff) e.printPayslip();
    }
}