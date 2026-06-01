package com.example.dao;

import com.example.entity.CategoryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CategoryDAOImpl implements CategoryDAO
{
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

    @Override
    public void saveCategory(CategoryEntity entity) {
        EntityManager em= factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        try {
            em.persist(entity);
            tx.commit();
            System.out.println("Category eith product is persisted into database");

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
    public CategoryEntity fetchCategory(Integer categoryId) {
        EntityManager em= factory.createEntityManager();
        CategoryEntity entity=em.find(CategoryEntity.class,categoryId);
        em.close();

        return entity;
    }

    @Override
    public void removeCategory(Integer categoryId) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        CategoryEntity entity=em.find(CategoryEntity.class,categoryId);
        tx.begin();
        try {
            em.remove(categoryId);
            tx.commit();
            System.out.println("Category is removed from the database successfully");
        }
        catch (Exception e){
            tx.rollback();
            e.printStackTrace();
        }


    }
}
