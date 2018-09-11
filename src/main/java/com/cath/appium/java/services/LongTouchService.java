package com.cath.appium.java.services;


import com.cath.appium.java.pages.DesktopPage;
import com.cath.appium.java.units.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;


public class LongTouchService {

    private DesktopPage desktopPage;


    public LongTouchService() {
        this.desktopPage = new DesktopPage();
    }

    public void longPress(){

        TouchAction action = new TouchAction ((AppiumDriver)DriverManager.getInstance().getAndroidDriver());
        action.longPress(desktopPage.getAreaToHold());
        action.perform();
        action.release();

    }
}
