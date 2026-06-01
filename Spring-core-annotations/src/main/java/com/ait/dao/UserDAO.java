package com.ait.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    public UserDAO(){
        System.out.println("UserDAO :: CONSTRUCTOR");
    }

    public String getNameById(int id){
        if(id==100){
            return "rushi";

        }
        else{
            return "shiva";
        }
    }


}
