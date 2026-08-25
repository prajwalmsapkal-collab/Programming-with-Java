import student.Student;
import faculty.Faculty;

public class CollegeManagement {
    public static void main(String[] args) {

        Student s1 = new Student("Prajwal", 101, "Computer Science");

        Faculty f1 = new Faculty("Dr. Sharma", "Java Programming", 501);

        s1.displayStudent();

        System.out.println();

        f1.displayFaculty();
    }
}