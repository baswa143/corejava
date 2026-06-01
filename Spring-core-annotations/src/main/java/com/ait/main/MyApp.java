package com.ait.main;

import com.ait.config.AppConfig;
import com.ait.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        //starting Ioc Container
        ApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class);

        //Getting spring bean Obj from IOC
        UserService us=ctxt.getBean(UserService.class);
        System.out.println(us.hashCode());
        us.getName();

    }
}
