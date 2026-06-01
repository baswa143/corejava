package login.connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryLogin {
   private static DataSource ds=null;
public static Connection getConnection() throws SQLException {
   if(ds==null){
       HikariConfig hiLogin=new HikariConfig();
       hiLogin.setDriverClassName("com.mysql.cj.jdbc.Driver");
       hiLogin.setJdbcUrl("jdbc:mysql://localhost:3306/dashboard");
       hiLogin.setUsername("root");
       hiLogin.setPassword("Baswaraj@143");

       ds=new HikariDataSource(hiLogin);

   }
    return ds.getConnection();


}

}
