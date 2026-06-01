package com.example.dao;

import com.example.entity.EmployeeEntity;

import java.util.List;

public interface EmpDAO {
    List<EmployeeEntity> executeNamedQuery(int deptNumber);
    List executeNamedNativeQuery(int sal);
    List<EmployeeEntity> executeCriteriaQuery();
    void insertEmployeeEntity (EmployeeEntity emp);
}
