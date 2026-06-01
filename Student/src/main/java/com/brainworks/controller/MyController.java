package com.brainworks.controller;

import com.brainworks.model.Student;
import com.brainworks.server.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MyController {
@Autowired
    private StudentService studentService;

    @GetMapping("/login")
    public ModelAndView userLogin(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }
    @PostMapping("/save")

    public ModelAndView saveStudent(@ModelAttribute Student student){
        studentService.save(student);

        return new ModelAndView("profile","Student",student);
    }

}
