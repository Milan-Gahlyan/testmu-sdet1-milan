package com.testmu.core;

import com.testmu.driver.DriverManager;
import com.testmu.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementActions {

    protected WebElement getElement(By locator) {
        return WaitUtil.waitForVisibility(locator);
    }

    protected void click(By locator) {
        WaitUtil.waitForClickable(locator).click();
    }

    protected void type(By locator, String text) {
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        return getElement(locator).getText();
    }

    protected boolean isDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    protected String getTitle() {
        return DriverManager.getDriver().getTitle();
    }

    protected String getCurrentUrl() {
        return DriverManager.getDriver().getCurrentUrl();
    }
}