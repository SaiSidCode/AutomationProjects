package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DigestAuthPage;
import utils.TestContextSetup;

public class DigestAuthStepDefinitions {
    TestContextSetup testContextSetup;
    DigestAuthPage digestAuthPage;

    public DigestAuthStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup =testContextSetup;
        digestAuthPage = testContextSetup.pageObjectManager.getDigestAuthPage();
    }

    @When("User Enters the correct username and password")
    public void user_enters_the_correct_username_and_password() {
    }
    @Then("User enters Digest Auth Page")
    public void user_enters_digest_auth_page() {
        digestAuthPage.CheckIfUserEnteredDigestAuthPage();
    }
}
