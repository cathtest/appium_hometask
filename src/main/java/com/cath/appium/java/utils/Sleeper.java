package com.cath.appium.java.utils;

public class Sleeper {
    public static void sleep(int seconds){

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
