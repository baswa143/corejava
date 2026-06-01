package com.example.daoImpl;

import com.example.dao.EmpDAO;
import com.example.entity.EmployeeEntity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class EmpDAOImpl implements EmpDAO {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
    @Override
    public List<EmployeeEntity> executeNamedQuery(int deptNumber) {
        EntityManager entityManager=factory.createEntityManager();
        TypedQuery tq=entityManager.createNamedQuery("query1", EmployeeEntity.class);
        tq.setParameter(1,deptNumber);
        List lst= tq.getResultList();
        entityManager.close();
        return lst;
    }

    @Override
    public List executeNamedNativeQuery(int sal) {
        EntityManager entityManager=factory.createEntityManager();
        Query q=entityManager.createNamedQuery("query2");
        q.setParameter(1,sal);
        List lst=q.getResultList();
        entityManager.close();
        return lst;
    }

    @Override
    public List<EmployeeEntity> executeCriteriaQuery() {
        EntityManager entityManager=factory.createEntityManager();
        CriteriaBuilder cb=entityManager.getCriteriaBuilder();
        CriteriaQuery<EmployeeEntity> q=cb.createQuery(EmployeeEntity.class);
        Root<EmployeeEntity>r=q.from(EmployeeEntity.class);
            q.select(r).where(cb.gt(r.get("empSalary"),3000));
        Query query =entityManager.createQuery(q);
        List<EmployeeEntity>lst=query.getResultList();
        return lst;
    }

    @Override
    public void insertEmployeeEntity(EmployeeEntity emp) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        em.persist(emp);
        tx.commit();
        em.close();
    }



}
