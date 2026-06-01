package com.ait.mtm.dao;

import com.ait.mtm.entities.Book;

import javax.persistence.criteria.CriteriaBuilder;

public interface BookDAO {
    void saveBook(Book book);
    Book findBook(Integer bookId);
    void removeBook(Integer bookId);
}
