package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DropDownPage;
import utils.TestContextSetup;

public class DropDownStepDefinitions {

    TestContextSetup testContextSetup;
    DropDownPage dropDownPage;

    public DropDownStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        dropDownPage = testContextSetup.pageObjectManager.getDropDownPage();
    }


    @When("User click on dropdown option")
    public void user_click_on_dropdown_option() {
    }
    @Then("User is able to select option {int}")
    public void user_is_able_to_select_option(Integer int1) {
        dropDownPage.SelectOption(int1);
        dropDownPage.CheckWitchIsSelected(int1);
    }
    @Then("After which User is able to select option {int}")
    public void after_which_user_is_able_to_select_option(Integer int1) {
        dropDownPage.SelectOption(int1);
        dropDownPage.CheckWitchIsSelected(int1);
    }
}
