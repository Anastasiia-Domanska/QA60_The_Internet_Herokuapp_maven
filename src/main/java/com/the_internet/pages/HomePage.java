package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(linkText = "Form Authentication")
    WebElement formAuthLink;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickFormAuth() {
        click(formAuthLink);
        return new LoginPage(driver);
    }

    @FindBy(xpath = "//a[.='Hovers']")
    WebElement hovers;
    public HoversPage selectHovers() {
        click(hovers);
        return new HoversPage(driver);

    }

    @FindBy(css = "a[href='/upload']")
    WebElement fileUpload;
    public HomePage clickFileUpload() {
        click(fileUpload);
        return this;
    }
}

