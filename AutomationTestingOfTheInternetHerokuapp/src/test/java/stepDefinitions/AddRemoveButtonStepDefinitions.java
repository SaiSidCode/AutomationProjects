package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.AddDeletePage;
import utils.TestContextSetup;

public class AddRemoveButtonStepDefinitions {
    TestContextSetup testContextSetup;
    AddDeletePage addDeletePage;

    public AddRemoveButtonStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.addDeletePage = testContextSetup.pageObjectManager.getAddDeletePage();
    }

    @Then("Check if Add buttons adds more buttons")
    public void check_if_add_buttons_adds_more_buttons() {
        addDeletePage.AddButton();
    }
    @Then("Check if all the buttons added can be deleted")
    public void check_if_all_the_buttons_added_can_be_deleted() {
        addDeletePage.DeleteButton();
    }
}
