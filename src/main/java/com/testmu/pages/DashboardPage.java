package com.testmu.pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

    private final By dashboardHeader =
            By.xpath("//h6[text()='Dashboard']");

    private final By userDropdown =
            By.xpath("//span[@class='oxd-userdropdown-tab']");

    private final By sideMenu =
            By.xpath("//aside");

    public boolean isDashboardDisplayed() {

        return isDisplayed(dashboardHeader);

    }

    public boolean isSideMenuDisplayed() {

        return isDisplayed(sideMenu);

    }

    public boolean isUserMenuDisplayed() {

        return isDisplayed(userDropdown);

    }

}