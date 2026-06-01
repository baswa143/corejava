import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/data";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Baswaraj@143";
    private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES(102,'PYTHON',2000)";
    public static void main(String[] args) throws Exception {
        //class Loader
        Class.forName("com.mysql.cj.jdbc.Driver");

        //DB Connection
        Connection con= DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        // create statement
        Statement st = con.createStatement();
        //execute query
        int rowsEffected =st.executeUpdate(INSERT_SQL);
        //process result
        System.out.println("Inserted count"+rowsEffected);
        // close
        con.close();
    }
}
