package com.testmu.constants;

public final class FrameworkConstants {

    private FrameworkConstants() {}

    // Application URLs
    public static final String UI_BASE_URL = "https://www.saucedemo.com/";
    public static final String API_BASE_URL = "https://restful-booker.herokuapp.com";

    // Config File
    public static final String CONFIG_FILE_PATH =
            "src/test/resources/config.properties";

    // Reports
    public static final String REPORT_PATH =
            System.getProperty("user.dir") + "/test-output/ExtentReport.html";

    // Screenshots
    public static final String SCREENSHOT_PATH =
            System.getProperty("user.dir") + "/test-output/screenshots/";

}