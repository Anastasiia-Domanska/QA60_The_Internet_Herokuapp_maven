package com.the_internet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends BasePage {

    public By checkbox1 = By.xpath("//form[@id='checkboxes']/input[1]");
    public By checkbox2 = By.xpath("//form[@id='checkboxes']/input[2]");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void toggleCheckbox1() {
        click(checkbox1);
    }

    public void toggleCheckbox2() {
        click(checkbox2);
    }

    public boolean isCheckbox1Selected() {
        return driver.findElement(checkbox1).isSelected();
    }

    public boolean isCheckbox2Selected() {
        return driver.findElement(checkbox2).isSelected();
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
