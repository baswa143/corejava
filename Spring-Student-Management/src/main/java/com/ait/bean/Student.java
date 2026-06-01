package com.ait.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student {

    private String name = "Baswaraj";
    private int age = 25;

    private Address address;
    private Course course;
      @Autowired
    public Student(Address address,Course course){
          this.address=address;
          this.course=course;
    }

//    @Autowired
//    private Address address;
//    @Autowired
//    private Course course;

    public void student(){
        System.out.println("Name : "+ name);
        System.out.println("age :"+age);
        address.address();
        course.course();
    }



}
