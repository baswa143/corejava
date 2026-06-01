package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


//“@Embeddable is used to create a reusable class whose fields are
// stored as columns in the parent entity table.”
//Real-Life Example
//
//👉 Suppose you have:
//
//Employee
//Address
//
//👉 Instead of creating a separate table for Address ❌
//You can embed it inside Employee✅
@Embeddable
public class StudentCompositeKey implements Serializable {
    @Column(name = "RollNo")
    private Integer rollNo;

    @Column(name = "Section")
    private String section;

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
