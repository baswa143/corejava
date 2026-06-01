package com.in.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@WebServlet("/addvehicle")
public class Vehicle extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price= Double.parseDouble(request.getParameter("price"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle",
                    "root",
                    "Baswaraj@143");
            PreparedStatement pst = con.prepareStatement("insert into car(id,name,price) values(?,?,?)");
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setDouble(3,price);
            int result = pst.executeUpdate();
            if(result>0){
                response.getWriter().println("<h1>car details inserted successfully</h1>");
            }
            else {
                response.getWriter().println("<h1>Details not inserted </h1>");
            }
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
response.getWriter().println("<h1>Error :"+e.getMessage()+"</h1>");
        }
    }
}
