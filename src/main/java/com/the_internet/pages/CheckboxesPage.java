package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage extends BasePage {

    @FindBy(xpath = "//form[@id='checkboxes']/input[1]")
    WebElement checkbox1;

    @FindBy(xpath = "//form[@id='checkboxes']/input[2]")
    WebElement checkbox2;

    public CheckboxesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void toggleCheckbox1() {
        click(checkbox1);
    }

    public void toggleCheckbox2() {
        click(checkbox2);
    }

    public boolean isCheckbox1Selected() {
        return checkbox1.isSelected();
    }

    public boolean isCheckbox2Selected() {
        return checkbox2.isSelected();
    }

    public boolean toggleAndCheckCheckbox1() {
        toggleCheckbox1();
        return isCheckbox1Selected();
    }

    public boolean toggleAndCheckCheckbox2() {
        toggleCheckbox2();
        return isCheckbox2Selected();
    }
}
