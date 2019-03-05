package pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private static final Logger LOGGER = Logger.getLogger(BasePage.class.getName());
    public static WebDriver driver;

    private Integer PIXCOUNT = 200;
    protected Integer EXPLICITWAIT = 60;

    public BasePage() {
        driver = DriverRegistry.getDriver();
    }



    public void openURLAddress(String url) {
        driver.navigate().to(url);
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void closeBrowser() {
        driver.close();
    }
}
