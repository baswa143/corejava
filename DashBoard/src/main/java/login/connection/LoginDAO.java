package login.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAO {
public static final String INSERT_SQL = "INSERT INTO login values(?,?)";
public boolean saveLogin(LoginDTO ldto) throws SQLException {
    Connection con= ConnectionFactoryLogin.getConnection();
    PreparedStatement pst=con.prepareStatement(INSERT_SQL);
    pst.setString(1,"Email");
    pst.setString(2,"Password");

    int count = pst.executeUpdate();
    return count>0;

}
}
