package stepdefinitions;

import cucumber.api.java8.En;
import pageobjects.AmazonPage;

public class AmazonPageSteps implements En {
    private AmazonPage amazonPage;

    public AmazonPageSteps(AmazonPage amazonPage) {
        this.amazonPage = amazonPage;


        When("^I navigate to \"([^\"]*)\" department from the menu$", (String department) -> {
            this.amazonPage.navigateToDepartment(department);
        });
    }
}
