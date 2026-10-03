import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No to update: ");
        int rollNo = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter new Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter new Marks: ");
        double marks = scanner.nextDouble();

        String sql = "UPDATE student SET name = ?, course = ?, marks = ? " +
                     "WHERE roll_no = ?";

        try (Connection con = DatabaseConnStudent.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, name);
            pst.setString(2, course);
            pst.setDouble(3, marks);
            pst.setInt(4, rollNo);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student record updated successfully!");
            }
            else {
                System.out.println("No student found with Roll No " + rollNo + ".");
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