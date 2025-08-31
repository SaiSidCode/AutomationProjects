package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DisappearingItemsPage;
import utils.TestContextSetup;

public class DisappearingItemsStepDefinitions {
    TestContextSetup testContextSetup;
    DisappearingItemsPage disappearingItemsPage;

    public DisappearingItemsStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        disappearingItemsPage = testContextSetup.pageObjectManager.getDisappearingItemsPage();
    }


    @When("User reloads the page {int} times")
    public void user_reloads_the_page_times(Integer int1) {
        disappearingItemsPage.checkWitchButtonDisappearAndAppear(int1);
    }
    @Then("Check if buttons disappear and appear")
    public void check_if_buttons_disappear_and_appear() {
        disappearingItemsPage.CheckifButtonsAreDisappearingAndAppearing();
    }
    @Then("Check which buttons disappear and appear")
    public void check_which_buttons_disappear_and_appear() {
    }

}
