package com.cath.appium.java.enums;

public enum ProjectProperties {

    PLATFORM_VERSION("platformVersion"),
    PLATFORM_NAME("platformName"),
    ACTIVITY("Activity"),
    APP("app"),
    APP_PACKAGE("appPackage"),
    DEVICE_NAME("deviceName"),
    URL("url"),
    PASSWORD("password"),
    USERNAME("username"),
    NO_RESET("noReset"),
    FULL_RESET("fullReset");

    private String key;

    ProjectProperties (String key){
        this.key = key;
    }

    public String getKey(){
        return key;
    }

}
