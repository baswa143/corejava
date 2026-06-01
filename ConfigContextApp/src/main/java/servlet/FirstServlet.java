package servlet;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletConfig config= getServletConfig();
        String msg= config.getInitParameter("msg1");
        PrintWriter pw=resp.getWriter();
        ServletContext context= getServletContext();
        String website=context.getInitParameter("website");
        pw.append("<h1>"+msg+"--"+website+"</h1>");
    }


}
