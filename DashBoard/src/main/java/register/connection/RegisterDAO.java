package register.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;

public class RegisterDAO {
    public static final String INSERT_SQL="INSERT INTO register values(?,?,?,?,?)";
    public boolean saveRegister(RegisterDTO rdto) throws SQLException {
        Connection con= ConnectionFactoryRegister.getConnection();
        PreparedStatement pst=con.prepareStatement(INSERT_SQL);
        pst.setString(1,rdto.getfName());
        pst.setString(2, rdto.getlName());
        pst.setString(3, rdto.geteMail());
        pst.setString(4, rdto.getPassword());
        pst.setString(5,rdto.getGender());

        int count= pst.executeUpdate();
        return count>0;
    }

}
