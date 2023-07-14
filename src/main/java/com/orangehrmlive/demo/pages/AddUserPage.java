package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddUserPage extends Utility {
    By addUser = By.xpath("//h6[text()='Add User']");
    By userRole = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)");
    By userRoleCick = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    By status = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
    By statusClick = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
    By saveButton = By.xpath("//button[text()=' Save ']");
    By cancelButton = By.xpath("//button[text()=' Cancel ']");
    By password = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By confirmPassword = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By userName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

    public String getAddUserText() {
        return gettextFromElement(addUser);
    }

    public void selectUserRoleDropDown(String option) {
        clickOnElement(userRoleCick);
        try {
            List<WebElement> userManagementList = driver.findElements(userRole);
            for (WebElement element : userManagementList) {
                if (element.getText().equals(option)) {
                    element.click();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectStatusDropDown(String option) {
        List<WebElement> userManagementList = driver.findElements(status);
        for (WebElement element : userManagementList) {
            if (element.getText().equals(option)) {
                element.click();
            }
        }
    }

    public void clickonUserRole() {
        clickOnElement(userRoleCick);
    }

    public void clickOnStatus() {
        clickOnElement(statusClick);
    }

    public void sendTextToEmployeeName(String option) {
        sendTextToElement(employeeName, option);
    }

    public void sendTextToUserName(String option) {
        sendTextToElement(userName, option);
    }

    public void sendTextToPassword(String option) {
        sendTextToElement(password, option);
    }

    public void sendTextToConfirmPassword(String option) {
        sendTextToElement(confirmPassword, option);
    }
public void clickOnSaveButton(){ clickOnElement(saveButton);}
}




