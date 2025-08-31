package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DragAndDropPage;
import utils.TestContextSetup;

public class DragAndDropStepDefinitions {

    TestContextSetup testContextSetup;
    DragAndDropPage dragAndDropPage;

    public DragAndDropStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        dragAndDropPage = testContextSetup.pageObjectManager.getDragAndDropPage();
    }

    @When("User drags A to B")
    public void user_drags_a_to_b() {
       dragAndDropPage.DragAtoB();
    }
    @Then("A should be replaced with B")
    public void a_should_be_replaced_with_b() {
        dragAndDropPage.CheckifAIsReplaceWithB();
    }
    @When("Places B back to A")
    public void places_b_back_to_a() {
        dragAndDropPage.DragBtoA();
    }
    @Then("B should be replaced with A")
    public void b_should_be_replaced_with_a() {
        dragAndDropPage.CheckifBIsReplaceWithA();
    }
}
