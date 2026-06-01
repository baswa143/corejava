package com.example.dao;

import com.example.entity.BookEntity;

public interface BookDAO {
    BookEntity saveBook(BookEntity book);
    BookEntity loadBook(Integer bookId);
    BookEntity updateBook(Integer bookId,Double bookPrice);
   void deleteBook(Integer bookId);
}
