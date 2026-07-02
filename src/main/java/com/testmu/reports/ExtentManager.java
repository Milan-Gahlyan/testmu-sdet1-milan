package com.testmu.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public final class ExtentManager {

    private static ExtentReports extent;

    private ExtentManager() {}

    public static ExtentReports getInstance() {

        if(extent == null){

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("test-output/ExtentReport.html");

            spark.config().setReportName("TestMu AI Automation Report");
            spark.config().setDocumentTitle("Automation Execution Report");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo("Framework","Selenium + TestNG");

            extent.setSystemInfo("Author","Milan Gahlyan");

        }

        return extent;

    }

}