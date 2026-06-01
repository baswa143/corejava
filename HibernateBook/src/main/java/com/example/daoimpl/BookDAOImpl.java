package com.example.daoimpl;

import com.example.dao.BookDAO;
import com.example.entity.BookEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookDAOImpl implements BookDAO {
    private EntityManagerFactory factory= Persistence.createEntityManagerFactory("book");
    @Override
    public BookEntity saveBook(BookEntity book) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        try {
            em.persist(book);
            tx.commit();
            System.out.println("successfully inserted in database");

        }
        catch (Exception ex){
            tx.rollback();
            System.out.println("Not inserted in database");
        }
        return book;
    }

    @Override
    public BookEntity loadBook(Integer bookId) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        BookEntity b=em.find(BookEntity.class,bookId);
        if(b!=null){
            tx.commit();
        }
        em.close();

        return b;
    }

    @Override
    public BookEntity updateBook(Integer bookId, Double bookPrice) {
        EntityManager entityManager=factory.createEntityManager();
        EntityTransaction tx=entityManager.getTransaction();
        tx.begin();
        BookEntity b=entityManager.find(BookEntity.class, bookId);
        b.setBookPrice(bookPrice);
        if(b!=null){
            tx.commit();
        }
        entityManager.close();
        return b;
    }

    @Override
    public void deleteBook(Integer bookId) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        BookEntity b=em.find(BookEntity.class,bookId);
        if(b!=null){
            em.remove(b);
            System.out.println("successfully deleted ");
        }
        else {
            System.out.println("book is not deleted");
        }
        tx.commit();
        em.close();

    }
}
