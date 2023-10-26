package com.springcore;

public class Vodafone implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling from Vodafone sim.........");
    }

    @Override
    public void data() {
        System.out.println("Browsing Vodafone data....");
    }
}
