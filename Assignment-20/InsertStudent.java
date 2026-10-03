import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        String sql = "INSERT INTO student " +
                     "(roll_no, name, course, marks) " +
                     "VALUES (?, ?, ?, ?)";

        try (Connection con = DatabaseConnStudent.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, rollNo);
            pst.setString(2, name);
            pst.setString(3, course);
            pst.setDouble(4, marks);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student record inserted successfully!");
            }

        }
        catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }
        catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}