import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayStudents {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM students";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        System.out.println("ID\tName\tMarks");
        System.out.println("------------------------");

        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + "\t" +
                rs.getString("name") + "\t" +
                rs.getInt("marks")
            );
        }

        con.close();
    }
}