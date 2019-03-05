package pageobjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.PropertyReader;

import java.awt.*;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class DriverRegistry {


    protected static WebDriver driver;
    protected static int IMPLICITWAIT = 60;

    private static final Logger LOGGER = Logger.getLogger(Driver.class.getName());


    public static WebDriver getDriver() {
        if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
            String driverToRun = PropertyReader.readProperty("web.browser");
            driver = createNewDriverInstance(driverToRun);
        }
        return driver;
    }


    public static WebDriver createNewDriverInstance(String browser) {
        setDriverProperty(browser);
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-extensions");
//            options.addArguments("--headless");
//            options.addArguments("--disable-gpu");
            options.addArguments("--no-sandbox");
//            options.addArguments("--incognito");
            options.addArguments("--disable-application-cache");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Users\\eiroll\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
            options.addArguments("--disable-application-cache");
            options.addArguments("--disable-extensions");
            options.setLogLevel(FirefoxDriverLogLevel.FATAL);
            options.addPreference("browser.tabs.remote.force-enable", "false");
            options.addPreference("browser.tabs.remote.autostart", false);
            options.addPreference("browser.tabs.remote.autostart.1", false);
            options.addPreference("browser.tabs.remote.autostart.2", false);
            driver = new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        Dimension desiredScreenSize = new Dimension(1440, 900);

        java.awt.Dimension currentScreenSize = Toolkit.getDefaultToolkit().getScreenSize();


        int value = compareScreenSize(currentScreenSize, desiredScreenSize);


        if (value > 0)
            driver.manage().window().maximize();

        else
            driver.manage().window().setSize(desiredScreenSize);



        driver.manage().timeouts().implicitlyWait(IMPLICITWAIT, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        return driver;
    }

    private static int compareScreenSize(java.awt.Dimension d1, Dimension d2) {
        double area1 = d1.getWidth() * d1.getHeight();
        double area2 = d2.getWidth() * d2.getHeight();
//        LOGGER.info("AREA 1 = " + area1 + " AREA 2 = " + area2);
        return Double.compare(area1, area2);
    }



    public static void setDriverProperty(String browser) {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                break;

        }


    }

}
