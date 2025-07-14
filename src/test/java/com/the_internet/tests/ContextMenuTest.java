package com.the_internet.tests;

import com.the_internet.pages.ContextMenuPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContextMenuTest extends TestBase {

    private ContextMenuPage contextMenuPage;

    @BeforeMethod
    public void setUpContextMenu() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        contextMenuPage = new ContextMenuPage(driver);
    }

    @Test
    public void shouldShowContextMenuAlert() {
        String alertText = contextMenuPage
                .rightClickOnBox()
                .getAndAcceptAlertText();

        Assert.assertEquals(alertText, "You selected a context menu");
    }
}
