package pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

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

    public void waitForElement(WebElement element) {
        try {
            TimeUnit.SECONDS.sleep(1);
            LOGGER.info("Waiting for element: " + element);
            final WebDriverWait wait = new WebDriverWait(driver, 40);
            wait.until(ExpectedConditions.visibilityOf(element));
            LOGGER.info("Element found: " + element);
        } catch (WebDriverException e) {
            LOGGER.info("Element was not found in a given time.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void mouseoverElement(WebElement element) {
        LOGGER.info("mouseover to element: " + element);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
        LOGGER.info("Focused to element: " + element);
    }
}
