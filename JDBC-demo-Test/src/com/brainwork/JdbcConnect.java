package com.brainwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcConnect {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("jdbc  driver configured");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Baswaraj@143");
        System.out.println("connection created successfully");
         final String mySQL_QUERY="insert into student values(102,'virat',15,639104324";
        PreparedStatement statement=connection.prepareStatement(mySQL_QUERY);
        statement.executeUpdate(); // insert ,update, delete --->executeUpdate---->int


    }

}
