package main;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.model.Quoter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        /*context.getBean(Quoter.class).sayQuote();*/
    }
}
