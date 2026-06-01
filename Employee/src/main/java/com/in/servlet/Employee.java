package com.in.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@WebServlet("/addEmployee")
public class Employee extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double salary = Double.parseDouble(request.getParameter("salary"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "Baswaraj@143"
            );

            String insertSQL =
                    "insert into employee(emp1_id,emp1_name,emp1_salary) values(?,?,?)";

            PreparedStatement pst = con.prepareStatement(insertSQL);

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setDouble(3, salary);

            int i = pst.executeUpdate();

            if (i > 0) {
                response.getWriter().println("<h1>Employee Inserted Successfully</h1>");
            } else {
                response.getWriter().println("<h1>Employee Not Inserted</h1>");
            }

            pst.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.getWriter().println("<h1>Error : " + e.getMessage() + "</h1>");
        }
    }
}