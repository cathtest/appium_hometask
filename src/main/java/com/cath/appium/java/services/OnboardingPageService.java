package com.cath.appium.java.services;

import com.cath.appium.java.pages.OnboardingPage;

public class OnboardingPageService {

    private OnboardingPage onboardingPage;

    public OnboardingPageService(){
        this.onboardingPage = new OnboardingPage();
    }

    public void letsGoButtonClick(){
        onboardingPage.getLetsGoButton().click();
    }
}
