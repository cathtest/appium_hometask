package com.cath.appium.java.services;

import com.cath.appium.java.pages.MyAccountPage;



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
