package com.example.servlet;



import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@javax.servlet.annotation.WebServlet("/index")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "Baswaraj@143"
            );

            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO login(username, password) VALUES (?, ?)"
            );

            ps.setString(1, username);
            ps.setString(2, password);

            int i = ps.executeUpdate();

            if (i > 0) {
                response.getWriter().println("User Registered Successfully");
            } else {
                response.getWriter().println("Failed");
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

