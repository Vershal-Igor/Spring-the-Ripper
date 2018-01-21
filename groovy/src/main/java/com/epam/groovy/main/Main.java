package com.epam.groovy.main;


import com.epam.groovy.quoters.model.Quoter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new GenericGroovyApplicationContext("/applicationContext.groovy");
        context.getBean(Quoter.class).sayQuote();

    }
}
