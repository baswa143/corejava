package project1;

import java.sql.*;
import java.util.Scanner;


public class DynamicSelectBooks {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price: ");
        double price = sc.nextDouble();

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Baswaraj@143");
        StringBuilder sb = new StringBuilder("select * from books");
        if (price > 0) {
            sb.append(" where books_price <= ?");
           // sb.append(" where books_price <= ?");
        }
        PreparedStatement pst = con.prepareStatement(sb.toString());
        if (price > 0) {
            pst.setDouble(1, price);
        }
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + ">>>>" + rs.getString(2) + ">>>" + rs.getDouble(3));
        }
        con.close();

    }
}
