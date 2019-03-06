package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KrakenCreateAccountPage extends BasePage {

    @FindBy(xpath = "//input[@name='email' and @class='form-control']")
    public WebElement tbEmail;

    @FindBy(xpath = "//input[@name='username' and @class='form-control']")
    public WebElement tbUsername;

    @FindBy(xpath = "//input[@name='password' and @class='form-control']")
    public WebElement tbPassword;


    public KrakenCreateAccountPage(){
        PageFactory.initElements(driver, this);
    }

}
