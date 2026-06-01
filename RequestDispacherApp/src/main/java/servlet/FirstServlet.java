package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        RequestDispatcher rd = req.getRequestDispatcher("/second");
       // rd.forward(req,resp);
        rd.include(req,resp);
        PrintWriter pw = resp.getWriter();
        pw.append("<h1>well come to FirstServlet</h1>");
    }
}
