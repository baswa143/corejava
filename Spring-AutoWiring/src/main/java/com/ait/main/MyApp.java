package com.ait.main;

import com.ait.config.AppConfig;
import com.ait.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        //Starting with IOC container
        ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);

        //get bean obj from ioc
        UserService service = ctxt.getBean(UserService.class);

        service.printName();
    }
}
