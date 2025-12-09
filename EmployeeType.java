// Parent class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to be overridden
    double calculateBonus() {
        return 0;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("--------------------");
    }
}

// Child class - Permanent Employee
class PermanentEmployee extends Employee {

    PermanentEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; // 20% bonus
    }
}

// Child class - Contractual Employee
class ContractualEmployee extends Employee {

    ContractualEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }
}

// Main class
public class EmployeeType {
    public static void main(String[] args) {

        // Polymorphism: parent reference, child objects
        Employee emp1 = new PermanentEmployee("Soumya", 50000);
        Employee emp2 = new ContractualEmployee("Suman", 40000);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}