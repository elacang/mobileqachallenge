package stepdefinitions;

import cucumber.api.java8.En;
import org.junit.Assert;
import pageobjects.KrakenCreateAccountPage;

public class KrakenCreateAccountPageSteps implements En {

    private KrakenCreateAccountPage krakenCreateAccountPage;


    public KrakenCreateAccountPageSteps(KrakenCreateAccountPage krakenCreateAccountPage) {
        this.krakenCreateAccountPage = krakenCreateAccountPage;


        And("^I type \"([^\"]*)\" in the email field$", (String email) -> {
            krakenCreateAccountPage.tbEmail.sendKeys(email);
        });
        And("^I type \"([^\"]*)\" in the$", (String userName) -> {
            krakenCreateAccountPage.tbUsername.sendKeys(userName);
        });
        Then("^I should see \"([^\"]*)\" in the email field$", (String email) -> {
            String emailText = krakenCreateAccountPage.tbEmail.getAttribute("value");
            Assert.assertEquals(emailText, email);
        });
        And("^I should see \"([^\"]*)\" in the username field$", (String userName) -> {
            String userNameText = krakenCreateAccountPage.tbUsername.getAttribute("value");
            Assert.assertEquals(userNameText, userName);
        });
    }
}
