package com.ait.service;

import com.ait.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired    //field injection
    private IUserDAO userDao;

    public UserService(){
        System.out.println("UserService :: constructor");
    }
    @Autowired
    public void setUserDao(IUserDAO userDao){
        System.out.println("setUserDao method is called.............");
        this.userDao=userDao;
    }
    @Autowired
    public UserService(IUserDAO userDao){
        this.userDao=userDao;
        System.out.println("this parameter constructor.............");
    }



    public void printName(){
        String name = userDao.getName(100);
        System.out.println("Name :"+name);
    }
}
