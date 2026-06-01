package register.connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryRegister {
    private static  DataSource ds=null;
public static Connection getConnection() throws SQLException {
    if(ds==null){
        HikariConfig regConfig = new HikariConfig();
        regConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        regConfig.setJdbcUrl("jdbc:mysql://localhost:3306/dashboard");
        regConfig.setUsername("root");
        regConfig.setPassword("Baswaraj@143");
        ds=new HikariDataSource(regConfig);
    }

    return ds.getConnection();
}

}
