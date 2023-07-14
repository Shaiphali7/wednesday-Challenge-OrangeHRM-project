package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdminPage extends Utility {
    By userManagement=By.xpath("//i[@class='oxd-icon bi-chevron-down']");
    public void dropDownExampleList(String option) {
        try {
            List<WebElement> userManagementList = driver.findElements(userManagement);
            for (WebElement element :userManagementList ) {
                if (element.getText().equals(option)) {
                    element.click();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
