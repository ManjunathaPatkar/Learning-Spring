package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencydemoApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext context=SpringApplication.run(DependencydemoApplication.class, args);
       Customers c=context.getBean(Customers.class);
       c.display();
    }

}
