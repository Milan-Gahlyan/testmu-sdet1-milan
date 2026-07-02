package com.testmu.base;

import com.testmu.config.ConfigReader;
import com.testmu.driver.DriverFactory;
import com.testmu.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setup() {

        DriverFactory.initializeDriver();

        DriverManager.getDriver().get(
                ConfigReader.get("ui.base.url"));

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        DriverFactory.quitDriver();

    }

}