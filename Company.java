// Parent Class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

// Manager subclass
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

// Developer subclass
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main Class
public class Company {
    public static void main(String[] args) {

        Manager m = new Manager("Dikson Myaz", 90000, "HR");
        Developer d = new Developer("Dil Doe", 80000, "Java");

        m.displayManager();
        System.out.println();
        d.displayDeveloper();
    }
}
