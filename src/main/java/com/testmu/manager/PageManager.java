package com.testmu.manager;

import com.testmu.pages.DashboardPage;
import com.testmu.pages.LoginPage;

public final class PageManager {

    private PageManager() {}

    private static final ThreadLocal<LoginPage> loginPage =
            ThreadLocal.withInitial(LoginPage::new);

    private static final ThreadLocal<DashboardPage> dashboardPage =
            ThreadLocal.withInitial(DashboardPage::new);

    public static LoginPage loginPage() {
        return loginPage.get();
    }

    public static DashboardPage dashboardPage() {
        return dashboardPage.get();
    }

    public static void unload() {
        loginPage.remove();
        dashboardPage.remove();
    }
}