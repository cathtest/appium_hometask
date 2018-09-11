package com.cath.appium.java.services;

import com.cath.appium.java.pages.TermsAndConditionsPage;

public class TermsAndConditionsService {

    private TermsAndConditionsPage termsAndConditionsPage;

    public TermsAndConditionsService() {
        this.termsAndConditionsPage = new TermsAndConditionsPage();
    }

    public void acceptButtonClick(){
        termsAndConditionsPage.getAcceptButton().click();
    }
}
