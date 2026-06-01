package com.example.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {
    private static final String Insert_sql= "insert into book values(?,?,?)";
    public boolean saveBook(BookDTO dto) throws SQLException, IOException {
        Connection con =ConnectionFactory.getConnection();
        PreparedStatement pst = con.prepareStatement(Insert_sql);
        pst.setInt(1,dto.getBookId());
        pst.setString(2,dto.getBookName());
        pst.setDouble(3, dto.getBookPrice());

        int count=pst.executeUpdate();
        con.close();

        return count>0;


    }

}
