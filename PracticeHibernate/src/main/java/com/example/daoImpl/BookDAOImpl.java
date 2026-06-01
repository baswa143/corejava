package com.example.daoImpl;

import com.example.Entity.BookEntity;
import com.example.dao.BookDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookDAOImpl implements BookDAO {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
    @Override
    public void saveBook(BookEntity book) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        try {
            em.persist(book);
            tx.commit();
            System.out.println("book is persisted in database");
        }
        catch (Exception e){
            tx.rollback();
            e.printStackTrace();
            System.out.println("book is not persisted in database");
        }
        finally {
            em.close();
        }

    }
}
