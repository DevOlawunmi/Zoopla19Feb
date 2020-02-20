package co.uk.zoopla.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser extends DriverLib
{
    private WebDriver initChrome()
    {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private WebDriver initHeadlessChrome()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu","--headless");
        return new ChromeDriver();
    }
    public void launchBrowser (String browser)
    {
        switch (browser)
        {
            case "Chrome":
                driver = initChrome();
                break;
            default:
                driver = initHeadlessChrome();
        }
           driver.manage().window().maximize();
    }
    public void closeBrowser()
    {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
