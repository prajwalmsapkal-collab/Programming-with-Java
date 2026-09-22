import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayProducts {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM products";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        System.out.println("Product ID\tName\t\tQuantity\tPrice");
        System.out.println("-----");

        while (rs.next()) {
            System.out.println(
                rs.getInt("productID") + "\t\t" +
                rs.getString("name") + "\t\t" +
                rs.getInt("qty") + "\t\t" +
                rs.getInt("price")
            );
        }

        con.close();
    }
}