package com.the_internet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    public By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectOptionByValue(String value) {
        Select select = new Select(driver.findElement(dropdown));
        select.selectByValue(value);
    }

    public String getSelectedOptionText() {
        Select select = new Select(driver.findElement(dropdown));
        return select.getFirstSelectedOption().getText();
    }
}
