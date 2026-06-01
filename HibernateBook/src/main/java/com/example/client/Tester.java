package com.example.client;

import com.example.dao.BookDAO;
import com.example.daoimpl.BookDAOImpl;
import com.example.entity.BookEntity;

public class Tester {
    public static void main(String[] args) {
        BookDAO dao = new BookDAOImpl();

        BookEntity book=new BookEntity();
        book.setBookId(04);
        book.setBookName("DataScience");
        book.setBookPrice(1000.0);
        dao.saveBook(book);

        BookEntity b= dao.saveBook(book);
        System.out.println(b);

        BookEntity b1= dao.loadBook(1);
        System.out.println(b1);

        BookEntity b2=dao.updateBook(03,150.0);
        System.out.println(b2);
        dao.deleteBook(01);
    }
}
