class Employee {
    // Private data members (hidden from outside)
    private String name;
    private double salary;

    // Public getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Adam");
        emp.setSalary(50000);

        System.out.println(emp.getName() + " earns ₹ " + emp.getSalary());
    }
}