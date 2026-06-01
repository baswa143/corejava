package com.ait;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ait")
public class MyApp {
    public static void main(String[] args) {
        ApplicationContext cnxt= new AnnotationConfigApplicationContext(MyApp.class);

        ShoppingCard card =cnxt.getBean(ShoppingCard.class);
        card.placeOrder();


    }
}
