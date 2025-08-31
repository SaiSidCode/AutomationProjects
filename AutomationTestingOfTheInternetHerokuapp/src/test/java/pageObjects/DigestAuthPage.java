package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DigestAuthPage {

    WebDriver driver;

    public DigestAuthPage(WebDriver driver){
        this.driver = driver;
    }

    By PageTitle = By.cssSelector("div[class='example'] h3");
    By Description = By.cssSelector("div[class='example'] p");

    public void CheckIfUserEnteredDigestAuthPage(){
        String expectedPageTitle = "Digest Auth";
        String expectedDescription = "Congratulations! You must have the proper credentials.";
        String actualPageTitle = driver.findElement(PageTitle).getText();
        String actualDescription = driver.findElement(Description).getText();

        Assert.assertEquals(actualPageTitle,expectedPageTitle);
        Assert.assertEquals(actualDescription,expectedDescription);
    }
}
