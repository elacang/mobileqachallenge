package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.junit.Assert;
import pageobjects.W3SchoolsHTMLTablePage;

public class W3SchoolsHTMLTablePageSteps implements En {
    private W3SchoolsHTMLTablePage w3SchoolsHTMLTablePage;
    private String country;
    
    
    public W3SchoolsHTMLTablePageSteps(W3SchoolsHTMLTablePage w3SchoolsHTMLTablePage) {
        this.w3SchoolsHTMLTablePage = w3SchoolsHTMLTablePage;
        
        When("^I get the country for (.*) company in the HTML table$", (String companyName) -> {
            country = null;
            country = w3SchoolsHTMLTablePage.getCountryGivenACompany(companyName);
        });
        Then("^I should receive (.*) as the company$", (String expectedCountry) -> {
            Assert.assertEquals(expectedCountry, country);
        });
    }
}
