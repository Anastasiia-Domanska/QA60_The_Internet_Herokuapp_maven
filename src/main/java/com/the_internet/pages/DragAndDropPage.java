package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement columnA;
    @FindBy(id = "column-b")
    WebElement columnB;

    public DragAndDropPage dragAToB() {
        new Actions(driver).dragAndDrop(columnA, columnB).perform();
        return this;
    }

    public String getColumnAText() {
        return columnA.getText();
    }

    public String getColumnBText() {
        return columnB.getText();
    }
}
