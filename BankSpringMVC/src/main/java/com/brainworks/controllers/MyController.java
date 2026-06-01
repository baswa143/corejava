package com.brainworks.controllers;

import com.brainworks.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
public class MyController {

    @Autowired
private JdbcTemplate jdbcTemplate;
    @GetMapping("/signup")
    public ModelAndView getUserLogin(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }
    @PostMapping("/submit")
    public ModelAndView getUserProfile(@ModelAttribute User user){

        //using the HttpRequestServlet we get the name ,panNo and occupation.
//    String name=req.getParameter("name");
//    String panNo=req.getParameter("panNo");
//    String occupation=req.getParameter("occupation");
//        System.out.println(name + panNo + occupation);
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("profile");
        UUID id=UUID.randomUUID();
        System.out.println(user.getName()+ " ,"+ user.getPanNo()+" ,"+user.getOccupation());
        jdbcTemplate.update("insert into user value(?,?,?)",user.getName(), user.getPanNo(),user.getOccupation());

    return new ModelAndView("profile","User","user");
    }
}
