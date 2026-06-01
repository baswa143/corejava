package com.example.client;

import com.example.Entity.BookEntity;
import com.example.dao.BookDAO;
import com.example.daoImpl.BookDAOImpl;

public class Tester {
    public static void main(String[] args) {
        BookDAO dao=new BookDAOImpl();

        BookEntity entity=new BookEntity();
        entity.setBookId(101);
        entity.setBookName("java");
        entity.setBookPrice(2000.0);

        dao.saveBook(entity);
    }
}
