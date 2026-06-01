package register;

import register.connection.RegisterDAO;
import register.connection.RegisterDTO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
       try {
           String fName=req.getParameter("FName");
           String lName=req.getParameter("LName");
           String email=req.getParameter("EMail");
           String pwd=req.getParameter("Password");
           String  gender=req.getParameter("gender");

           RegisterDTO rdto=new RegisterDTO();
           rdto.setfName(fName);
           rdto.setlName(lName);
           rdto.seteMail(email);
           rdto.setPassword(pwd);
           rdto.setGender(gender);

           RegisterDAO rdao=new RegisterDAO();
           boolean status=rdao.saveRegister(rdto);
           String response;
           if(status){
               resp.sendRedirect("Login.html");
           }
           else {
               resp.getWriter().println("<h1>login failed</h1>");
           }

       }
       catch (Exception e){
           e.printStackTrace();
       }

    }

}
