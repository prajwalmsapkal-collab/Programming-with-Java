class Student {

    String name;
    int rollNo;

    Student() {
        name = "Unknown";
        rollNo = 0;
    }

    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Prajwal", 101);

        System.out.println("Default Constructor Output:");
        s1.display();

        System.out.println();

        System.out.println("Parameterized Constructor Output:");
        s2.display();
    }
}