package com.cath.appium.java.services;


import com.cath.appium.java.pages.DesktopPage;



public class LongTouchService {

    private DesktopPage desktopPage;


    public LongTouchService() {
        this.desktopPage = new DesktopPage();
    }

    public void longPress(){
//        PointOption pointOption = new PointOption(desktopPage.getAreaToHold().getCoordinates().g);
//        TouchAction action = new TouchAction ((AppiumDriver)DriverManager.getInstance().getAndroidDriver());
//        action.longPress(desktopPage.getAreaToHold());
//        action.perform();
//        action.release();

    }
}
