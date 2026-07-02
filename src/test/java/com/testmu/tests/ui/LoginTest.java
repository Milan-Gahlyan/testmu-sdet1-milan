package com.testmu.tests.ui;

import com.testmu.base.BaseTest;
import com.testmu.pages.DashboardPage;
import com.testmu.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Verify valid login")

    public void verifyValidLogin() {

        DashboardPage dashboardPage =
                new LoginPage()

                        .login(
                                "Admin",
                                "admin123");

        Assert.assertTrue(

                dashboardPage.isDashboardDisplayed()

        );

    }

}