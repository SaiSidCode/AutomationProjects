package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddDeletePage {

    WebDriver driver;
    WebDriverWait wait;

    public AddDeletePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By addButton = By.cssSelector("button[onclick='addElement()']");
    By deleteButton = By.xpath("//button[text()='Delete']");
    Integer length = 10;

    public void AddButton(){
        WebElement addbuttonvisible = wait.until(ExpectedConditions.visibilityOfElementLocated(addButton));
        for (int i = 0; i < length; i++) {
            addbuttonvisible.click();
        }
    }

    public void DeleteButton(){
        List<WebElement> deleteButtonList = driver.findElements(deleteButton);
        System.out.println("The number of buttons that can be deleted " + deleteButtonList.size());

        for (WebElement webElement : deleteButtonList) {
            deleteButtonList = driver.findElements(deleteButton);
           if (!deleteButtonList.isEmpty()){
               webElement.click();
           }
        }
    }
}
