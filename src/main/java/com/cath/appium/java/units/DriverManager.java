package com.cath.appium.java.units;

import com.cath.appium.java.enums.ProjectProperties;
import com.cath.appium.java.properties.ReaderSingleton;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static DriverManager _instance;



    public static DriverManager getInstance() {
        if (_instance == null) {
            _instance = new DriverManager();
        }
        return _instance;
    }

    private AppiumDriver driver;



    private static final String PLATFORM_NAME = ProjectProperties.PLATFORM_NAME.getKey();
    private static final String PLATFORM_VERSION = ProjectProperties.PLATFORM_VERSION.getKey();
    private static final String ACTIVITY = ProjectProperties.ACTIVITY.getKey();
    private static final String APP = ProjectProperties.APP.getKey();
    private static final String APP_PACKAGE = ProjectProperties.APP_PACKAGE.getKey();
    private static final String DEVICE_NAME = ProjectProperties.DEVICE_NAME.getKey();
    private static final String URL = ProjectProperties.URL.getKey();
    private static final String NO_RESET = ProjectProperties.NO_RESET.getKey();
    private static final String FULL_RESET = ProjectProperties.FULL_RESET.getKey();



    void createAndroidDriver()  {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(PLATFORM_VERSION, ReaderSingleton.getInstance().getValue(PLATFORM_VERSION));

            capabilities.setCapability(PLATFORM_NAME, ReaderSingleton.getInstance().getValue(PLATFORM_NAME));

            capabilities.setCapability(ACTIVITY, ReaderSingleton.getInstance().getValue(ACTIVITY));

            capabilities.setCapability(APP, ReaderSingleton.getInstance().getValue(APP));

            capabilities.setCapability(APP_PACKAGE, ReaderSingleton.getInstance().getValue(APP_PACKAGE));

            capabilities.setCapability(DEVICE_NAME, ReaderSingleton.getInstance().getValue(DEVICE_NAME));

            capabilities.setCapability(NO_RESET, ReaderSingleton.getInstance().getValue(NO_RESET));

            capabilities.setCapability(FULL_RESET, ReaderSingleton.getInstance().getValue(FULL_RESET));

            this.driver = new AndroidDriver<AndroidElement>(new URL(ReaderSingleton.getInstance().getValue(URL)), capabilities);

        }
        catch (MalformedURLException ex){
            System.out.print(ex.getMessage());

            throw new RuntimeException();
        }

    }

    public AppiumDriver getAndroidDriver(){

        return driver;
    }






}