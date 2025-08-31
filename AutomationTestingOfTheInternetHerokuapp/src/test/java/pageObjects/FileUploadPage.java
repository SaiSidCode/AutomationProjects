package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileUploadPage {

    WebDriver driver;
    WebDriverWait wait;

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By uploadBoxLocator = By.id("file-upload");
    By uploadButtonLocator = By.id("file-submit");
    By uploadedFileNameLocator = By.id("uploaded-files");

    public void UploadsFiles(){
        WebElement uploadInput = driver.findElement(uploadBoxLocator);
        uploadInput.sendKeys(System.getProperty("user.dir") +"/src/test/resources/testFile.txt");
        driver.findElement(uploadButtonLocator).click();
    }

    public void CheckIfFileIsUploaded(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadedFileNameLocator));
        WebElement uploadedFile = driver.findElement(uploadedFileNameLocator) ;
        String uploadedFileName = uploadedFile.getText();

        if (uploadedFileName.equals("testFile.txt")) {
            System.out.println("✅ File uploaded successfully: " + uploadedFileName);
        } else {
            System.out.println("❌ File upload failed!");
        }
    }
}
