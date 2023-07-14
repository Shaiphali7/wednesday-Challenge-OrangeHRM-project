package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewSystemUserPage extends Utility {
    By userName=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By systemUser=By.tagName("h5");
    By UserRole=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By userRoleClick=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By employeeName= By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]");
    By status=By.xpath("//div[@class='oxd-select-text-input']");
    By search=By.xpath("//button[text()=' Search ']");
    By reset=By.xpath("//button[text()=' Reset ']");
    By add=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");
    By userCheckBox=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]");
     By deleteButton=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]/i[1]");
     By deleteConfirm=By.xpath("//body/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[3]/button[2]");
public String getSystemUserText()
{
    return gettextFromElement(systemUser);
}
public void clickOnAddButton()
{
    clickOnElement(add);
}
    public void clickOnResetButton()
    {
        clickOnElement(reset);
    }

    public void sendUserName(String option)
    {
        sendTextToElement(userName,option);
    }

    public void selectUserRoleDropDown(String option) {
        clickOnElement(userRoleClick);
        try {
            List<WebElement> userManagementList = driver.findElements(UserRole);
            for (WebElement element : userManagementList) {
                if (element.getText().equals(option)) {
                    element.click();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void setAdminInDropDown(String option)
    {
        sendTextToElement(UserRole,option);
    }
    public void clickOnSearchButton()
    {
        clickOnElement(search);
    }
    public void clickOnUserCheckBpx()
    {
        clickOnElement(userCheckBox);
    }
    public void clickOnDeleteButton()
    {
        clickOnElement(deleteButton);
    }
    public void clickOnDeleteConfirm()
    {
        clickOnElement(deleteConfirm);
    }





}
