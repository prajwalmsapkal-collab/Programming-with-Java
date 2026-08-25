package faculty;

public class Faculty {
    String name;
    String subject;
    int facultyId;

    public Faculty(String name, String subject, int facultyId) {
        this.name = name;
        this.subject = subject;
        this.facultyId = facultyId;
    }

    public void displayFaculty() {
        System.out.println("Faculty Details");
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Faculty ID: " + facultyId);
    }
}