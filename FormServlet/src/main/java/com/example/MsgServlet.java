package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/msg")
public class MsgServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String bookId = req.getParameter("BookId");
        String bookName = req.getParameter("BookName");
        String bookPrice = req.getParameter("BookPrice");

        System.out.println(bookId);
        System.out.println(bookName);
        System.out.println(bookPrice);



        PrintWriter pw= resp.getWriter();
        pw.append("Form submitted");
    }

}
