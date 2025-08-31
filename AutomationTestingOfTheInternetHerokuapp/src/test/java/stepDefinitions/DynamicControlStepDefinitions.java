package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DynamicControlPage;
import utils.TestContextSetup;

public class DynamicControlStepDefinitions {

    TestContextSetup testContextSetup;
    DynamicControlPage dynamicControlPage;

    public DynamicControlStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        dynamicControlPage = testContextSetup.pageObjectManager.getDynamicControlPage();
    }

    @When("User taps on Remove button")
    public void user_taps_on_remove_button() {
        dynamicControlPage.TapOnRemoveButton();
    }
    @Then("A check box is removed")
    public void a_check_box_is_removed() {
        dynamicControlPage.CheckIfCheckboxRemoved();
    }
    @Then("Remove button changes to Add button")
    public void remove_button_changes_to_add_button() {
        dynamicControlPage.CheckIfButtonNameChanged();
    }


    @When("User taps on Remove button to change it to Add")
    public void userTapsOnRemoveButtonToChangeItToAdd() {
        dynamicControlPage.TapOnRemoveButton();
    }

    @When("User taps on Add button")
    public void user_taps_on_add_button() {
        dynamicControlPage.TapOnAddButton();
    }
    @Then("A check box is added")
    public void a_check_box_is_added() {
        dynamicControlPage.CheckIfCheckboxAdded();
    }
    @Then("Add button changes to remove button")
    public void add_button_changes_to_remove_button() {
        dynamicControlPage.CheckIfButtonNameChanged();
    }

    @When("User taps on Enable button")
    public void user_taps_on_enable_button() {
        dynamicControlPage.TapOnEnableButton();
    }
    @Then("Text box is enabled")
    public void text_box_is_enabled() {
        dynamicControlPage.CheckTextboxIsEnabled();
    }
    @Then("Enable button changes to Disable button")
    public void enable_button_changes_to_disable_button() {
        dynamicControlPage.CheckifEnableDisableButtonNameChanges();
    }

    @When("User taps on Enable button to change to Disable")
    public void user_taps_on_enable_button_to_change_to_disable() {
        dynamicControlPage.TapOnEnableButton();
    }
    @When("User taps on Disable button")
    public void user_taps_on_disable_button() {
       dynamicControlPage.TapOnDisableButton();
    }
    @Then("Text box is Disabled")
    public void text_box_is_disabled() {
        dynamicControlPage.CheckTextboxIsDisabled();
    }
    @Then("Disable button changes to Enable button")
    public void disable_button_changes_to_enable_button() {
        dynamicControlPage.CheckifEnableDisableButtonNameChanges();
    }
}
