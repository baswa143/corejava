package com.ait.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements IUserDAO{

    public UserDAOImpl(){
        System.out.println("UserDAOImpl :: Constructor");
    }


    @Override
    public String getName(int id) {
        return "John";
    }
}
