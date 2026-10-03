
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID to update: ");
        int empId = scanner.nextInt();

        System.out.print("Enter new salary: ");
        double salary = scanner.nextDouble();

        String sql = "UPDATE employee SET salary = ? WHERE emp_id = ?";

        try (Connection con = DBManipulation.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setDouble(1, salary);
            pst.setInt(2, empId);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Employee record updated successfully!");
            }
            else {
                System.out.println("No employee found with ID " + empId + ".");
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