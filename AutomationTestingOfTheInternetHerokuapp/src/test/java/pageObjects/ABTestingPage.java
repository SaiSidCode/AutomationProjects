package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ABTestingPage {

    WebDriver driver;
    WebDriverWait wait;

    public ABTestingPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By ABTestingPageTitle = By.cssSelector("div[class='example'] h3");


    public void CheckIfOnABTestingPage(){
        WebElement pageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(ABTestingPageTitle));
        String actualTitle = pageTitle.getText();
        Assert.assertTrue(actualTitle.contains("A/B Test"), "User is not on ABTesting Page");
    }

    public void CheckIfUserCohort(){
      String pageTitle = driver.findElement(ABTestingPageTitle).getText();
      if (pageTitle.contains("Control")){
          System.out.println("Control is displayed");
      }
      else {
          System.out.println("Variation is displayed");
      }
    }

}
