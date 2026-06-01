package com.brainworks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJDBCConfig {

    public DriverManagerDataSource getDriver(){

        DriverManagerDataSource ds =
                new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/sbms75");
        ds.setUsername("root");
        ds.setPassword("Baswaraj@143");

        return ds;
    }
@Bean
    public JdbcTemplate getTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDriver());
        return template;
    }


}
