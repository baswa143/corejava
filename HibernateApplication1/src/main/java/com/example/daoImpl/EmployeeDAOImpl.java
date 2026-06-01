package com.example.daoImpl;

import com.example.dao.EmployeeDAO;
import com.example.entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.*;

public class EmployeeDAOImpl implements EmployeeDAO {
    private EntityManagerFactory factory= Persistence.createEntityManagerFactory("emp");
    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employee) {
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction tx=entityManager.getTransaction();
        tx.begin();
        try {
            entityManager.persist(employee);
            tx.commit();
            System.out.println("successfully inserted the database");
        }
        catch (Exception ex){
            tx.rollback();
            System.out.println("not inserted in database");
        }
        finally {
            entityManager.close();
        }

        return employee;
    }

    @Override
    public EmployeeEntity loadEmployeeById(Integer employeeId) {
        EntityManager em=factory.createEntityManager();
        EmployeeEntity e=em.find(EmployeeEntity.class, employeeId);
        return e;
    }

    @Override
    public EmployeeEntity uploadEmployeeById(Integer employeeId, Double employeeSal) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        EmployeeEntity e=em.find(EmployeeEntity.class, employeeId);
        e.setEmployeeSal(employeeSal);
        tx.commit();
        em.close();
        return e;
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
      EntityManager em=factory.createEntityManager();
      EntityTransaction tx= em.getTransaction();
      tx.begin();
      EmployeeEntity e=em.find(EmployeeEntity.class,employeeId);
      em.remove(e);
      tx.commit();
      em.close();


    }
}
