package com.the_internet.tests;

import com.the_internet.pages.CheckboxesPage;
import com.the_internet.pages.DropdownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownAndCheckboxesTest extends TestBase {

    @Test
    public void testSelectDropdownOption() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.selectOptionByValue("2");
        Assert.assertEquals(dropdownPage.getSelectedOptionText(), "Option 2");
    }

    @Test
    public void testCheckboxesToggle() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        CheckboxesPage page = new CheckboxesPage(driver);

        Assert.assertNotEquals(page.toggleAndCheckCheckbox1(), page.toggleAndCheckCheckbox1(),
                "Checkbox 1 state should toggle.");
        Assert.assertNotEquals(page.toggleAndCheckCheckbox2(), page.toggleAndCheckCheckbox2(),
                "Checkbox 2 state should toggle.");
    }

}
