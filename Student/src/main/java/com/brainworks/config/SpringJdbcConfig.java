package com.brainworks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringJdbcConfig {
@Bean
    public DataSource dataSource(){
    DriverManagerDataSource ds =
            new DriverManagerDataSource();

    ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

    ds.setUrl(
            "jdbc:mysql://localhost:3306/sbms75");

    ds.setUsername("root");

    ds.setPassword("Baswaraj@143");

    return ds;
    }
@Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate template =
                new JdbcTemplate();

        template.setDataSource(dataSource());

        return template;
    }


}
