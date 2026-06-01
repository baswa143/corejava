package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/msg")
public class MsgServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
       // String name = request.getParameter("name");
        String bookId = req.getParameter("BookId");
        String bookName = req.getParameter("BookName");
        String bookPrice = req.getParameter("BookPrice");

        System.out.println(bookId);
        System.out.println(bookName);
        System.out.println(bookPrice);



        PrintWriter pw= response.getWriter();
        pw.append("Form submitted");

//        PrintWriter pw=response.getWriter();
//        pw.append(name+"<h1> Good morning</h1>");
    }

}
