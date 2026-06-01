package com.ait.service;

import com.ait.dao.EmpDAO;
import com.ait.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
@Autowired
    private EmpDAO empDao;

    public void saveEmployee(Employee emp){
        empDao.saveEmp(emp);
    }

}
