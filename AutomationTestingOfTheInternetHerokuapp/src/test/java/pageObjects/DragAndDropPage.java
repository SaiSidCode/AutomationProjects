package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDropPage {

    WebDriver driver;

    public DragAndDropPage(WebDriver driver){
        this.driver = driver;
    }

    By boxALocator = By.cssSelector("#column-a");
    By boxBLocator = By.cssSelector("#column-b");

    WebElement boxA;
    WebElement boxB;

    public void DragAtoB(){
        boxA = driver.findElement(boxALocator);
        boxB = driver.findElement(boxBLocator);

        Assert.assertEquals(boxA.getText(),"A");
        Assert.assertEquals(boxB.getText(),"B");

        Actions actions = new Actions(driver);
        actions.dragAndDrop(boxA,boxB).perform();
    }

    public void CheckifAIsReplaceWithB(){
        Assert.assertEquals(boxA.getText(), "B");
        Assert.assertEquals(boxB.getText(), "A");
    }

    public void DragBtoA(){
        boxA = driver.findElement(boxALocator);
        boxB = driver.findElement(boxBLocator);

        Assert.assertEquals(boxA.getText(),"B");
        Assert.assertEquals(boxB.getText(),"A");

        Actions actions = new Actions(driver);
        actions.dragAndDrop(boxA,boxB).perform();
    }

    public void CheckifBIsReplaceWithA(){
        Assert.assertEquals(boxA.getText(), "A");
        Assert.assertEquals(boxB.getText(), "B");
    }
}
