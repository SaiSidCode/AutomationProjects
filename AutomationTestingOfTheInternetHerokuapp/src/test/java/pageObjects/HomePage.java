package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By homePageHeadings = By.cssSelector(".heading");
    By ListOfAllButtonLocators = By.cssSelector("ul li a");

    public String getHomepageTitle(){
        return driver.getTitle();
    }

    public String getHompageHeadingText(){
        return driver.findElement(homePageHeadings).getText();
    }

    public WebElement HomePageButtonList(Integer index){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ListOfAllButtonLocators));
        List<WebElement> ListOfAllButtons = driver.findElements(ListOfAllButtonLocators);
        return ListOfAllButtons.get(index);
    }

    public void enterABTestingPage(){
        HomePageButtonList(0).click();
    }

    public void enterAddRemoveButtonPage(){
        HomePageButtonList(1).click();
    }

    public void enterBrokenImagePage(){
        HomePageButtonList(3).click();
    }

    public void enterChallengingDOMPage(){
        HomePageButtonList(4).click();
    }

    public void enterCheckBoxesPage(){
        HomePageButtonList(5).click();
    }

    public void enterContextMenuPage(){
        HomePageButtonList(6).click();
    }

    public void enterDigestAuthPage(){
        HomePageButtonList(7).click();
    }

    public void enterDisappearingButtonPage(){
        HomePageButtonList(8).click();
    }

    public void enterDragAndDropPage(){
        HomePageButtonList(9).click();
    }

    public void enterDropDownPage(){
        HomePageButtonList(10).click();
    }

    public void enterDynamicContentPage(){
        HomePageButtonList(11).click();
    }

    public void enterDynamicControlPage(){HomePageButtonList(12).click();}

    public void enterFileUploadPage(){HomePageButtonList(17).click();}
}
