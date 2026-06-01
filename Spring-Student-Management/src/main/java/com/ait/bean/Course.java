package com.ait.bean;

import org.springframework.stereotype.Service;

@Service
public class Course {
    private String courseName="Spring core";
    private String duration = "6 Month";
    private double fee=2000;

    public void course(){
        System.out.println("CourseName: "+courseName);
        System.out.println("Duration: "+duration);
        System.out.println("fee: "+5000 );
    }

}
