package com.ait.config;

import com.ait.beans.AppSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan(basePackages = "com.ait")
public class AppConfig {
    @Bean
    public AppSecurity getSecurityContextObj(){
        AppSecurity security = new AppSecurity("SHA-356");
        return security;
    }
}

