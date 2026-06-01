package com.example.client;

import com.example.Entity.EmployeeEntity;
import com.example.dao.EmployeeDAO;
import com.example.daoimpl.EmployeeDAOImpl;

public class Tester {
    public static void main(String[] args) {
        EmployeeDAO dao=new EmployeeDAOImpl();
        EmployeeEntity emp=new EmployeeEntity();

        EmployeeEntity em=dao.fetchEmployeeById(101);
        System.out.println(em);

    }
}
