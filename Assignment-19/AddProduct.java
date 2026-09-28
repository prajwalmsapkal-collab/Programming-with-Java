import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddProduct {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        Scanner sc = new Scanner(System.in);

        Connection con = DBConnection.getConnection();

        System.out.print("Enter product ID: ");
        int productID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter price: ");
        int price = sc.nextInt();

        String sql = "INSERT INTO products(productID, name, qty, price) VALUES(?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, productID);
        ps.setString(2, name);
        ps.setInt(3, qty);
        ps.setInt(4, price);

        int result = ps.executeUpdate();

        if (result > 0) {
            System.out.println("Product data inserted successfully!");
        } else {
            System.out.println("Product data insertion failed.");
        }

        sc.close();
        con.close();
    }
}