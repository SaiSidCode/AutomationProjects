package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckboxesPage {
    WebDriver driver;

    public CheckboxesPage(WebDriver driver){
        this.driver = driver;
    }

    By checkbox1 = By.xpath("//input[1]");
    By checkbox2 = By.xpath("//input[2]");


    public void CheckIfCheckboxesSelected(){
        WebElement checkbox1item = driver.findElement(checkbox1);
        WebElement checkbox2item = driver.findElement(checkbox2);
        System.out.println("Checkbox 1 is selected? " + checkbox1item.isSelected());
        System.out.println("Checkbox 2 is selected? " + checkbox2item.isSelected());
    }

    public void CheckAllCheckboxes(){
        WebElement checkbox1item = driver.findElement(checkbox1);
        WebElement checkbox2item = driver.findElement(checkbox2);

        if(!checkbox1item.isSelected()){
            checkbox1item.click();
        }
        if (!checkbox2item.isSelected()){
            checkbox2item.click();
        }

        Assert.assertTrue(checkbox1item.isSelected(), "Checkbox 1 is selected");
        Assert.assertTrue(checkbox2item.isSelected(), "Checkbox 2 is selected");
    }
}
