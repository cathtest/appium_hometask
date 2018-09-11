package com.cath.appium.java.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TermsAndConditionsPage extends DefaultPage{

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"wizard_step_primary_button\")")
    private AndroidElement acceptButton;


    public AndroidElement getAcceptButton() {
        return acceptButton;
    }
}
