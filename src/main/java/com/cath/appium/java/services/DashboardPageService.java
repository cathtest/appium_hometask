package com.cath.appium.java.services;

import com.cath.appium.java.pages.DashboardPage;


public class DashboardPageService {

    private DashboardPage dashboardPage;

    public DashboardPageService() {
        this.dashboardPage = new DashboardPage();
    }

    public Boolean isWelcomeTextPresent(){
        return dashboardPage.getWelcomeText().isDisplayed();
    }

    public Boolean isCogIconPresent(){
        return dashboardPage.getCogIcon().isDisplayed();
    }

    public Boolean isAvatarPresent(){
        return dashboardPage.getAvatar().isDisplayed();
    }

    public void avatarClick(){
        dashboardPage.getAvatar().click();
    }
}
