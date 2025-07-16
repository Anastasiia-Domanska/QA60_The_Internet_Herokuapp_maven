package com.the_internet.tests;

import com.the_internet.pages.FileUploadPage;
import com.the_internet.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).clickFileUpload();
    }

    @Test
    public void testFileUpload() {
        String filePath = "C:/Users/akvad/Desktop/img 1.webp"; // или относительный путь
        FileUploadPage fileUploadPage = new FileUploadPage(driver);

        fileUploadPage.uploadFile(filePath);

        Assert.assertTrue(fileUploadPage.isSuccessDisplayed(), "Upload confirmation not displayed");
        Assert.assertEquals(fileUploadPage.getUploadedFileName(), "img 1.webp");
    }

}
