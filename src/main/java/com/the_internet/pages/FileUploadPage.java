package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {

    @FindBy(id = "file-upload")
    private WebElement chooseFileInput;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(tagName = "h3")
    private WebElement successHeader;

    @FindBy(id = "uploaded-files")
    private WebElement uploadedFileName;

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public FileUploadPage uploadFile(String path) {
        chooseFileInput.sendKeys(path);
        submit();
        return this;
    }

    public void submit() {
        uploadButton.click();
    }

    public String getUploadedFileName() {
        return uploadedFileName.getText();
    }

    public boolean isSuccessDisplayed() {
        return successHeader.getText().equals("File Uploaded!");
    }
}
