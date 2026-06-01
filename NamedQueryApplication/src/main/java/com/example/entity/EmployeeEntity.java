package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "emp")
@NamedQuery(name = "query1",query = "FROM EmployeeEntity e WHERE e.deptNumber=?1")
@NamedNativeQuery (name = "query2",query = "select * from emp  where EmpSal  > ?",resultClass=EmployeeEntity.class)
public class EmployeeEntity {
    @Id
    @Column(name = "EmpNo")
    private Integer empNumber;

    @Column(name = "EmpName")
    private String empName;

    @Column(name = "EmpSal")
    private Double empSalary;

    @Column(name = "EmpDept")
    private Integer deptNumber;

    public Integer getEmpNumber() {
        return empNumber;
    }
    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "empNumber=" + empNumber +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", deptNumber=" + deptNumber +
                '}';
    }

    public void setEmpNumber(Integer empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public Integer getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(Integer deptNumber) {
        this.deptNumber = deptNumber;
    }
}
