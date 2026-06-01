package com.ait.dao;

import com.ait.dto.Student;
import com.ait.mapper.StudentMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO {
    private JdbcTemplate jt;

    public StudentDAO(JdbcTemplate jt){
        this.jt=jt;
    }

    public int save(Student s){
        String sql = "INSERT INTO STUDENT (ID,NAME,CITY) VALUES(?,?,?)";
        int rowsEffected = jt.update(sql,s.getId(),s.getName(),s.getCity());
        return rowsEffected;
    }

    public List<Student> findAll(){
        String sql = "select * from student";
       List list = jt.query(sql,new StudentMapper());
       return list;
    }

}
