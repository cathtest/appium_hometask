package com.cath.appium.java.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyAccountPage extends DefaultPage{

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ch.upc.connect.android.dev:id/logout_button\")")
    private AndroidElement logoutButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button2\")")
    private AndroidElement cancelLogoutPrompt;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    private AndroidElement acceptLogoutPrompt;



    public AndroidElement getLogoutButton() {
        return logoutButton;
    }

    public AndroidElement getCancelLogoutPrompt() {
        return cancelLogoutPrompt;
    }


    public AndroidElement getAcceptLogoutPrompt() {
        return acceptLogoutPrompt;
    }
}
