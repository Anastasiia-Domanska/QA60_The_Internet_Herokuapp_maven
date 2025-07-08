package com.the_internet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By formAuthLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickFormAuth() {
        click(formAuthLink);
        return new LoginPage(driver);
    }

}
