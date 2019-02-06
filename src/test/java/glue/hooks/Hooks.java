package glue.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private SessionManager sessionManager;
    private TakesScreenshots takesScreenshots;

    public Hooks(SessionManager sessionManager, TakesScreenshots takesScreenshots) {
        this.sessionManager = sessionManager;
        this.takesScreenshots = takesScreenshots;
    }

    @Before
    public void BeforeScenario() {
        sessionManager.getWebDriver();
    }

    @After
    public void AfterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            takesScreenshots.takesScreenshot(scenario);
        }
        sessionManager.closeSession();
    }
}
