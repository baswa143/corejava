package com.example.servlet;

import com.example.book.BookDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/bookservlet")
public class BookServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       try{
           System.out.println("Servlet called!");
           String id = req.getParameter("bookId");
           String name = req.getParameter("bookName");
           String price = req.getParameter("bookPrice");

           int bookId = Integer.parseInt(id);
           double bookPrice=Double.parseDouble(price);

           BookDAO dao = new BookDAO();
           boolean status= dao.saveBook(bookId,name,bookPrice);


           String response = null;
           if (status){
               response = "Record Inserted";
           }
           else {
               response = "Record not Inserted";
           }
           PrintWriter pw = resp.getWriter();
           pw.append(response);
       }
       catch (Exception e){
           e.printStackTrace();
       }
    }

}
