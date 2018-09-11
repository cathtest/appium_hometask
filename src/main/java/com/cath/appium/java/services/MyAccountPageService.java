package com.cath.appium.java.services;

import com.cath.appium.java.pages.MyAccountPage;
import com.cath.appium.java.units.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;


public class MyAccountPageService {

    private MyAccountPage myAccountPage;

    public MyAccountPageService() {
        this.myAccountPage = new MyAccountPage();
    }

    public void logoutButtonClick(){
        myAccountPage.getLogoutButton().click();
    }

    public void cancelLogoutPromptClick(){
        myAccountPage.getCancelLogoutPrompt().click();
    }

    public void acceptLogoutPromptClick(){
        myAccountPage.getAcceptLogoutPrompt().click();
    }
}
