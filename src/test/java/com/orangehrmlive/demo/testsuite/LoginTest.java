package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    HomePage homePage=new HomePage();
    @Test
    public void verifyUserShouldLoginSuccessFully() {
//        Enter username
//        Enter password
//        Click on Login Button
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
//        Verify "Dashboard" Message
        String actualMessage=dashboardPage.getDashBoardText();
        Assert.assertEquals(actualMessage,"Dashboard","Not a dashboardPage");

    }
    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage() {
//        Launch the application
//        Verify Logo is Displayed
        //Assert.assertTrue(loginPage.verifyCompanyLogo());

    }
    @Test
    public void VerifyUserShouldLogOutSuccessFully() {
//        Login To The application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
//        Click on User Profile logo
        homePage.clickOnProfile();
//        Mouse hover on "Logout" and click
        homePage.mouseHoverAndClickOnLogOut();
        homePage.clickOnLogOut();

//        Verify the text "Login Panel" is displayed
        String actualLoginText=loginPage.getLoginText();
        Assert.assertEquals(actualLoginText,"Login","not a login page");
    }

}
