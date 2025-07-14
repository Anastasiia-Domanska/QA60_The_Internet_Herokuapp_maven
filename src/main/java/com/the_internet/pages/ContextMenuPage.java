package com.the_internet.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hot-spot")
    WebElement hotSpot;
    public ContextMenuPage rightClickOnBox() {
        new Actions(driver).contextClick(hotSpot).perform();
        return this;
    }

    public String getAndAcceptAlertText() {
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        return text;
    }
}
