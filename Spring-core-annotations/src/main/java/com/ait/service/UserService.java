package com.ait.service;

import com.ait.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO=null;
    public UserService(){
        System.out.println("UserService :: Constructor");
    }

    public void getName()
    {
        String nameById=userDAO.getNameById(101);
        System.out.println(nameById);
    }


}
