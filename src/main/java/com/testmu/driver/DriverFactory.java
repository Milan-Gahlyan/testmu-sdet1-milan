package com.testmu.driver;

import com.testmu.config.ConfigReader;
import com.testmu.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static void initializeDriver() {

        BrowserType browser =
                BrowserType.valueOf(
                        ConfigReader.get("browser").toUpperCase());

        WebDriver driver;

        switch (browser) {

            case FIREFOX -> {

                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            }

            case EDGE -> {

                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();

            }

            default -> {

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

            }

        }

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(
                Duration.ofSeconds(
                        Long.parseLong(
                                ConfigReader.get("implicitWait"))));

        DriverManager.setDriver(driver);

    }

    public static void quitDriver() {

        if (DriverManager.getDriver() != null) {

            DriverManager.getDriver().quit();

            DriverManager.unload();

        }

    }

}