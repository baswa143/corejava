package com.ait.oto.dao.impl;

import com.ait.oto.dao.PersonDAO;
import com.ait.oto.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDAOImpl implements PersonDAO {
    private EntityManagerFactory factory= Persistence.createEntityManagerFactory("test");
    @Override
    public void savePerson(Person person) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        try {
            em.persist(person);
            tx.commit();
            System.out.println("person is persisted in database.....");
        }
        catch (Exception e){
            tx.rollback();
            e.printStackTrace();
            System.out.println("not inserted in the database");
        }
        finally {
            em.close();
        }

    }

    @Override
    public Person fetchPersonById(Integer personId) {
        EntityManager em= factory.createEntityManager();
        Person person=em.find(Person.class, personId);
        em.close();
        return person;
    }

    @Override
    public void removePerson(Integer personId) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        try {
            Person person=em.find(Person.class,personId);
            em.remove(person);
            tx.commit();
            System.out.println("deleted successfully");
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
