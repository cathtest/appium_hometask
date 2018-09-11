package com.cath.appium.java.services;

import com.cath.appium.java.enums.ProjectProperties;
import com.cath.appium.java.pages.LoginPage;
import com.cath.appium.java.properties.ReaderSingleton;

public class LoginPageService {

    private LoginPage loginPage;


    public LoginPageService() {
        this.loginPage = new LoginPage();
    }



    public void sendKeysToUsername(){
        loginPage.getUsernameField().sendKeys(ReaderSingleton.getInstance().getValue(ProjectProperties.USERNAME.getKey()));
    }

    public void sendKeysToPassword(){
        loginPage.getPasswordField().sendKeys(ReaderSingleton.getInstance().getValue(ProjectProperties.PASSWORD.getKey()));
    }

    public void loginButtonClick(){
        loginPage.getLoginButton().click();
    }

    public String getTextFromUsernameField(){
        return loginPage.getUsernameField().getText();
    }

    public String getTextFromPasswordField(){
        return loginPage.getPasswordField().getText();
    }



    public void UsernameClick(){
        loginPage.getUsernameField().click();
    }

    public void PasswordClick(){
        loginPage.getPasswordField().click();
    }
}

