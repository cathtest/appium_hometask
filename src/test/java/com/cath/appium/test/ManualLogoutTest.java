package com.cath.appium.test;

import com.cath.appium.java.enums.ProjectProperties;
import com.cath.appium.java.properties.ReaderSingleton;
import com.cath.appium.java.units.DriverManager;
import com.cath.appium.java.units.TestCase;
import com.cath.appium.java.utils.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(description =
        "\n Load the App and log in" +
                "\n Tap user photo on Dashboard"+
                "\n Tap Log out button on My account screen"+
                "\n Tap Cancel button on the Logout prompt"+
                "\n Tap Log out button on My account screen again"+
                "\n Tap Log out button on the Logout prompt"+
                "\n Verify Username page is preserved on Login page"+
                "\n Verify Password is not preserved on Login page"+
                "\n Kill the App and launch it again"+
                "\n Verify Username page is preserved on Login page"+
                "\n Verify Password is not preserved on Login page")

public class ManualLogoutTest extends TestCase {

    public void logoutScenario(){

        logManager.loggingInfo("Clicking Avatar");
        dashboardPageService.avatarClick();

        logManager.loggingInfo("Clicking Logout button");
        myAccountPageService.logoutButtonClick();

        logManager.loggingInfo("Clicking Cancel on Logout prompt");
        myAccountPageService.cancelLogoutPromptClick();


        logManager.loggingInfo("Clicking Logout button again");
        myAccountPageService.logoutButtonClick();

        logManager.loggingInfo("Clicking Logout button on logout prompt");
        myAccountPageService.acceptLogoutPromptClick();

        logManager.loggingInfo("Getting text from Username field and comparing it with the actual Username");
        Assert.assertEquals(loginPageService.getTextFromUsernameField(), ReaderSingleton.getInstance().getValue(ProjectProperties.USERNAME.getKey()), "Username is corrupted");

        logManager.loggingInfo("Getting text from Password field and chacking that it is null");
        Assert.assertEquals(loginPageService.getTextFromPasswordField(), "", "There is an error, password is preserved when it shouldn't be preserved");

        logManager.loggingInfo("Killing the app");
        DriverManager.getInstance().appClose();

        logManager.loggingInfo("Launching the app again");
        DriverManager.getInstance().appOpen();

        logManager.loggingInfo("Getting text from Username field and comparing it with the actual Username");
        Assert.assertEquals(loginPageService.getTextFromUsernameField(), ReaderSingleton.getInstance().getValue(ProjectProperties.USERNAME.getKey()), "Username is corrupted");

        logManager.loggingInfo("Getting text from Password field and chacking that it is null");
        Assert.assertEquals(loginPageService.getTextFromPasswordField(), "", "There is an error, password is preserved when it shouldn't be preserved");



    }
}
