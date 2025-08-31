package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.ABTestingPage;
import utils.TestContextSetup;

import java.io.IOException;

public class ABTestingStepDefinitions {

    TestContextSetup testContextSetup;
    ABTestingPage abTestingPage;

    public ABTestingStepDefinitions(TestContextSetup testContextSetup) throws IOException {
        this.testContextSetup = testContextSetup;
        abTestingPage = testContextSetup.pageObjectManager.getABTestingPage();
    }

    @Then("Check if user is redirect to AB testing page")
    public void check_if_user_is_redirect_to_ab_testing_page() {
        abTestingPage.CheckIfOnABTestingPage();
    }
    @Then("Check if the user is falling under control or variation cohort")
    public void check_if_the_user_is_falling_under_control_or_variation_cohort() {
        abTestingPage.CheckIfUserCohort();
    }
}
