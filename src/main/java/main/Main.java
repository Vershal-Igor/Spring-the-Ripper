package main;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.Quoter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        while (true) {
            Thread.sleep(100);
            context.getBean(Quoter.class).sayQuote();
        }
        /*context.getBean(Quoter.class).sayQuote();*/
    }
}
