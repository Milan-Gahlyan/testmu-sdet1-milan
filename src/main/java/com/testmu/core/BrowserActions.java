package com.testmu.utils;

import com.testmu.driver.DriverManager;
import org.openqa.selenium.By;

public final class BrowserActions {

    private BrowserActions(){}

    public static void click(By locator){

        WaitUtil.waitForClickable(locator).click();

    }

    public static void type(By locator,String text){

        WaitUtil.waitForVisibility(locator).clear();

        WaitUtil.waitForVisibility(locator).sendKeys(text);

    }

    public static String getText(By locator){

        return WaitUtil.waitForVisibility(locator).getText();

    }

    public static boolean isDisplayed(By locator){

        return WaitUtil.waitForVisibility(locator).isDisplayed();

    }

}