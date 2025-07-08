package com.the_internet.tests;

import com.the_internet.pages.HomePage;
import com.the_internet.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testValidLogin() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickFormAuth();
        loginPage.login("tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));

    }
}
