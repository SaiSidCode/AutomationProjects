package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisappearingItemsPage {

    WebDriver driver;
    int disappearedCount;
    int appearedCount;

    public DisappearingItemsPage(WebDriver driver){
        this.driver = driver;
    }

    By buttonsList = By.cssSelector("ul li a");



    public void checkWitchButtonDisappearAndAppear(Integer int1){
        Set<String> previousItems = getMenuItems();
        System.out.println("Initial items " + previousItems);
        disappearedCount = 0;
        appearedCount = 0;

        for (int i = 1; i <= int1; i++) {
            driver.navigate().refresh();

            Set<String> currentItems = getMenuItems();
            System.out.println("Reload " + i + " items: " + currentItems);

            Set<String> disappeared = new HashSet<>(previousItems);
            disappeared.removeAll(currentItems);

            Set<String> appeared = new HashSet<>(currentItems);
            appeared.removeAll(previousItems);

            if (!disappeared.isEmpty()) {
                System.out.println("Disappeared After Reload: " + disappeared);
                disappearedCount++;
            }
            if (!appeared.isEmpty()){
                System.out.println("Appeared After Reload " + appeared);
                appearedCount++;
            }
            previousItems = currentItems;
        }

        if (disappearedCount > 0){
            System.out.println("Number of times button disappeared: " + disappearedCount);
        }
        if (appearedCount > 0) {
            System.out.println("Number of times button re-appeared: " + appearedCount);
        }
    }

    public void CheckifButtonsAreDisappearingAndAppearing(){
        Assert.assertTrue(disappearedCount!=0, "Buttons did not disappear");
        Assert.assertTrue(appearedCount!=0., "Buttons did not re-appear");
    }

    private Set<String> getMenuItems(){
        List<WebElement> items = driver.findElements(buttonsList);
        Set<String> name = new HashSet<>();
        for (WebElement item : items){
            name.add(item.getText().trim());
        }
        return name;
    }
}
