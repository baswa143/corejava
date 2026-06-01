package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "emp")
@NamedStoredProcedureQuery(
        name = "pro1",
        procedureName = "EMP_EXPERIENCE",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN,type = Integer.class, name = "EmpNo"),
                @StoredProcedureParameter(mode = ParameterMode.OUT,type = String.class, name = "NAME"),
                @StoredProcedureParameter(mode = ParameterMode.OUT,type = Double.class, name = "EXPERIENCE")

        }

)
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
