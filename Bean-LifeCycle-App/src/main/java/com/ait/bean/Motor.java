package com.ait.bean;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Service
public class Motor {
    public Motor(){
        System.out.println("Motor Constructor");
    }
    @PostConstruct
    public void start(){
        System.out.println("Motor Starting......");
    }
    public void doWork(){
        System.out.println("Motor is running........");
    }

    @PreDestroy
    public void stop(){
        System.out.println("Motor is stopped..........");
    }



}
