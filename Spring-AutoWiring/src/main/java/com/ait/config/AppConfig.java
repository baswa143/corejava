package com.ait.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.ait")
public class AppConfig {

    public AppConfig(){
        System.out.println("AppConfig :: Constructor");
    }

}
