package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ContentMenuPage;
import utils.TestContextSetup;

public class ContextMenuStepDefinitions {
    TestContextSetup testContextSetup;
    ContentMenuPage contentMenuPage;

    public ContextMenuStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        contentMenuPage = testContextSetup.pageObjectManager.getContentMenuPage();
    }

    @When("User right clicks on the box")
    public void user_right_clicks_on_the_box() {
        contentMenuPage.RightClickOnContentBox();
    }
    @Then("A JavaScript alert is triggers")
    public void a_java_script_alert_is_triggers() {
       contentMenuPage.CheckIfAlertAppears();
    }
    @Then("Also check if this alert can be closed")
    public void also_check_if_this_alert_can_be_closed() {
       contentMenuPage.ClosetheAlert();
    }

}
