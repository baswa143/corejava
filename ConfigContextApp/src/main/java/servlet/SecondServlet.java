package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        ServletConfig config= getServletConfig();

        String msg= config.getInitParameter("msg2");

        ServletContext context= getServletContext();
        String website=context.getInitParameter("website");

        PrintWriter pw=resp.getWriter();
        pw.append("<h1>"+msg+"--"+website+"</h1>");
    }


}
