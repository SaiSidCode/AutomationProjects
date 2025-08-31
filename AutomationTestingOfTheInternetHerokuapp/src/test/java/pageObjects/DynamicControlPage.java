package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DynamicControlPage {

    WebDriver driver;
    WebDriverWait wait;

    public DynamicControlPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By addRemoveButtonLocator = By.cssSelector("button[onclick='swapCheckbox()']");
    By checkBoxLocator = By.cssSelector("input[type='checkbox']");
    By enableDisableButtonLocator = By.cssSelector("button[onclick='swapInput()']");
    By testBoxButtonLocator = By.cssSelector("input[type='text']");


    public void TapOnRemoveButton(){
        driver.findElement(addRemoveButtonLocator).click();
    }
    public void TapOnAddButton(){
        wait.until(ExpectedConditions.elementToBeClickable(addRemoveButtonLocator));
        driver.findElement(addRemoveButtonLocator).click();
    }

    public void CheckIfCheckboxRemoved(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(checkBoxLocator));
        Assert.assertTrue(driver.findElements(checkBoxLocator).isEmpty(),"Checkbox failed to remove");
    }

    public void CheckIfCheckboxAdded(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkBoxLocator));
        driver.findElement(checkBoxLocator).click();
        Assert.assertTrue(driver.findElement(checkBoxLocator).isDisplayed(),"Checkbox failed to add");
    }

    public void CheckIfButtonNameChanged(){
       String buttonName = driver.findElement(addRemoveButtonLocator).getText();
       if (buttonName.equals("Add")){
           System.out.println(buttonName);
           Assert.assertEquals(buttonName, "Add");
       }
       if (buttonName.equals("Remove")) {
           System.out.println(buttonName);
           Assert.assertEquals(buttonName, "Remove");
       }
    }
    public void TapOnEnableButton(){
        driver.findElement(enableDisableButtonLocator).click();
    }
    public void TapOnDisableButton(){
        wait.until(ExpectedConditions.elementToBeClickable(enableDisableButtonLocator));
        driver.findElement(enableDisableButtonLocator).click();
    }

    public void CheckTextboxIsEnabled(){
        wait.until(ExpectedConditions.elementToBeClickable(testBoxButtonLocator));
        Assert.assertTrue(driver.findElement(testBoxButtonLocator).isEnabled(), "TextBox is not enabled");
    }
    public void CheckTextboxIsDisabled(){
        wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(testBoxButtonLocator)));
        Assert.assertFalse(driver.findElement(testBoxButtonLocator).isEnabled(), "TextBox is enabled");
    }

    public void CheckifEnableDisableButtonNameChanges(){
        String buttonName = driver.findElement(testBoxButtonLocator).getText();
        if (buttonName.equals("Enable")){
            System.out.println("Button Text is" + buttonName);
            Assert.assertEquals(buttonName, "Enable");
        }
        if (buttonName.equals("Disable")){
            System.out.println("Button Text is" + buttonName);
            Assert.assertEquals(buttonName,"Disable");
        }
    }
}
