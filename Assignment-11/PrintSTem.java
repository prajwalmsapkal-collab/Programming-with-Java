interface Printable {
    void printDetails();
}

class Student implements Printable {
    String name;
    int rollNo;
    String course;

    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void printDetails() {
        System.out.println("Student Details");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Course  : " + course);
    }
}

class Employee implements Printable {
    String name;
    int empId;
    double salary;

    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Employee Details");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + empId);
        System.out.println("Salary : " + salary);
    }
}

public class PrintSTem {
    public static void main(String[] args) {

        Printable p1 = new Student("Prajwal", 101, "Computer Science");
        Printable p2 = new Employee("Adi", 501, 45000);

        p1.printDetails();
        System.out.println();

        p2.printDetails();
    }
}