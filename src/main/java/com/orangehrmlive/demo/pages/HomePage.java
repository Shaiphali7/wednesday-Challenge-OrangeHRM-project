package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By search= By.xpath("//input[@placeholder='Search']");
    By admin=By.xpath("//span[text()='Admin']");
    By pim=By.xpath("//span[text()='PIM']");
    By dashboard=By.xpath("//span[text()='Dashboard']");
    By profile=By.xpath("//img[@class='oxd-userdropdown-img']");
    By logOut=By.xpath("//a[contains(text(),'Logout')]");
    public void clickOnPIM()
    {
        clickOnElement(pim);
    }
    public void clickOnDashBoard()
    {
        clickOnElement(dashboard);
    }
    public void clickOnAdmin()
    {
        clickOnElement(admin);
    }
    public void clickOnSearch()
    {
        clickOnElement(search);
    }
    public void clickOnProfile()
    {
        clickOnElement(profile);
    }
    public void mouseHoverAndClickOnLogOut()
    {
        mouseHoverToElement(profile);
    }
    public void clickOnLogOut()
    {
        clickOnElement(logOut);
    }



}
