class Employee {
    String name = "Prajwal";
    int salary = 50000;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {
    String name = "Manager";

    void showDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Employee Name: " + super.name);
        System.out.println("Employee Salary: " + super.salary);

        super.display();
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showDetails();
    }
    
}
