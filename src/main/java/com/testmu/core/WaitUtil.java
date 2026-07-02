package com.testmu.utils;

import com.testmu.config.ConfigReader;
import com.testmu.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class WaitUtil {

    private WaitUtil(){}

    private static WebDriverWait getWait(){

        return new WebDriverWait(

                DriverManager.getDriver(),

                Duration.ofSeconds(

                        Long.parseLong(

                                ConfigReader.get("explicitWait")

                        )

                )

        );

    }

    public static WebElement waitForVisibility(By locator){

        return getWait().until(

                ExpectedConditions.visibilityOfElementLocated(locator)

        );

    }

    public static WebElement waitForClickable(By locator){

        return getWait().until(

                ExpectedConditions.elementToBeClickable(locator)

        );

    }

}