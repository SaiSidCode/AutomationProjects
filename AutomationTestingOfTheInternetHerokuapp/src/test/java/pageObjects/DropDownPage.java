package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage {

    WebDriver driver;
    WebElement dropDownElement;
    Select dropdown;

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    By DropDownLocator = By.cssSelector("#dropdown");


    public void SelectOption(int int1){
        dropDownElement =  driver.findElement(DropDownLocator);

        dropdown = new Select(dropDownElement);
        dropdown.selectByIndex(int1);
    }

    public void CheckWitchIsSelected(int int1){
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        String selectedOptionText = selectedOption.getText();

        System.out.println("Option selected is " + selectedOptionText);
        Assert.assertEquals(selectedOptionText,"Option " + int1);
    }
}
