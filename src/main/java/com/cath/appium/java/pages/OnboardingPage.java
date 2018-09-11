package com.cath.appium.java.pages;


import com.cath.appium.java.units.TestCase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class OnboardingPage extends DefaultPage {


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ch.upc.connect.android.dev:id/content_template_primary_action_button\")")
    private AndroidElement letsGoButton;

    public AndroidElement getLetsGoButton(){
        return letsGoButton;
    }



}
