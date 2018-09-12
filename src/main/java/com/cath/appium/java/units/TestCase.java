package com.cath.appium.java.units;

import com.cath.appium.java.services.*;
import com.cath.appium.java.utils.LogManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestCase {


    private OnboardingPageService onboardingPageService;
    protected LoginPageService loginPageService;
    private TermsAndConditionsService termsAndConditionsService;
    private LongTouchService longTouchService;
    protected LogManager logManager;
    protected DashboardPageService dashboardPageService;
    protected MyAccountPageService myAccountPageService;

    @BeforeSuite(description = "Starting logger")

    public void loggerStart(){
        logManager = new LogManager();
    }

    @BeforeSuite(description = "Starting Android driver")
    public void startAndroidDriver() {

        logManager.loggingInfo("Starting AndroidDriver");


        logManager.loggingInfo("Creating the instance of a driver");
        DriverManager.getInstance().createAndroidDriver();
        DriverManager.getInstance().getAndroidDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }

    @BeforeClass(description = "Services initialization")
    public void initServices() {
        logManager.loggingInfo("Services initialization");
        onboardingPageService = new OnboardingPageService();
        loginPageService = new LoginPageService();
        termsAndConditionsService = new TermsAndConditionsService();
        longTouchService = new LongTouchService();
        dashboardPageService = new DashboardPageService();
        myAccountPageService = new MyAccountPageService();
    }

    @BeforeClass(description = "Reseting App")
    public void resetingApp(){
        DriverManager.getInstance().getAndroidDriver().resetApp();
    }

    @BeforeClass(description = "Logging in")
    public void login(){
        logManager.loggingInfo("Tapping Let's go button");
        onboardingPageService.letsGoButtonClick();

        logManager.loggingInfo("Sending keys to Username field");
        loginPageService.sendKeysToUsername();

        logManager.loggingInfo("Sending keys to Password field");
        loginPageService.sendKeysToPassword();

        logManager.loggingInfo("Hiding the keyboard");
        DriverManager.getInstance().getAndroidDriver().hideKeyboard();

        logManager.loggingInfo("Tapping Login button");
        loginPageService.loginButtonClick();

        logManager.loggingInfo("Accepting Terms and Conditions");
        termsAndConditionsService.acceptButtonClick();
    }


    @AfterSuite
    public void teardown(){
        DriverManager.getInstance().getAndroidDriver().quit();
    }
}
