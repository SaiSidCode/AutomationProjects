package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.BrokenImagePage;
import utils.TestContextSetup;

public class BrokenImageStepDefinitions {

    TestContextSetup testContextSetup;
    BrokenImagePage brokenImagePage;

    public BrokenImageStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.brokenImagePage = testContextSetup.pageObjectManager.getBrokenImagePage();
    }

    @Then("Check if image link returns status code {int}")
    public void check_if_image_link_returns_status_code(Integer int1) {
        brokenImagePage.CheckIfResponseCodeIsCorrect();
    }
    @Then("Check if image's width is more than {int}")
    public void check_if_image_s_width_is_more_than(Integer int1) {
    }

}
