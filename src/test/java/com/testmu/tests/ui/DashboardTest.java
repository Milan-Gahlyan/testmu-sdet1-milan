package com.testmu.tests.ui;

import com.testmu.base.BaseTest;
import com.testmu.manager.PageManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {

    @Test
    public void verifyDashboardWidgets() {

        PageManager

                .loginPage()

                .login(
                        "Admin",
                        "admin123");

        Assert.assertTrue(

                PageManager

                        .dashboardPage()

                        .isSideMenuDisplayed()

        );

        Assert.assertTrue(

                PageManager

                        .dashboardPage()

                        .isUserMenuDisplayed()

        );

    }

}