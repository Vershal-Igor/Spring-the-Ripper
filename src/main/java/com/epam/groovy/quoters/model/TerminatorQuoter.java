package com.epam.groovy.quoters.model;


import com.epam.groovy.quoters.annatations.DeprecatedClass;
import com.epam.groovy.quoters.annatations.InjectRandomInt;
import com.epam.groovy.quoters.annatations.PostProxy;
import com.epam.groovy.quoters.annatations.Profiling;

import javax.annotation.PostConstruct;

@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase#2" + "init method @PostConstruct");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase#1" + "the plain constructor");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostProxy
    public void sayQuote() {
        System.out.println("Phase#3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}

