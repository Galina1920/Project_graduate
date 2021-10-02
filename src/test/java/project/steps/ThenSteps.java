package project.steps;

import cucumber.api.java.en.Then;
import project.browser.Driver;
import project.pages.LogOnAutomationPracticePage;

public class ThenSteps {
    LogOnAutomationPracticePage logAutomationPracticePage = new LogOnAutomationPracticePage(Driver.getDriver());

    @Then("click on submit button")
    public void userClickOnSubmitButton () {
        logAutomationPracticePage.getSubmitButton().click();
    }
}
