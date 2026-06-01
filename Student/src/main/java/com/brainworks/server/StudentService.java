package com.brainworks.server;

import com.brainworks.repository.StudentDao;
import com.brainworks.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public int save(Student student)
    {
        return studentDao.saveStudent(student);
    }

}
