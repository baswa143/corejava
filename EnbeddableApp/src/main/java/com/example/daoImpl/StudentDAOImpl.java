package com.example.daoImpl;

import com.example.dao.StudentDAO;
import com.example.entity.StudentCompositeKey;
import com.example.entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDAOImpl implements StudentDAO {
    private EntityManagerFactory factory= Persistence.createEntityManagerFactory("test");
    @Override
    public void saveStudent(StudentEntity entity) {
        EntityManager entityManager=factory.createEntityManager();
        EntityTransaction tx=entityManager.getTransaction();
        tx.begin();
        try {
            entityManager.persist(entity);
            tx.commit();
            System.out.println("successfully persisted in database");
        }
        catch (Exception ex){
            tx.rollback();
            System.out.println("Issue in persisting StudentEntity: "+ex);
        }
        finally {

            entityManager.close();
        }

    }

    @Override
    public StudentEntity fetchStudent(StudentCompositeKey compositeKey) {
        EntityManager entityManager=factory.createEntityManager();
        StudentEntity entity=entityManager.find(StudentEntity.class, compositeKey);
        entityManager.close();
        return entity;
    }
}
