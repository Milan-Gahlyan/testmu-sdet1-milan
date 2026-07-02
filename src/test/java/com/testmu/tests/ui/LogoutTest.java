package com.testmu.tests.ui;

import com.testmu.base.BaseTest;
import com.testmu.manager.PageManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void verifyLogout() {

        PageManager
                .loginPage()
                .login("Admin","admin123")
                .logout();

        Assert.assertTrue(

                PageManager
                        .loginPage()
                        .isForgotPasswordDisplayed()

        );

    }

}