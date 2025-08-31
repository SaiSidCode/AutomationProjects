package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.HomePage;
import utils.TestContextSetup;

import java.io.IOException;

public class HomePageStepDefinitions {

    TestContextSetup testContextSetup;
    HomePage homePage;

    public HomePageStepDefinitions(TestContextSetup testContextSetup) throws IOException {
        this.testContextSetup = testContextSetup;
        homePage = testContextSetup.pageObjectManager.getHomePage();
    }

    @Given("User opens the browser")
    public void user_opens_the_browser() {
    }
    @Given("Redirects to the internet Herokuapp website")
    public void redirects_to_the_internet_herokuapp_website() {
    }
    @Then("^The tile of the of website is (.+)$")
    public void the_tile_of_the_of_website_is(String expectedTitle) {
        String title = homePage.getHomepageTitle();
        System.out.println("Webpage Title is " + title);
        System.out.println("Expected Title is " + expectedTitle);
        Assert.assertEquals(title, expectedTitle);
    }
    @Then("^The heading is (.+)$")
    public void the_heading_is(String expectedHeading) {
        String heading = homePage.getHompageHeadingText();
        System.out.println("Webpage heading is " + heading);
        System.out.println("Expected heading is " + expectedHeading);
        Assert.assertEquals(heading, expectedHeading);

    }

    @Given("User is in the Homepage")
    public void user_is_in_the_homepage() {
    }
    @Given("User clicks on the AB Testing option in the list")
    public void user_clicks_on_the_ab_testing_option_in_the_list() {
        homePage.enterABTestingPage();
    }

    @Given("User is redirected to Add Remove Button Page")
    public void user_is_redirected_to_add_remove_button_page() {
      homePage.enterAddRemoveButtonPage();
    }

    @Given("User is on Homepage and goes to Challenging DOM page")
    public void user_is_on_homepage_and_goes_to_challenging_dom_page() {
        homePage.enterChallengingDOMPage();
    }

    @Given("User is in homepage and redirects themself to Broken Images link")
    public void user_is_in_homepage_and_redirects_themself_to_broken_images_link() {
        homePage.enterBrokenImagePage();
    }

    @Given("User is on Homepage and goes to Checkboxes page")
    public void user_is_on_homepage_and_goes_to_checkboxes_page() {
        homePage.enterCheckBoxesPage();
    }

    @Given("User landing in homepage and enters ContextMenu Page")
    public void user_landing_in_homepage_and_enters_context_menu_page() {
        homePage.enterContextMenuPage();
    }

    @Given("User is on homepage and tries to enter Digest Auth Page")
    public void user_is_on_homepage_and_tries_to_enter_digest_auth_page() throws IOException {
        ((HasAuthentication)testContextSetup.testBase.WebDriverManager()).register(UsernameAndPassword.of("admin","admin"));
        homePage.enterDigestAuthPage();
    }

    @Given("User is on homepage and clicks on Disappearing Items button")
    public void user_is_on_homepage_and_clicks_on_disappearing_items_button() {
        homePage.enterDisappearingButtonPage();
    }

    @Given("User is in homepage and clicks on Drag and Drop button")
    public void user_is_in_homepage_and_clicks_on_drag_and_drop_button() {
        homePage.enterDragAndDropPage();
    }

    @Given("User is in hompage and then clicks on Drop Down button")
    public void user_is_in_hompage_and_then_clicks_on_drop_down_button() {
        homePage.enterDropDownPage();
    }

    @Given("User is in homepage and redirects to Dynamic Content Page")
    public void user_is_in_homepage_and_redirects_to_dynamic_content_page() {
        homePage.enterDynamicContentPage();
    }

    @Given("User is in homepage and goes to Dynamic Control Page")
    public void user_is_in_homepage_and_goes_to_dynamic_control_page() {
        homePage.enterDynamicControlPage();
    }
    @Given("User is on homepage and clicks on File Upload Page")
    public void user_is_on_homepage_and_clicks_on_file_upload_page() {
        homePage.enterFileUploadPage();
    }
}
