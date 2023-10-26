package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
//        Sim sim = new Airtel();
//        sim.calling();
//        sim.data();

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Vodaphone vodaphone = context.getBean("vodaphone", Vodaphone.class);
//        vodaphone.data();
//        vodaphone.calling();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Sim si = context.getBean("sim", Sim.class);
        si.calling();
        si.data();
        // Comment
        System.out.println("Hello world!");
    }
}