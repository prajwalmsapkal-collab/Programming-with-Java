import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        String sql = "INSERT INTO employee " +
                     "(emp_id, emp_name, department, salary) " +
                     "VALUES (?, ?, ?, ?)";

        try (Connection con = DBManipulation.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, empId);
            pst.setString(2, name);
            pst.setString(3, department);
            pst.setDouble(4, salary);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Employee record inserted successfully!");
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