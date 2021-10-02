package project.steps;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.support.ui.Select;
import project.browser.Driver;
import project.data.LogOnAutomationPracticePageData;
import project.pages.LogOnAutomationPracticePage;

import java.util.List;

public class WhenSteps {
    LogOnAutomationPracticePage logAutomationPracticePage = new LogOnAutomationPracticePage(Driver.getDriver());

    @When("user click on sign in button")
    public void clickOnSignInButton () {
        logAutomationPracticePage.getSignInButton().click();

    }

    @When("user complete form with valid data")
    public void completeFormWithValidData (LogOnAutomationPracticePageData insertValue){

        logAutomationPracticePage.getEmailAddressInput().sendKeys(insertValue.getEmailAddress());
        logAutomationPracticePage.getPasswordInput().sendKeys(insertValue.getPassword());

    }

}



