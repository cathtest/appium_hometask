package com.cath.appium.java.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DesktopPage extends DefaultPage{

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.sec.android.app.sbrowser:id/quickaccess_scroll_view\")")

    private AndroidElement areaToHold;

    public AndroidElement getAreaToHold() {
        return areaToHold;
    }
}
