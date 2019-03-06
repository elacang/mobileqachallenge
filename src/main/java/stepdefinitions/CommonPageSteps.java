package stepdefinitions;

import cucumber.api.java8.En;
import org.junit.Assert;
import pageobjects.BasePage;

public class CommonPageSteps implements En {
    private BasePage basePage;
    private String pageTitle;


    public CommonPageSteps(BasePage basePage) {
        this.basePage = basePage;
        Given("^I am at (.*) website$", (String url) -> {
            basePage.openURLAddress(url);
        });
        When("^I obtain the page title$", () -> {
            pageTitle = null;
            pageTitle = basePage.getPageTitle();
        });
        Then("^I should be able to see \"([^\"]*)\" as the page title$", (String title) -> {
            Assert.assertEquals(title, pageTitle);
        });
    }
}
