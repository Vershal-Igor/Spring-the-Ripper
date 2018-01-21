package com.epam.groovy.main;


import com.epam.groovy.quoters.model.Quoter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.getBean(Quoter.class).sayQuote();
    }
}
