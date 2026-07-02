package com.testmu.pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

    private final By dashboardHeader =
            By.xpath("//h6[text()='Dashboard']");

    private final By sideMenu =
            By.xpath("//aside");

    private final By userDropdown =
            By.xpath("//span[contains(@class,'oxd-userdropdown-tab')]");

    private final By logoutButton =
            By.xpath("//a[text()='Logout']");

    private final By adminMenu =
            By.xpath("//span[text()='Admin']");

    private final By pimMenu =
            By.xpath("//span[text()='PIM']");

    private final By leaveMenu =
            By.xpath("//span[text()='Leave']");

    private final By timeMenu =
            By.xpath("//span[text()='Time']");

    private final By recruitmentMenu =
            By.xpath("//span[text()='Recruitment']");

    private final By myInfoMenu =
            By.xpath("//span[text()='My Info']");

    public boolean isDashboardDisplayed() {
        return isDisplayed(dashboardHeader);
    }

    public boolean isSideMenuDisplayed() {
        return isDisplayed(sideMenu);
    }

    public boolean isUserMenuDisplayed() {
        return isDisplayed(userDropdown);
    }

    public DashboardPage openAdmin() {
        click(adminMenu);
        return this;
    }

    public DashboardPage openPIM() {
        click(pimMenu);
        return this;
    }

    public DashboardPage openLeave() {
        click(leaveMenu);
        return this;
    }

    public DashboardPage openTime() {
        click(timeMenu);
        return this;
    }

    public DashboardPage openRecruitment() {
        click(recruitmentMenu);
        return this;
    }

    public DashboardPage openMyInfo() {
        click(myInfoMenu);
        return this;
    }

    public LoginPage logout() {

        click(userDropdown);

        click(logoutButton);

        return new LoginPage();

    }

}