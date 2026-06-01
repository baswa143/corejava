package com.example.client;

import com.example.dao.EmpDAO;
import com.example.daoImpl.EmpDAOImpl;
import com.example.entity.EmployeeEntity;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        EmpDAO dao=new EmpDAOImpl();
        List<EmployeeEntity>lst=dao.executeNamedQuery(20);
        lst.forEach(System.out::println);

        List lst1=dao.executeNamedNativeQuery(2000);
        lst1.forEach(System.out::println);

        List<EmployeeEntity>lst2=dao.executeCriteriaQuery();
        lst2.forEach(System.out::println);

        EmployeeEntity entity=new EmployeeEntity();
        entity.setEmpNumber(102);
        entity.setDeptNumber(21);
        entity.setEmpName("vaibhav");
        entity.setEmpSalary(2000000.0);

        dao.insertEmployeeEntity(entity);
    }
}
