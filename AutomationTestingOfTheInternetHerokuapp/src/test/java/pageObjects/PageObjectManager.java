package pageObjects;

import io.cucumber.java.sl.Ce;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public WebDriver driver;
    public HomePage homePage;
    public ABTestingPage abTestingPage;
    public AddDeletePage addDeletePage;
    public BasicAuthPage basicAuthPage;
    public ChallengingDOM challengingDOM;
    public BrokenImagePage brokenImagePage;
    public CheckboxesPage checkboxesPage;
    public ContentMenuPage contentMenuPage;
    public DigestAuthPage digestAuthPage;
    public DisappearingItemsPage disappearingItemsPage;
    public DragAndDropPage dragAndDropPage;
    public DropDownPage dropDownPage;
    public DynamicContentPage dynamicContentPage;
    public DynamicControlPage dynamicControlPage;
    public FileUploadPage fileUploadPage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePage getHomePage(){
        homePage = new HomePage(driver);
        return homePage;
    }

    public ABTestingPage getABTestingPage(){
        abTestingPage = new ABTestingPage(driver);
        return abTestingPage;
    }

    public AddDeletePage getAddDeletePage(){
        addDeletePage = new AddDeletePage(driver);
        return addDeletePage;
    }

    public BasicAuthPage getBasicAuthPage(){
        basicAuthPage = new BasicAuthPage(driver);
        return basicAuthPage;
    }

    public ChallengingDOM getChallengingDOM(){
        challengingDOM = new ChallengingDOM(driver);
        return challengingDOM;
    }

    public BrokenImagePage getBrokenImagePage(){
        brokenImagePage = new BrokenImagePage(driver);
        return brokenImagePage;
    }

    public CheckboxesPage getCheckboxesPage(){
        checkboxesPage = new CheckboxesPage(driver);
        return checkboxesPage;
    }

    public ContentMenuPage getContentMenuPage(){
        contentMenuPage = new ContentMenuPage(driver);
        return contentMenuPage;
    }

    public DigestAuthPage getDigestAuthPage(){
        digestAuthPage = new DigestAuthPage(driver);
        return digestAuthPage;
    }

    public DisappearingItemsPage getDisappearingItemsPage(){
        disappearingItemsPage = new DisappearingItemsPage(driver);
        return disappearingItemsPage;
    }

    public DragAndDropPage getDragAndDropPage(){
        dragAndDropPage = new DragAndDropPage(driver);
        return dragAndDropPage;
    }

    public DropDownPage getDropDownPage(){
        dropDownPage = new DropDownPage(driver);
        return dropDownPage;
    }

    public DynamicContentPage getDynamicContentPage(){
        dynamicContentPage = new DynamicContentPage(driver);
        return dynamicContentPage;
    }

    public DynamicControlPage getDynamicControlPage(){
        dynamicControlPage = new DynamicControlPage(driver);
        return dynamicControlPage;
    }

    public FileUploadPage fileUploadPage(){
        fileUploadPage = new FileUploadPage(driver);
        return fileUploadPage;
    }
}
