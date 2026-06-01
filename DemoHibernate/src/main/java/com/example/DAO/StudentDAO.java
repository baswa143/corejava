package com.example.DAO;

import com.example.Student;

public interface StudentDAO {
    void saveStudent(Student student);

     Student loadStudent(int sid);
     Student updateStudent(int sid,int marks);
     void deleteStudent(int sid);

}
