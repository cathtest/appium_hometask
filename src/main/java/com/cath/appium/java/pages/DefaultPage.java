package com.cath.appium.java.pages;

import com.cath.appium.java.units.DriverManager;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;




public class DefaultPage {


    public DefaultPage () {


        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getInstance().getAndroidDriver()),this);

    }

}
