package project1;

import java.sql.*;
import java.util.Scanner;

public class EmpHike {
    private static  final String url="jdbc:mysql://localhost:3306/company";
    private static final String user="root";
    private static final String password="Baswaraj@143";
    private static final String select_sql="select * from Emp";


    public static void main(String[] args)throws Exception {
        Scanner sc =new Scanner(System.in);
        Double hike=sc.nextDouble();
        Connection con = DriverManager.getConnection(url,user,password);
        Statement st=con.createStatement();
        String Update_sal_sql = "update Emp set emp_salary=? where emp_id=?";
        PreparedStatement pst=con.prepareStatement(Update_sal_sql);

        ResultSet rs= st.executeQuery(select_sql);
        while (rs.next()){
            int empId = rs.getInt("emp_id");
            double Existing_sal=rs.getDouble("emp_salary");
            double new_sal=Existing_sal+(Existing_sal*hike)/100;
            pst.setDouble(1,new_sal);
            pst.setInt(2, empId);
            pst.executeUpdate();
        }
        System.out.println("updated succesfully....");
        con.close();
    }
}



class AA{
    private static final String url="jdbc:mysql://localhost:3306/company";
    private static final String user="root";
    private static final String password="Baswaraj@143";
    private static final String SELECT_SQL="select * from Emp";

    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter Hike:: ");
        double hike=sc.nextDouble();
        Connection con= DriverManager.getConnection(url,user,password);
        Statement st=con.createStatement();
        String Update_sql="update Emp set emp_salary=? where emp_id=?00";
        PreparedStatement pst= con.prepareStatement(Update_sql);
        ResultSet rs =st.executeQuery(SELECT_SQL);
        while (rs.next()){
            int emp_ID= rs.getInt("emp_id");
            double existing_sal= rs.getDouble("emp_salary");
            double new_Sal=existing_sal+(existing_sal*10)/100;
            pst.setDouble(1,new_Sal);
            pst.setInt(2,emp_ID);
            pst.executeUpdate();

        }
        System.out.println("Updated successfully...");

        con.close();
    }

}
