package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchEmp {
    private static final String Url ="jdbc:mysql://localhost:3306/company";
    private static final String user = "root";
    private  static final String password = "Baswaraj@143";
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dept:: ");
        String Dept = sc.next();
        System.out.println("Enter Loc::");
        String loc=sc.next();
        System.out.println("Enter Gender");
        String gender=sc.next();
        StringBuilder query =new StringBuilder("select* from Emp where 1=1 ") ;
        if(Dept!=null && !Dept.equals("null")){
            query.append(" AND emp_dept=? ");
        }

        if(loc!=null && !loc.equals("null")){
           query.append(" AND emp_work_location=? ");
        }

        if(gender!=null && !gender.equals("null")){
            query.append(" AND emp_gender=? ");
        }

        Connection con =DriverManager.getConnection(Url,user,password);
        PreparedStatement pst = con.prepareStatement(query.toString());
        int index=1;
        if(Dept!=null &&!Dept.equals("null")){
            pst.setString(index,Dept);
            index++;
        }
        if(loc!=null && !loc.equals("null")){
            pst.setString(index,loc);
            index++;
        }
        if(gender!=null && !gender.equals("null")){
            pst.setString(index,gender);
        }

        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + ">>" + rs.getString(2) + ">>" + rs.getInt(3) + ">>"
                    + rs.getString(4) + ">>" + rs.getString(5) + ">>" + rs.getString(6));
        }
        con.close();
    }
}
