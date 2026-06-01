package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InBook {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/data";
    private static final String DB_UNAME="root";
    private static final String DB_PASSWORD="Baswaraj@143";
    private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES(101,'JAVA',1000)";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Step1:-    class driver

    Class.forName("com.mysql.cj.jdbc.Driver");

    //step 2 : Get DB Connection

        Connection con=DriverManager.getConnection(DB_URL,DB_UNAME,DB_PASSWORD);
        System.out.println(con);

        //Step3:  Create a statement

        Statement st=con.createStatement();

        //step4: Execute Query
        int rowsEffected =st.executeUpdate(INSERT_SQL);

        //step5: process result

        System.out.println("Record Inserted count ::"+ rowsEffected);

        // step6: close connection
        con.close();


    }
}


//TO run the above program we need to set the build path for mysql connect for jar
//because mysql driver class will available in jar file

//if need to connect with oracle path we need to set build path for jar file
//because