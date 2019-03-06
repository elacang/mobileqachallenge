package stepdefinitions;

import cucumber.api.java8.En;
import pageobjects.KrakenLandingPage;

public class KrakenLandingPageSteps implements En {
    private KrakenLandingPage krakenLandingPage;


    public KrakenLandingPageSteps(KrakenLandingPage krakenLandingPage) {
        this.krakenLandingPage = krakenLandingPage;


        When("^I am at the (.*) page$", (String page) -> {
            switch (page.toLowerCase()){
                case "create account":
                    krakenLandingPage.navigateToCreateAccountPage();
                    break;
                case "prices":
                    krakenLandingPage.navigateToPricesPage();
                    break;
                default:
                    throw new IllegalArgumentException("Page not defined!");
            }

        });
    }
}
