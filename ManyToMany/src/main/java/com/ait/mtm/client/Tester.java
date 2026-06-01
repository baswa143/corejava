package com.ait.mtm.client;

import com.ait.mtm.dao.BookDAO;
import com.ait.mtm.dao.BookDAOImpl;
import com.ait.mtm.entities.Author;
import com.ait.mtm.entities.Book;

import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        BookDAO dao = new BookDAOImpl();

        //Book Instances
      /*  Book book1= new Book();
        book1.setBookId(10101); book1.setBookName("JAVA");

        Book book2 = new Book();
        book2.setBookId(10102); book2.setBookName("Spring");

        //author Instances
        Author a1=new Author();
        a1.setAuthorId(20201); a1.setAuthorName("Garden");

        Author a2=new Author();
        a2.setAuthorId(20202); a2.setAuthorName("Shiva");

        Author a3=new Author();
        a3.setAuthorId(20203); a3.setAuthorName("Rushi");

        List<Author> list_of_authors_of_book1= Arrays.asList(a1,a2);
        book1.setAuthors(list_of_authors_of_book1);

        List<Author> list_of_authors_of_book2=Arrays.asList(a1,a2,a3);
        book2.setAuthors(list_of_authors_of_book2);

        dao.saveBook(book1);
        dao.saveBook(book2);

       */
        // findbook
//        Book tbl_book_author = dao.findBook(10101);
//        System.out.println(tbl_book_author.getBookId());
//        System.out.println(tbl_book_author.getBookName());
//        List<Author> authors = tbl_book_author.getAuthors();
//        authors.forEach(System.out::println);

        //remove
        dao.removeBook(10101);

    }
}
