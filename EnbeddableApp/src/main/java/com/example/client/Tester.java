package com.example.client;

import com.example.dao.StudentDAO;
import com.example.daoImpl.StudentDAOImpl;
import com.example.entity.StudentCompositeKey;
import com.example.entity.StudentEntity;

public class Tester {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAOImpl();

        StudentCompositeKey compositeKey=new StudentCompositeKey();
        compositeKey.setRollNo(101);
        compositeKey.setSection("B");

        StudentEntity entity=new StudentEntity();
        entity.setCompositeKey(compositeKey);
        entity.setStudentName("vaibhav");
        entity.setMarks(900);
        dao.saveStudent(entity);
        StudentEntity entity1= dao.fetchStudent(compositeKey);
        System.out.println("Name:"+entity1.getStudentName());
        System.out.println("Marks"+entity1.getMarks());




    }
}
