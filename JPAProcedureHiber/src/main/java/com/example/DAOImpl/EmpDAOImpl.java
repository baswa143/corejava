package com.example.DAOImpl;

import com.example.dao.EmpDAO;
import org.hibernate.Transaction;

import javax.persistence.*;

public class EmpDAOImpl implements EmpDAO {

    private EntityManagerFactory factory= Persistence.createEntityManagerFactory("test");
    @Override
    public void executeProcedure(int empno) {
        EntityManager em=factory.createEntityManager();
        StoredProcedureQuery spq= em.createStoredProcedureQuery("pro1");
        spq.setParameter("EmpNo",empno);
        EntityTransaction t= em.getTransaction();
        t.begin();
        spq.execute();
        String str=(String) spq.getOutputParameterValue("NAME");
        Double d=(Double) spq.getOutputParameterValue("Experience");
        System.out.println("Name : "+str);
        System.out.println("Experience: "+d);
        t.commit();
        em.close();
        factory.close();

    }
}
