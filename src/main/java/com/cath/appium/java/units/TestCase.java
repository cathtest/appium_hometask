package com.cath.appium.java.units;

import com.cath.appium.java.enums.ProjectProperties;

import com.cath.appium.java.pages.DashboardPage;
import com.cath.appium.java.pages.TermsAndConditionsPage;
import com.cath.appium.java.properties.ReaderSingleton;
import com.cath.appium.java.services.*;

import com.cath.appium.java.utils.LogManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestCase {

    private static final String PLATFORM_NAME = ProjectProperties.PLATFORM_NAME.getKey();
    private static final String PLATFORM_VERSION = ProjectProperties.PLATFORM_VERSION.getKey();
    private static final String ACTIVITY = ProjectProperties.ACTIVITY.getKey();
    private static final String APP = ProjectProperties.APP.getKey();
    private static final String APP_PACKAGE = ProjectProperties.APP_PACKAGE.getKey();
    private static final String DEVICE_NAME = ProjectProperties.DEVICE_NAME.getKey();
    private static final String URL = ProjectProperties.URL.getKey();
    private static final String NO_RESET = ProjectProperties.NO_RESET.getKey();
    private static final String FULL_RESET = ProjectProperties.FULL_RESET.getKey();

    private OnboardingPageService onboardingPageService;
    protected LoginPageService loginPageService;
    private TermsAndConditionsService termsAndConditionsService;
    private LongTouchService longTouchService;
    protected LogManager logManager;
    protected DashboardPageService dashboardPageService;
    protected MyAccountPageService myAccountPageService;

    @BeforeSuite(groups = "1", description = "Starting logger")

    public void loggerStart(){
        logManager = new LogManager();
    }

    @BeforeSuite(groups = "2", dependsOnGroups = "1", description = "Starting Android driver")
    public void startAndroidDriver() {

        logManager.loggingInfo("Starting AndroidDriver");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(PLATFORM_VERSION, ReaderSingleton.getInstance().getValue(PLATFORM_VERSION));

        capabilities.setCapability(PLATFORM_NAME, ReaderSingleton.getInstance().getValue(PLATFORM_NAME));

        capabilities.setCapability(ACTIVITY, ReaderSingleton.getInstance().getValue(ACTIVITY));

        capabilities.setCapability(APP, ReaderSingleton.getInstance().getValue(APP));

        capabilities.setCapability(APP_PACKAGE, ReaderSingleton.getInstance().getValue(APP_PACKAGE));

        capabilities.setCapability(DEVICE_NAME, ReaderSingleton.getInstance().getValue(DEVICE_NAME));

        capabilities.setCapability(NO_RESET, ReaderSingleton.getInstance().getValue(NO_RESET));

        capabilities.setCapability(FULL_RESET, ReaderSingleton.getInstance().getValue(FULL_RESET));

        logManager.loggingInfo("Creating the instance of a driver");
        DriverManager.getInstance().createAndroidDriver(ReaderSingleton.getInstance().getValue(URL), capabilities);
        DriverManager.getInstance().getAndroidDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }

    @BeforeSuite(groups = "3", dependsOnGroups = "2", description = "Services initialization")
    public void initServices() {
        logManager.loggingInfo("Services initialization");
        onboardingPageService = new OnboardingPageService();
        loginPageService = new LoginPageService();
        termsAndConditionsService = new TermsAndConditionsService();
        longTouchService = new LongTouchService();
        dashboardPageService = new DashboardPageService();
        myAccountPageService = new MyAccountPageService();
    }

    @BeforeSuite(groups = "4", dependsOnGroups = "3")
    public void resetingApp(){
        DriverManager.getInstance().appReset();
    }

    @BeforeSuite(groups = "5", dependsOnGroups = "4", description = "Logging in")
    public void login(){
        logManager.loggingInfo("Tapping Let's go button");
        onboardingPageService.letsGoButtonClick();

        logManager.loggingInfo("Sending keys to Username field");
        loginPageService.sendKeysToUsername();

        logManager.loggingInfo("Sending keys to Password field");
        loginPageService.sendKeysToPassword();

        logManager.loggingInfo("Hiding the keyboard");
        DriverManager.getInstance().keyboardHide();

        logManager.loggingInfo("Tapping Login button");
        loginPageService.loginButtonClick();

        logManager.loggingInfo("Accepting Terms and Conditions");
        termsAndConditionsService.acceptButtonClick();
    }


    @AfterSuite
    public void teardown(){
//        DriverManager.getInstance().getAndroidDriver().quit();
    }
}
