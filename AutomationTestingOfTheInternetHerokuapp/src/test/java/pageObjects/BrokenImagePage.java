package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenImagePage {

    WebDriver driver;

    public BrokenImagePage(WebDriver driver){
        this.driver = driver;
    }

    By image = By.tagName("img");

    public void CheckIfResponseCodeIsCorrect(){
        List<WebElement> imageList = driver.findElements(image);
        System.out.println("The number of image are " + imageList.size());

        for (WebElement imgElement : imageList){
            String imgUrl = imgElement.getAttribute("src");
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(imgUrl).openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                int reponseCode = connection.getResponseCode();

                if (reponseCode != 200){
                    System.out.println(imgUrl + " is broken. Response code: "+ reponseCode);
                }
                else {
                    Boolean imageDisplayed = (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].naturalHeight > 0;", imgElement);
                    if (imageDisplayed){
                        System.out.println(imgUrl + " is displayed correctly");
                    }else {
                        System.out.println(imgUrl + " is broken");
                    }
                }
            }
            catch (Exception e){
                System.out.println(imgUrl+" is broken " + e.getMessage());
            }
        }
    }

}
