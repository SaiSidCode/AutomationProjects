package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasicAuthPage {

    WebDriver driver;
    WebDriverWait wait;

    public BasicAuthPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By welcomeText = By.cssSelector("div[class='example'] p");

    public void LoginIntoBasicAuth(){

        String username = "admin";
        String password = "admin";
        String baseUrl = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";
        driver.get(baseUrl);
    }

    public void CheckIfBasicAuthWasSuccess(){

        String expectedText = "Congratulations! You must have the proper credentials.";
        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeText)).getText();
        Assert.assertEquals(actualText,expectedText, "User failed to login");

    }
}
