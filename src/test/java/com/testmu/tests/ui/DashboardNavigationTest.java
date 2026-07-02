package com.testmu.tests.ui;

import com.testmu.base.BaseTest;
import com.testmu.manager.PageManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardNavigationTest extends BaseTest {

    @BeforeMethod
    public void login() {

        PageManager
                .loginPage()
                .login("Admin", "admin123");

    }

    @Test
    public void verifyAdminNavigation() {

        PageManager
                .dashboardPage()
                .openAdmin();

        Assert.assertTrue(

                PageManager
                        .dashboardPage()
                        .getCurrentUrl()
                        .contains("admin")

        );

    }

    @Test
    public void verifyPIMNavigation() {

        PageManager
                .dashboardPage()
                .openPIM();

        Assert.assertTrue(

                PageManager
                        .dashboardPage()
                        .getCurrentUrl()
                        .contains("pim")

        );

    }

    @Test
    public void verifyLeaveNavigation() {

        PageManager
                .dashboardPage()
                .openLeave();

        Assert.assertTrue(

                PageManager
                        .dashboardPage()
                        .getCurrentUrl()
                        .contains("leave")

        );

    }

}