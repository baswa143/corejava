package project1;

import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ProcedureCall {

    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String user="root";
    private static final String password="Baswaraj@143";
    private static final String PROCEDURE="call getbooksData()";

    public static void main(String[] args)throws Exception {
        Connection con= DriverManager.getConnection(url,user,password);
        CallableStatement cst=con.prepareCall(PROCEDURE);
        ResultSet rs = cst.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt(1)+">>"+rs.getString(2)+">>"+ rs.getDouble(3));
        }
        con.close();
    }
}
