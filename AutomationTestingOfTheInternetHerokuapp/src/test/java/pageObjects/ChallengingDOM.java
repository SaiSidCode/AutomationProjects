package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChallengingDOM {

    WebDriver driver;
    WebDriverWait wait;

    public ChallengingDOM(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(12));
    }

    By blueButton = By.xpath("//a[contains(@class, 'button')]");
    By redButton = By.xpath("//a[contains(@class, 'button alert')]");
    By greenButton = By.xpath("//a[contains(@class, 'button success')]");

    public void TapOnBlueButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(blueButton)).click();
    }

    public void TapOnRedButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(redButton)).click();
    }

    public void TapOnGreenButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(greenButton)).click();
    }
}
