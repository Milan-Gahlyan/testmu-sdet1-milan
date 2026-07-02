package com.testmu.tests.ui;

import com.testmu.base.BaseTest;
import com.testmu.manager.PageManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Verify valid login")
    public void verifyValidLogin() {

        Assert.assertTrue(

                PageManager

                        .loginPage()

                        .login(
                                "Admin",
                                "admin123")

                        .isDashboardDisplayed()

        );

    }
}