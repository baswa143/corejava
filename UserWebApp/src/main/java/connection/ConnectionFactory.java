package connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    private static DataSource ds=null;
    public static Connection getConnection() throws SQLException {
        Connection con=null;
        try {
            if(ds==null){
                HikariConfig hiLogin=new HikariConfig();
                hiLogin.setDriverClassName("com.mysql.cj.jdbc.Driver");
                hiLogin.setJdbcUrl("jdbc:mysql://localhost:3306/project");
                hiLogin.setUsername("root");
                hiLogin.setPassword("Baswaraj@143");

                ds=new HikariDataSource(hiLogin);

            }
            con= ds.getConnection();
        }
        catch (Exception e){
            e.printStackTrace();
        }
       return con;
    }
}
