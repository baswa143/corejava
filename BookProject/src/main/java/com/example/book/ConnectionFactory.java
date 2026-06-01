package com.example.book;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static DataSource ds=null;
    public static Connection getConnection() throws SQLException, IOException {
if (ds==null){
    FileInputStream fis =new FileInputStream(new File("dbconfig.properties"));

    Properties p = new Properties();
    p.load(fis);
    String url =p.getProperty("db.url");
    String uname = p.getProperty("db.username");
    String pwd=p.getProperty("db.password");
    HikariConfig config = new HikariConfig();
    config.setJdbcUrl(url);
    config.setUsername(uname);
    config.setPassword(pwd);

    ds = new HikariDataSource(config);
}

        Connection con= ds.getConnection();

        return con;

    }

}
