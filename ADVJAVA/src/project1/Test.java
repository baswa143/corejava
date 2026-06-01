package project1;

import java.io.IOException;
import java.sql.*;

class Test {
    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USer = "root";
    private static final String password="Baswaraj@143";
    private static final String SELECt_SQL = "select from books_id,books_Name,books_Price from books";

    public static  void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(URL,USer,password);
        DatabaseMetaData metaData =con.getMetaData();
        System.out.println(metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
        Statement st=con.createStatement();
        ResultSet rs = st.executeQuery(SELECt_SQL);
        System.in.read();
        System.in.read();
        rs.refreshRow();
        while(rs.next()){

            System.out.println(rs.getInt(1)+">>>>>"+rs.getString(2)+">>>>>"+rs.getInt(3));

        }
        con.close();
    }
}