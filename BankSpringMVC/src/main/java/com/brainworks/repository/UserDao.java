package com.brainworks.repository;

import com.brainworks.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getUser(){
        String query = "select* from user";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(User.class));
    }

}
