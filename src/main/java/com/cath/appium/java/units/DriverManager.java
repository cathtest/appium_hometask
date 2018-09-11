package com.cath.appium.java.units;

import com.cath.appium.java.enums.ProjectProperties;
import com.cath.appium.java.properties.ReaderSingleton;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class DriverManager {

    private static DriverManager _instance;



    public static DriverManager getInstance() {
        if (_instance == null) {
            _instance = new DriverManager();
        }
        return _instance;
    }

    private AppiumDriver driver;

    void createAndroidDriver(String url, DesiredCapabilities capabilities)  {
        try {
            this.driver = new AndroidDriver<AndroidElement>(new URL(url), capabilities);
        }
        catch (MalformedURLException ex){
            System.out.print(ex.getMessage());
            throw new RuntimeException();
        }

    }

    public RemoteWebDriver getAndroidDriver(){
        return driver;
    }


    public void keyboardHide(){
        driver.hideKeyboard();
    }

    public void appClose() {
        driver.closeApp();
    }

    public void appOpen() {
        driver.launchApp();
    }

    public void appReset(){
        driver.resetApp();
    }

}