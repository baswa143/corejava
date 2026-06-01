package com.example.daoimpl;

import com.example.Entity.EmployeeEntity;
import com.example.constants.Appconstants;
import com.example.dao.EmployeeDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

    @Override
    public EmployeeEntity fetchEmployeeById(Integer empno) {
        EntityManager entityManager= factory.createEntityManager();
        TypedQuery<EmployeeEntity> tq=entityManager.createQuery(Appconstants.QUERY1, EmployeeEntity.class);
        tq.setParameter(1,empno);
        EmployeeEntity e=tq.getSingleResult();
        entityManager.close();
        return e;
    }

    @Override
    public List<EmployeeEntity> fetchEmployees() {
        EntityManager entityManager= factory.createEntityManager();
        TypedQuery<EmployeeEntity>tq=entityManager.createQuery(Appconstants.QUERY2, EmployeeEntity.class);
        List<EmployeeEntity> lstOfEmp=tq.getResultList();
        entityManager.close();
        return lstOfEmp;
    }

    @Override
    public List<Object[]> fetchNamesAndSalary() {
        EntityManager entityManager= factory.createEntityManager();
        TypedQuery<Object[]>tq=entityManager.createQuery(Appconstants.QUERY3, Object[].class);
        List<Object[]> lst=tq.getResultList();
        entityManager.close();
        return lst;
    }
}
