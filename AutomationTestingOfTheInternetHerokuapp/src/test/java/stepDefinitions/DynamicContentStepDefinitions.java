package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DynamicContentPage;
import utils.TestContextSetup;

public class DynamicContentStepDefinitions {
    TestContextSetup testContextSetup;
    DynamicContentPage dynamicContentPage;

    public DynamicContentStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        dynamicContentPage = testContextSetup.pageObjectManager.getDynamicContentPage();
    }


    @When("User reloads the dynamic content page")
    public void user_reloads_the_dynamic_content_page() {
    }
    @Then("Text and images should change")
    public void text_and_images_should_change() {
        dynamicContentPage.TextandImagesChanges();
    }


}
