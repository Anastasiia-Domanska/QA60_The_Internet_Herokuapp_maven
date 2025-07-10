package com.the_internet.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPage extends BasePage {

    @FindBy(css = "input[type='range']")
    private WebElement slider;

    @FindBy(id = "range")
    private WebElement valueLabel;

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void moveSliderTo(double targetValue) {
        if (targetValue < 0 || targetValue > 5 || targetValue % 0.5 != 0) {
            throw new IllegalArgumentException("Значение должно быть от 0 до 5 с шагом 0.5");
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));",
                slider, targetValue
        );
    }

    public boolean isSliderValue(double expectedValue) {
        try {
            double currentValue = Double.parseDouble(getSliderValue());
            return currentValue == expectedValue;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String getSliderValue() {
        return valueLabel.getText();
    }
}
