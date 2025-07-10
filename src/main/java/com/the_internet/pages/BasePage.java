package com.the_internet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(WebElement element) {
        driver.findElement((By) element).click();
    }

    protected void type(WebElement element, String text) {
        driver.findElement((By) element).sendKeys(text);
    }

    protected boolean isElementPresent(WebElement element) {
        return !driver.findElements((By) element).isEmpty();
    }


    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }
}
