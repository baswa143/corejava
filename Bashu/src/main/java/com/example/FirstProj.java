package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/welcome")
public class FirstProj extends HttpServlet {

    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {

       PrintWriter pw = res.getWriter();
       pw.append("<h1>Welcome to First Project</h1>");
    }
}
