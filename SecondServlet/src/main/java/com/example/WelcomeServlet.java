package com.example;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;




//@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException {
        //set the content
       resp.setContentType("text/html");

       // printwriter
        PrintWriter pw =resp.getWriter();

        //current hour
        int hour= LocalTime.now().getHour();

        String message = "";
        //condition
        if(hour>=6 && hour<12){
            message = "Good Morning";
        }

        else if (hour>=12 && hour<16) {
            message = "Good Afternoon";
        }

        else if (hour>=16 && hour<20) {
            message ="Good Evening";
        }
        else if (hour>=20 && hour<5) {
            message="Good night";
        }
        pw.append("<html><body>");
       pw.append("<h1>"+message+"</h1>");
        pw.append("</html></body>");

    }

}
