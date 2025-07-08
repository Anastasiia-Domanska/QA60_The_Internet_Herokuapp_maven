package com.the_internet.tests;

import com.the_internet.pages.CheckboxesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase {

    @Test
    public void testCheckboxesToggle() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        CheckboxesPage page = new CheckboxesPage(driver);

        if (!page.isCheckbox1Selected()) {
            page.toggleCheckbox1();
        }

        if (!page.isCheckbox2Selected()) {
            page.toggleCheckbox2();
            page.toggleCheckbox2();
        }

        Assert.assertTrue(page.isCheckbox1Selected(), "Checkbox 1 должен быть включён");
        Assert.assertTrue(page.isCheckbox2Selected(), "Checkbox 2 должен быть включён");
    }

}
