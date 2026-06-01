package com.example.book;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {

    private static final String Insert_sql="insert into books value(?,?,?)";
    public boolean saveBook(int bookId, String bookName, double price) throws SQLException, IOException {
        Connection con= ConnectionFactory.getConnection();
        PreparedStatement pst= con.prepareStatement(Insert_sql);
        pst.setInt(1, bookId);
        pst.setString(2,bookName);
        pst.setDouble(3,price);

        int count =pst.executeUpdate();

        con.close();
        return count>0 ;
    }

}
