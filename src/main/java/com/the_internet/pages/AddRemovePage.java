package com.the_internet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage extends BasePage{

    public By addButton = By.xpath("//button[text()='Add Element']");
    public By deleteButton = By.className("added-manually");

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    public void clickAddElement() {
        click(addButton);
    }

    public boolean isDeleteButtonVisible() {
        return driver.findElements(deleteButton).size() > 0;
    }

    public void clickDeleteButton() {
        click(deleteButton);
    }

    public boolean isDeleteButtonNotVisible() {
        return driver.findElements(deleteButton).isEmpty();
    }
}
