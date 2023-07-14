package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By dashBoardText=By.tagName("h6");
    public String getDashBoardText()
    {
        return gettextFromElement(dashBoardText);
    }
}
