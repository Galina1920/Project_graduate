package project.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import project.browser.Driver;
import project.screenShot.MakeScreenShot;

import static project.browser.Driver.runDriver;

public class Hooks {
    private MakeScreenShot screenshotMaker = new MakeScreenShot();

    @Before
    public void beforeStep()  {
        runDriver();
    }

    @AfterStep
    public void afterStepScreenshot(Scenario scenario){
        screenshotMaker.makeAShot(scenario.getName());
    }

    @After
    public void afterStep(){
        Driver.quitDriver();
    }

}
