package com.ait.test;

import com.ait.entity.DemoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("test");
        EntityManager em=factory.createEntityManager();

        DemoEntity demo = new DemoEntity();
        demo.setName("Sh4iva");

        EntityTransaction tx= em.getTransaction();
        tx.begin();
        em.persist(demo);
        tx.commit();
        em.close();
        factory.close();
    }
}
