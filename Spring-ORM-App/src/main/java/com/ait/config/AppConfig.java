package com.ait.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;
@Configuration
@ComponentScan(basePackages = "com.ait")
@EnableTransactionManagement
public class AppConfig {
@Bean
//Connection pool
    public DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/sbms75");
        ds.setUsername("root");
        ds.setPassword("Baswaraj@143");
        return ds;
    }
      @Bean
      //session factory
    public LocalSessionFactoryBean sessionFactoryBean(){
        LocalSessionFactoryBean lfb = new LocalSessionFactoryBean();
        lfb.setDataSource(dataSource());
        lfb.setPackagesToScan("com.ait.entity");

        Properties p=new Properties();
        p.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");//convert hql to sql
        p.put("hibernate.hbm2ddl.auto", "update");//table create auto
        p.put("hibernate.show_sql","true");
        lfb.setHibernateProperties(p);
        return lfb;
    }
    @Bean
    public HibernateTemplate hibernateTemplate() {
        HibernateTemplate ht =
                new HibernateTemplate(sessionFactoryBean().getObject());
        return ht;
    }


    @Bean
    //Transaction
    public HibernateTransactionManager transactionManager(LocalSessionFactoryBean lfb){
    HibernateTransactionManager txManager = new HibernateTransactionManager();
    txManager.setSessionFactory(lfb.getObject());
    return txManager;
    }
}
