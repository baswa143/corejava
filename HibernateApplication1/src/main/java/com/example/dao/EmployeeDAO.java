package com.example.dao;

import com.example.entity.EmployeeEntity;

public interface EmployeeDAO {
EmployeeEntity saveEmployee(EmployeeEntity employee);
EmployeeEntity loadEmployeeById(Integer employeeId);
EmployeeEntity uploadEmployeeById(Integer employeeId,Double employeeSal);
void deleteEmployeeById(Integer employeeId);
}
