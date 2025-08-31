package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.BasicAuthPage;
import utils.TestContextSetup;

public class BasicAuthStepDefinitions {

    TestContextSetup testContextSetup;
    BasicAuthPage basicAuthPage;

    public BasicAuthStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.basicAuthPage = testContextSetup.pageObjectManager.getBasicAuthPage();
    }

    @Given("User is in home page and tries to redirect to Basic Auth Page")
    public void user_is_in_home_page_and_tries_to_redirect_to_basic_auth_page() {
    }
    @Then("User is able login to basic Auth page")
    public void user_is_able_login_to_basic_auth_page() {
        basicAuthPage.LoginIntoBasicAuth();
    }
    @Then("User is has entered the Auth Page and is able to see the page's contents")
    public void user_is_has_entered_the_auth_page_and_is_able_to_see_the_page_s_contents() {
        basicAuthPage.CheckIfBasicAuthWasSuccess();
    }

}
