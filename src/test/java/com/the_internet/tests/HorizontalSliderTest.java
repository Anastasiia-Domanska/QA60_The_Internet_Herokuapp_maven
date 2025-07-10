package com.the_internet.tests;

import com.the_internet.pages.HorizontalSliderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends TestBase {

    @Test
    public void testSliderToMultipleValues() {
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        HorizontalSliderPage sliderPage = new HorizontalSliderPage(driver);

        sliderPage.moveSliderTo(2.5);
        Assert.assertTrue(sliderPage.isSliderValue(2.5), "Слайдер должен быть установлен на 2.5");

        sliderPage.moveSliderTo(4.0);
        Assert.assertTrue(sliderPage.isSliderValue(4.0), "Слайдер должен быть установлен на 4.0");

        sliderPage.moveSliderTo(0.0);
        Assert.assertTrue(sliderPage.isSliderValue(0.0), "Слайдер должен быть установлен на 0.0");
    }
}
