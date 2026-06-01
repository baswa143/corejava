package com.example.dao;

import com.example.entity.StudentCompositeKey;
import com.example.entity.StudentEntity;

public interface StudentDAO {
    void saveStudent(StudentEntity entity);
    StudentEntity fetchStudent(StudentCompositeKey compositeKey);
}
