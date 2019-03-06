package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3SchoolsHTMLTablePage extends BasePage {

    @FindBy(id = "customers")
    WebElement customersTable;

    public W3SchoolsHTMLTablePage(){
        PageFactory.initElements(driver, this);
    }


    public String getCountryGivenACompany(String company){
        String extractedCountry = customersTable.findElement(By.xpath("//tr/td[text()='Alfreds Futterkiste']/following-sibling::td[2]")).getText();
        return extractedCountry;
    }


}
