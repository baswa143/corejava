package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Account {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "roots","Baswaraj@143");
        PreparedStatement pst = con.prepareStatement("create a table Account()");
    }
}
