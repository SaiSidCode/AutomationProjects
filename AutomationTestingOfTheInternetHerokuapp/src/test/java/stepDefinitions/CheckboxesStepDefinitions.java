package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckboxesPage;
import utils.TestContextSetup;

public class CheckboxesStepDefinitions {

    TestContextSetup testContextSetup;
    CheckboxesPage checkboxesPage;

    public CheckboxesStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.checkboxesPage = testContextSetup.pageObjectManager.getCheckboxesPage();
    }


    @When("User sees if there are {int} check boxes")
    public void user_sees_if_there_are_check_boxes(Integer int1) {
        checkboxesPage.CheckIfCheckboxesSelected();
    }
    @Then("User selects both checkboxes")
    public void user_selects_both_checkboxes() {
       checkboxesPage.CheckAllCheckboxes();
    }
}
