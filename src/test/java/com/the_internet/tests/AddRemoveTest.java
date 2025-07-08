package com.the_internet.tests;

import com.the_internet.pages.AddRemovePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveTest extends TestBase {

    @Test
    public void testAddElementButton() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        AddRemovePage page = new AddRemovePage(driver);
        page.clickAddElement();
        Assert.assertTrue(page.isDeleteButtonVisible(), "Delete button should appear after clicking Add Element.");
    }

    @Test
    public void testDeleteElementButton() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        AddRemovePage page = new AddRemovePage(driver);
        page.clickAddElement();
        page.clickDeleteButton();
        Assert.assertTrue(page.isDeleteButtonNotVisible(), "Delete button should disappear after clicking it.");
    }

    @Test
    public void testMultipleAddElements() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        AddRemovePage page = new AddRemovePage(driver);
        page.clickAddElement();
        page.clickAddElement();
        page.clickAddElement();
        int count = driver.findElements(By.className("added-manually")).size();
        Assert.assertEquals(count, 3, "There should be exactly 3 Delete buttons.");
    }
}
