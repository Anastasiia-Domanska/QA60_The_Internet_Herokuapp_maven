package com.the_internet.tests;

import com.the_internet.pages.DragAndDropPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase {

    private DragAndDropPage dragAndDropPage;

    @BeforeMethod
    public void setUpDragAndDrop() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        dragAndDropPage = new DragAndDropPage(driver);
    }

    @Test
    public void shouldDragColumnAToColumnB() {
        dragAndDropPage.dragAToB();

        Assert.assertEquals(dragAndDropPage.getColumnAText(), "B");
        Assert.assertEquals(dragAndDropPage.getColumnBText(), "A");
    }
}
