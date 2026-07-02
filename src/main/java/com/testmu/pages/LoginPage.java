package com.testmu.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By username =
            By.name("username");

    private final By password =
            By.name("password");

    private final By loginButton =
            By.xpath("//button[@type='submit']");

    private final By errorMessage =
            By.xpath("//p[contains(@class,'alert')]");

    public LoginPage enterUsername(String user) {

        type(username, user);

        return this;

    }

    public LoginPage enterPassword(String pass) {

        type(password, pass);

        return this;

    }

    public DashboardPage clickLogin() {

        click(loginButton);

        return new DashboardPage();

    }

    public DashboardPage login(String user, String pass) {

        enterUsername(user);

        enterPassword(pass);

        return clickLogin();

    }

    public String getErrorMessage() {

        return getText(errorMessage);

    }

}