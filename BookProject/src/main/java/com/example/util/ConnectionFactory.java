package com.example.util;

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
//        Path path=Path.of("dbconfig.properties");
//
//        Files.createFile(path );
        if(ds==null) {
//            File file = new File("db.properties");
//            FileInputStream pst = new FileInputStream(file);
//            Properties p = new Properties();
//            p.load(pst);
//            String url = p.getProperty("db.url");
//            String password = p.getProperty("db.username");
//            String username = p.getProperty("db.password");
            HikariConfig config = new HikariConfig();
            config.setDriverClassName("com.mysql.cj.jdbc.Driver");
            config.setJdbcUrl("jdbc:mysql://localhost:3306/college");
            config.setUsername("root");
            config.setPassword("Baswaraj@143");
            ds = new HikariDataSource(config);

        }
        return ds.getConnection();

    }

}
