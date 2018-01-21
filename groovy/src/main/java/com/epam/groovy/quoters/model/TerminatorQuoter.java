package com.epam.groovy.quoters.model;


import com.epam.groovy.quoters.annatations.InjectRandomInt;

import javax.annotation.PostConstruct;

public class TerminatorQuoter implements Quoter {
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public TerminatorQuoter() {
        System.out.println("Phase#1" + "the plain constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Phase#2" + "init method @PostConstruct");
        System.out.println(repeat);
    }

    public void sayQuote() {
        System.out.println("Phase#3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}

