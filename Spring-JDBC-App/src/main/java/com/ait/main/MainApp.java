package com.ait.main;

import com.ait.config.AppConfig;
import com.ait.dao.StudentDAO;
import com.ait.dto.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentDAO dao = context.getBean(StudentDAO.class);

//        Student s =  new Student();
//        s.setName("Baswaraj");
//        s.setCity("HYD");
//        s.setId(101);
//
//        int cnt= bean.save(s);
//
//        System.out.println("Row Effected :: "+cnt);
        List<Student> all=dao.findAll();
        all.forEach(System.out::println);
    }
}
