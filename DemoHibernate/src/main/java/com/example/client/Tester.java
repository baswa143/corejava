package com.example.client;

import com.example.DAO.StudentDAO;
import com.example.DAO.impl.StudentDAOImpl;
import com.example.Student;

public class Tester {
    public static void main(String[] args) {
        StudentDAO dao=new StudentDAOImpl();
        //creating student object

        Student student = new Student();
//        student.setSid(103);
//        student.setSname("shiva");
//        student.setGender("male");
//        student.setMarks(89);
//        dao.saveStudent(student);


//        Student stu= dao.loadStudent(101);
//        System.out.println(stu);
        Student s=dao.updateStudent(4,79);
        System.out.println(s);

        dao.deleteStudent(4);

    }
}
