package glue.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import glue.enums.UrlEnum;
import glue.pageObjects.NavigationPageObjects;
import org.junit.Assert;

public class NavigationPageSteps {

    private String urlToGo;
    private NavigationPageObjects navigationPageObjects;

    public NavigationPageSteps(NavigationPageObjects navigationPageObjects) {
        this.navigationPageObjects = navigationPageObjects;
    }

    @Given("I go to {string} page")
    public void iGoToPage(String urlName){
        urlToGo = UrlEnum.getTranslatedEnum(urlName);
        navigationPageObjects.getPage(urlToGo);
   }

    @Then("I should be on {string} page")
    public void iShouldBeOnPage(CharSequence name){
        String currentUrl = navigationPageObjects.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(name));
    }
}
