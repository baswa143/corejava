package com.brainworks.repository;

import com.brainworks.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveStudent(Student student){
        String sql =
                "insert into student(name,email,password) values(?,?,?)";

        return jdbcTemplate.update(
                sql,
                student.getName(),
                student.getEmail(),
                student.getPassword()
        );
    }

}
