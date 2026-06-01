package com.example.dao;

import com.example.Entity.EmployeeEntity;

import java.util.List;

public interface EmployeeDAO {
    EmployeeEntity fetchEmployeeById(Integer empno);
    List<EmployeeEntity> fetchEmployees();
    List<Object[]> fetchNamesAndSalary();
}
