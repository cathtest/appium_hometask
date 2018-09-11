package com.cath.appium.test;


import com.cath.appium.java.units.DriverManager;
import com.cath.appium.java.units.TestCase;;

import org.testng.Assert;
import org.testng.annotations.Test;


public class NativeMobileWidgetTest extends TestCase {



    @Test(description =
    "\n Load the App and log in"+
    "\n Kill the App and launch it again"+
    "\n Check User stays logged in by verifying the presence of Cog icon, Avatar and Welcome text")

    public void testWidget()  {

        logManager.loggingInfo("Killing the app");
        DriverManager.getInstance().appClose();

        logManager.loggingInfo("Opening the app again");
        DriverManager.getInstance().appOpen();

        logManager.loggingInfo("Checking Cog icon is displayed");
        Assert.assertTrue(dashboardPageService.isCogIconPresent(), "Cog icon is absent");

        logManager.loggingInfo("Avatar text is present");
        Assert.assertTrue(dashboardPageService.isAvatarPresent(), "Avatar is absent");

        logManager.loggingInfo("Checking Welcome text is present");
        Assert.assertTrue(dashboardPageService.isWelcomeTextPresent(), "Welcome text is absent");




    }

}
