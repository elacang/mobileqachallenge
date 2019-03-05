package pageobjects;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver = DriverRegistry.getDriver();

    @After
    public void afterScenario() {
        driver.quit();
    }
}
