package com.testmu.listeners;

import com.aventstack.extentreports.Status;
import com.testmu.reports.ExtentManager;
import com.testmu.reports.ExtentTestManager;
import com.testmu.utils.ScreenshotUtil;
import org.testng.*;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {

        ExtentManager.getInstance();

    }

    @Override
    public void onTestStart(ITestResult result) {

        String className =
                result.getTestClass().getRealClass().getSimpleName();

        String method =
                result.getMethod().getMethodName();

        String category =
                className.contains("Api")
                        ? "API"
                        : "UI";

        ExtentTestManager.setTest(

                ExtentManager
                        .getInstance()
                        .createTest(method)

                        .assignCategory(category)

                        .assignAuthor("Milan Gahlyan")

                        .assignDevice(System.getProperty("browser", "Chrome"))

        );

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentTestManager

                .getTest()

                .log(Status.PASS,"Test Passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {

        String screenshot =
                ScreenshotUtil.capture(
                        result.getMethod().getMethodName());

        ExtentTestManager

                .getTest()

                .fail(result.getThrowable())

                .addScreenCaptureFromPath(screenshot);

    }

    @Override
    public void onFinish(ITestContext context) {

        ExtentManager

                .getInstance()

                .flush();

    }

}