import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddStudent {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        Scanner sc = new Scanner(System.in);

        Connection con = DBConnection.getConnection();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        String sql = "INSERT INTO students(name, marks) VALUES(?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, name);
        ps.setInt(2, marks);

        int result = ps.executeUpdate();

        if (result > 0) {
            System.out.println("Student data inserted successfully!");
        } else {
            System.out.println("Student data insertion failed.");
        }

        sc.close();
        con.close();
    }
}