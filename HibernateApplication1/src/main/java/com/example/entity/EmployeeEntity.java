package com.example.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Tbl_Employee")
public class EmployeeEntity {
    @Id
    @Column(name = "Employee_Id")
    private Integer employeeId;

    @Column(name = "Employee_Name")
    private String employeeName;

    @Column(name = "Employee_sal")
    private Double employeeSal;

    @Column(name = "Created_On")
    @CreationTimestamp
    private LocalDateTime createdOn;

    @Column(name = "Update_On")
    @UpdateTimestamp
    private LocalDateTime updatedOn;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getEmployeeSal() {
        return employeeSal;
    }

    public void setEmployeeSal(Double employeeSal) {
        this.employeeSal = employeeSal;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }
}
