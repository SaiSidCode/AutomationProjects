package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ContentMenuPage {

    WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    public ContentMenuPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By ContentBox = By.cssSelector("#hot-spot");

    public void RightClickOnContentBox(){
        WebElement box = driver.findElement(ContentBox);
        new Actions(driver).contextClick(box).perform();
    }

    public void CheckIfAlertAppears(){
        alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        Assert.assertEquals(alertText,"You selected a context menu");
        System.out.println(alertText);
    }

    public void ClosetheAlert(){
        alert.accept();
    }
}
