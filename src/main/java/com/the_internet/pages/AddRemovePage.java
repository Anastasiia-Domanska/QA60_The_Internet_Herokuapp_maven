package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemovePage extends BasePage {

    @FindBy(xpath = "//button[text()='Add Element']")
    WebElement addButton;

    @FindBy(className = "added-manually")
    WebElement deleteButton;

    public AddRemovePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickAddElement() {
        click(addButton);
    }

    public boolean isDeleteButtonVisible() {
        return isElementPresent(deleteButton);
    }

    public void clickDeleteButton() {
        click(deleteButton);
    }

    public boolean isDeleteButtonNotVisible() {
        return !isElementPresent(deleteButton);
    }
}
