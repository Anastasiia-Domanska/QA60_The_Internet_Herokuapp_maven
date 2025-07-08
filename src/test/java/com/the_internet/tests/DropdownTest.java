package com.the_internet.tests;

import com.the_internet.pages.DropdownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends TestBase {

    @Test
    public void testSelectDropdownOption() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.selectOptionByValue("2");
        Assert.assertEquals(dropdownPage.getSelectedOptionText(), "Option 2", "Должен быть выбран Option 2");
    }
}
