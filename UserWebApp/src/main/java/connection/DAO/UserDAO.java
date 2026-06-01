package connection.DAO;

import connection.ConnectionFactory;
import connection.dto.UserDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static final String INSERT_SQL="insert into user_details values(?,?,?,?)";

    private static final String SELECT_SQL="select*from user_details";

    public boolean saveUser(UserDTO dto) throws SQLException {
        boolean isSaved=false;
        try {

            Connection con= ConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement(INSERT_SQL);
            pst.setString(1, dto.getUserName());
            pst.setString(2, dto.getUserEmail());
            pst.setInt(3,dto.getUserPhno());

            int cnt= pst.executeUpdate();
            if (cnt>0){
                isSaved=true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return isSaved;
    }
//using this  getUsers() getUsers() retrieving the data
    public List<UserDTO> getUsers(){
        List<UserDTO> users = new ArrayList<UserDTO>();
        try{
            Connection con = ConnectionFactory.getConnection();
            Statement stm= con.createStatement();
            ResultSet rs=stm.executeQuery(INSERT_SQL);
            while (rs.next()){
              UserDTO user =new UserDTO();
              user.setUserId(rs.getInt("user_id"));
              user.setUserName(rs.getString("user_name"));
              user.setUserEmail(rs.getString("user_mail"));
              user.setUserPhno(rs.getInt("user_phno"));

              //add each user obj to collection
              users.add(user);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }



}
