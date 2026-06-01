package com.ait.mtm.dao;

import com.ait.mtm.entities.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookDAOImpl implements BookDAO{
    private EntityManagerFactory factory= Persistence.createEntityManagerFactory("test");

    @Override
    public void saveBook(Book book) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        try {
            em.merge(book);
            tx.commit();
            System.out.println("Book is inserted ............");
        }
        catch (Exception e){
            tx.rollback();
            e.printStackTrace();
        }
        finally {
            em.close();
        }

    }

    @Override
    public Book findBook(Integer bookId) {
        EntityManager em=factory.createEntityManager();
        Book book= em.find(Book.class, bookId);
        em.close();
        return book;
    }

    @Override
    public void removeBook(Integer bookId) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        try {
            Book book =em.find(Book.class,bookId);
            em.remove(book);
            tx.commit();
            System.out.println("book is deleted.....");
        }
        catch (Exception e){
            tx.rollback();
            e.printStackTrace();
        }
        finally {
            em.close();
        }

    }
}
