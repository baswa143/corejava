package com.ait.dao;

import com.ait.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class EmpDAO   {

@Autowired
    private HibernateTemplate hibernateTemplate;


    public void saveEmp(Employee emp){
        hibernateTemplate.save(emp);//dialect will convert into HQLx
    }

}
