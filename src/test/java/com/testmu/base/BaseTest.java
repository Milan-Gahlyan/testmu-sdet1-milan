package com.testmu.base;

import com.testmu.config.ConfigReader;
import com.testmu.driver.DriverFactory;
import com.testmu.driver.DriverManager;
import com.testmu.manager.PageManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(com.testmu.listeners.TestListener.class)
public class BaseTest {

    @BeforeClass(alwaysRun = true)
    public void setup() {

        DriverFactory.initializeDriver();

        DriverManager.getDriver().get(
                ConfigReader.get("ui.base.url"));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {

        DriverFactory.quitDriver();

        PageManager.unload();
    }
}