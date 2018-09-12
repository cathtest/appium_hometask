package com.cath.appium.java.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DashboardPage extends DefaultPage{

    @AndroidFindBy(id = "ch.upc.connect.android.dev:id/messageCount")
    private AndroidElement welcomeText;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ch.upc.connect.android.dev:id/settings_image\")")
    private AndroidElement cogIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ch.upc.connect.android.dev:id/textView\")")
    private AndroidElement avatar;


    public AndroidElement getWelcomeText() {
        return welcomeText;
    }

    public AndroidElement getCogIcon() {
        return cogIcon;
    }

    public AndroidElement getAvatar() {
        return avatar;
    }
}
