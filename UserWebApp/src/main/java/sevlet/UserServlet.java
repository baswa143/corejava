package sevlet;

import connection.DAO.UserDAO;
import connection.dto.UserDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        //capture from data
        try {

        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String phno=req.getParameter("phno");
        //set form data to userdto object for transfer
        UserDTO user =new UserDTO();
        user.setUserName(name);
        user.setUserEmail(email);
        user.setUserPhno(Integer.parseInt(phno));
        //call dao method
        UserDAO dao=new UserDAO();
            boolean isSaved= dao.saveUser(user);

            String msg =null;
            if(isSaved){
                msg="user saved";
            }
            else {
                msg = "user not saved";
            }
            req.setAttribute("msg", msg);
            req.getRequestDispatcher("/user.html").forward(req,resp);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
