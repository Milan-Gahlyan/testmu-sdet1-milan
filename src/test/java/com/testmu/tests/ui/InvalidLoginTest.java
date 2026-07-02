package com.testmu.tests.ui;

import com.testmu.base.BaseTest;
import com.testmu.manager.PageManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void verifyInvalidPassword() {

        String message =

                PageManager

                        .loginPage()

                        .loginExpectingFailure(
                                "Admin",
                                "wrongPassword")

                        .getErrorMessage();

        Assert.assertTrue(

                message.contains("Invalid")

        );

    }

}