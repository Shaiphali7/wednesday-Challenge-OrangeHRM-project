package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ViewSystemUserPage systemUserPage = new ViewSystemUserPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
//        Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
//        click On "Admin" Tab
        // homePage.acceptAlert();
        homePage.clickOnAdmin();

//        Verify "System Users" Text
        String actualText = systemUserPage.getSystemUserText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Not a admin page");

//        click On "Add" button
        systemUserPage.clickOnAddButton();
//        Verify "Add User" Text
        String actualAddUserText = addUserPage.getAddUserText();
        Assert.assertEquals(actualAddUserText, "Add User");

//        Select User Role "Admin"
        //addUserPage.clickonUserRole();
        Thread.sleep(2000);
        //addUserPage.selectUserRoleDropDown("Admin");
        Thread.sleep(2000);
//        enter Employee Name "Ananya Dash"
        addUserPage.sendTextToEmployeeName("Ananya Dash");
//        enter Username
        addUserPage.sendTextToUserName("Ananya");
//        Select status "Disable"
        //addUserPage.clickOnStatus();
        Thread.sleep(1000);
        addUserPage.selectStatusDropDown("Disabled");
//        enter psaaword
        addUserPage.sendTextToPassword("Abcd1234");
//        enter Confirm Password
        addUserPage.sendTextToConfirmPassword("Abcd1234");
//        click On "Save" Button
        addUserPage.clickOnSaveButton();
//        verify message "Successfully Saved"

    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
//        Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
//        click On "Admin" Tab
        homePage.clickOnAdmin();
//        Verify "System Users" Text
        String actualText = systemUserPage.getSystemUserText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Not a admin page");
//        Enter Username
        systemUserPage.sendUserName("Dominic.Chase");
//        Select User Role
        systemUserPage.selectUserRoleDropDown("Admin");
//        Select Satatus
//        Click on "Search" Button
//        Verify the User should be in Result list.
    }
    @Test
   public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
//    Login to Application
       loginPage.enterUserName("Admin");
       loginPage.enterPassword("admin123");
       loginPage.clickOnLogin();
//    click On "Admin" Tab
       homePage.clickOnAdmin();
//    Verify "System Users" Text
       String actualText = systemUserPage.getSystemUserText();
       String expectedText = "System Users";
       Assert.assertEquals(actualText, expectedText, "Not a admin page");
//    Enter Username
       systemUserPage.sendUserName("Dominic.Chase");
//    Select User Role
       systemUserPage.setAdminInDropDown("Admin");
//    Select Satatus
//    Click on "Search" Button
systemUserPage.clickOnSearchButton();
//    Verify the User should be in Result list.

//    Click on Check box
        systemUserPage.clickOnUserCheckBpx();
//    Click on Delete Button
        systemUserPage.clickOnDeleteButton();
//    Popup will display
//    Click on Ok Button on Popup
        systemUserPage.clickOnDeleteConfirm();
//    verify message "Successfully Deleted"
//

   }
   @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
//       Login to Application
       loginPage.enterUserName("Admin");
       loginPage.enterPassword("admin123");
       loginPage.clickOnLogin();
//       click On "Admin" Tab
       homePage.clickOnAdmin();
//       Verify "System Users" Text
       String actualText = systemUserPage.getSystemUserText();
       String expectedText = "System Users";
       Assert.assertEquals(actualText, expectedText, "Not a admin page");
//       Enter Username
       systemUserPage.sendUserName("Dominic.Chase");
//       Select User Role
//       Select Satatus
//       Click on "Search" Button
//       verify message "No Records Found"
   }
}
