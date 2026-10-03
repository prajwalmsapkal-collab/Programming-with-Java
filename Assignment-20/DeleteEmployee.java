

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID to delete: ");
        int empId = scanner.nextInt();

        String sql = "DELETE FROM employee WHERE emp_id = ?";

        try (Connection con = DBManipulation.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, empId);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println(
                    "Employee record deleted successfully!"
                );
            }
            else {
                System.out.println(
                    "No employee found with ID " + empId + "."
                );
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