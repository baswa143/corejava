package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class User {
    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USER ="root";
    private static final String password = "Baswaraj@143";
    public static void main(String []args) throws Exception{
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection conn = getConnection(URL,USER,password);
//        Statement stmt = conn.createStatement();
//        String query = "CREATE  TABLE product("+
//                "id int primary key,"+"Name varchar(20),"
//                +"Price int)";
//        stmt.executeUpdate( query);
//        System.out.println("Table created successfully");

//        update();
        set();
        delete();
//        conn.close();



    }
    public static void update() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = getConnection(URL,USER,password);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("insert into product values(2,'chocolate',200),(3,'bottle',120)");
        System.out.println("Table updated successfully");
        conn.close();


    }

    public static void set() throws Exception{
        Connection con=DriverManager.getConnection(URL,USER,password);
        Statement stmt=con.createStatement();
        stmt.executeUpdate("update product set price=4000 where id=1");
        System.out.println("Table updated successfully");
    }
    public static void  delete() throws Exception{
        Connection con=DriverManager.getConnection(URL,USER,password);
        Statement stmt=con.createStatement();
        stmt.executeUpdate("delete from product where id=1");
        System.out.println("Table deleted successfully");

    }


}
