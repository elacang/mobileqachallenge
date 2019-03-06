package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KrakenLandingPage extends BasePage{

    @FindBy(xpath = "//a[@class='kraken-cta' and text()='Create Account']")
    WebElement btnCraeteAccount;

    @FindBy(xpath = "//a[contains(text(), 'Prices')]")
    WebElement linkPrices;


    public KrakenLandingPage(){
        PageFactory.initElements(driver, this);
    }

    public void navigateToCreateAccountPage(){
        waitForElement(btnCraeteAccount);
        btnCraeteAccount.click();
    }

    public void navigateToPricesPage(){
        waitForElement(linkPrices);
        linkPrices.click();
    }
}
