package com.testmu.utils;

import com.testmu.constants.FrameworkConstants;
import com.testmu.driver.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public final class ScreenshotUtil {

    private ScreenshotUtil(){}

    public static String capture(String testName){

        File source = ((TakesScreenshot)
                DriverManager.getDriver())
                .getScreenshotAs(OutputType.FILE);

        String destination =
                FrameworkConstants.SCREENSHOT_PATH
                        + testName + ".png";

        try{

            FileUtils.copyFile(source,new File(destination));

        }

        catch(IOException e){

            throw new RuntimeException(e);

        }

        return destination;

    }

}