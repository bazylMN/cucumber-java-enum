package glue.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionManager {

    private WebDriver webDriver;

    public WebDriver getWebDriver(){
        System.getProperty("browser", "chrome");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        webDriver = new ChromeDriver();
        return webDriver;
    }

    public void closeSession(){
        webDriver.manage().deleteAllCookies();
        webDriver.close();
        webDriver.quit();
    }

    public WebDriver getDriver() {
        return webDriver;
    }
}
