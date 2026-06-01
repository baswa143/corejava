package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchOper {
    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String user="root";
    private static final String password="Baswaraj@143";


    public static void main(String[] args)throws Exception {
        Connection con= DriverManager.getConnection(url,user,password);
        Statement st=con.createStatement();

        st.addBatch("insert into books values(1,'AI',4000)");
        st.addBatch("insert into books values(2,'DataBase',2000)");
        st.addBatch("insert into books values(3,'DataSCience',1000)");

        int  []count=st.executeBatch();
        for(int i:count){
            System.out.println(i);
        }
        System.out.println("updated successfully");
        con.close();
    }
}
