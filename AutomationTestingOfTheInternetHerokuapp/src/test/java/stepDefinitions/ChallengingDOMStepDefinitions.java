package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.ChallengingDOM;
import utils.TestContextSetup;

public class ChallengingDOMStepDefinitions {

    TestContextSetup testContextSetup;
    ChallengingDOM challengingDOM;

    public ChallengingDOMStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        challengingDOM = testContextSetup.pageObjectManager.getChallengingDOM();
    }

    @Then("User tries to tap on blue button {int} times")
    public void user_tries_to_tap_on_blue_button_times(Integer int1) {
        for (int i = 0; i < int1; i++) {
           challengingDOM.TapOnBlueButton();
        }
    }
    @Then("User tries to tap on red button {int} times")
    public void user_tries_to_tap_on_red_button_times(Integer int1) {
        for (int i = 0; i < int1; i++) {
            challengingDOM.TapOnRedButton();
        }
    }
    @Then("User tries to tap on green button {int} times")
    public void user_tries_to_tap_on_green_button_times(Integer int1) {
        for (int i = 0; i < int1; i++) {
            challengingDOM.TapOnGreenButton();
        }
    }
}
