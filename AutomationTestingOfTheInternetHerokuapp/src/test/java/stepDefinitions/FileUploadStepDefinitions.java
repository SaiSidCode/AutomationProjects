package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.FileUploadPage;
import utils.TestContextSetup;

public class FileUploadStepDefinitions {
    TestContextSetup testContextSetup;
    FileUploadPage fileUploadPage;

    public FileUploadStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        fileUploadPage = testContextSetup.pageObjectManager.fileUploadPage();
    }

    @When("User uploads the file")
    public void user_uploads_the_file() {
        fileUploadPage.UploadsFiles();
    }
    @Then("User gets a message that file has be uploaded succesfully")
    public void user_gets_a_message_that_file_has_be_uploaded_succesfully() {
        fileUploadPage.CheckIfFileIsUploaded();
    }
}
