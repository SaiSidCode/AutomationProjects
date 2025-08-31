package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DynamicContentPage {

    WebDriver driver;

    public DynamicContentPage(WebDriver driver){
        this.driver = driver;
    }

    By firstTextLocator = By.xpath("(//div[@class='large-10 columns'])[1]");

    public void TextandImagesChanges(){
        String firstText = driver.findElement(firstTextLocator).getText();
        driver.navigate().refresh();
        String secondText = driver.findElement(firstTextLocator).getText();

        Assert.assertNotEquals(firstText, secondText, "Content did not change after refresh!");
    }
}
