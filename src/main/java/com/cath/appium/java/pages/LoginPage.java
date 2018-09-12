package com.cath.appium.java.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends DefaultPage{

    @AndroidFindBy(id = "emailAddress")
    private AndroidElement usernameField;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"choosePassword\")")
    private AndroidElement passwordField;

    @AndroidFindBy(className = "android.widget.Button")
    private AndroidElement loginButton;

    public AndroidElement getUsernameField(){
        return usernameField;
    }

    public AndroidElement getPasswordField() {
        return passwordField;
    }


    public AndroidElement getLoginButton() {
        return loginButton;
    }
}
