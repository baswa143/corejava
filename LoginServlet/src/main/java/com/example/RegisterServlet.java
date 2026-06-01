package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp){

        String username= req.getParameter("username");
        String password= req.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Baswaraj@143");
            String InsertSQL ="insert into login(username,password) values(?,?)";
            PreparedStatement pst=con.prepareStatement(InsertSQL);
            pst.setString(1,username);
            pst.setString(2,password);

            int i = pst.executeUpdate();
            if(i>0)
            {
                resp.getWriter().println("<h1>Registered successfully</h1>");
            }
            else {
                resp.getWriter().println("not Registered");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
