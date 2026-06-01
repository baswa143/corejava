package com.example.client;

import com.example.dao.EmployeeDAO;
import com.example.daoImpl.EmployeeDAOImpl;
import com.example.entity.EmployeeEntity;

public class Tester {
    public static void main(String[] args) {

        EmployeeDAO dao=new EmployeeDAOImpl();
        EmployeeEntity empl=new EmployeeEntity();
        empl.setEmployeeId(103);
        empl.setEmployeeName("sakshi patil");
        empl.setEmployeeSal(165000.0);
        dao.saveEmployee(empl);


    }
}
