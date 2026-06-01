package login;

import login.connection.LoginDAO;
import login.connection.LoginDTO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
       try{
           String email=req.getParameter("EMail");
           String password=req.getParameter("Password");

           LoginDTO ldto=new LoginDTO();
           ldto.setEmail(email);
           ldto.setPassword(password);

           LoginDAO ldao = new LoginDAO();
           boolean status=ldao.saveLogin(ldto);
           String response;
           if(status){
//               resp.sendRedirect("Register.html");
               resp.sendRedirect("Logout.html");
           }
           else {
               resp.getWriter().println("<h1>Login Failed</h1>");
           }



       }
       catch (Exception e){
           e.printStackTrace();
       }
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter writer=response.getWriter();
        writer.append("<h1>successfully submitted</h1>");

    }


}
