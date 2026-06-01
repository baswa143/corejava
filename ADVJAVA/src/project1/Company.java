package project1;

import java.sql.*;

public class Company {
    private static final String url="jdbc:mysql://localhost:3306/company";
    private static final String user="root";
    private static final String password="Baswaraj@143";
    private static final String Emp_Insert ="insert into Employee values(?,?,?)";
    private static final String Emp_Add_Insert ="insert into Address values(?,?,?,?)";
    public static void main(String[] args) throws Exception {
        Connection con= DriverManager.getConnection(url,user,password);

        con.setAutoCommit(false);
       try {
           PreparedStatement pst = con.prepareStatement(Emp_Insert);
           pst.setInt(1, 102);
           pst.setString(2, "shiva");
           pst.setDouble(3, 10000);
           pst.executeUpdate();
           pst = con.prepareStatement(Emp_Add_Insert);
           pst.setString(1, "PUNE");
           pst.setString(2, "MH");
           pst.setString(3, "india");
           pst.setInt(4, 102);
           pst.executeUpdate();
           con.commit();
           System.out.println("Record Inserted ");
       }
       catch (Exception e){
           System.out.println("not recorded");
                con.rollback();
       }
        //ResultSet rs= pst.executeQuery();

        con.close();


    }
}
