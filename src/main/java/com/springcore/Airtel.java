package com.springcore;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling from airtel sim.........");
    }

    @Override
    public void data() {
        System.out.println("Browsing Airtel data....");
    }
}
