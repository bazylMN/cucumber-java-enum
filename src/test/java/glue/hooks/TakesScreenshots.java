package glue.hooks;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class TakesScreenshots {

    private SessionManager sessionManager;

    public TakesScreenshots(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    public void takesScreenshot(Scenario scenario) {
            try {
                byte[] screenshot = ((TakesScreenshot) sessionManager.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }
}
