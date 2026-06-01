package com.ait.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.ait")
public class AppConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds= new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); //SI
        ds.setUrl("jdbc:mysql://localhost:3306/sbms75"); //SI
        ds.setUsername("root"); //SI
        ds.setPassword("Baswaraj@143");//SI
         return ds;

    }
    @Bean
    public JdbcTemplate createJdbcTemplate(DataSource ds){
        return new JdbcTemplate(ds); //CI
    }
    }


