package com.ait.entity.test;

import com.ait.entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

        EntityManager em= factory.createEntityManager();
        EntityManager em1=factory.createEntityManager();

        EmployeeEntity emp1=em.find(EmployeeEntity.class,9988);

        System.out.println("=================================================");

        EmployeeEntity emp2=em1.find(EmployeeEntity.class, 9988);

        System.out.println("=================================================");

        EmployeeEntity emp3=em.find(EmployeeEntity.class, 9898);

        System.out.println("=================================================");

        EmployeeEntity emp4 = em.find(EmployeeEntity.class,9898);

        em.close();
        em1.close();
        factory.close();


    }
}
