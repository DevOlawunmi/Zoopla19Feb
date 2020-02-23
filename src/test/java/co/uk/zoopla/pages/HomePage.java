package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
    public HomePage (WebDriver driver)
    {
        this.driver = driver;
    }
    @FindBy(id = "search-input-location")
    private WebElement searchField;

    public void enterLocation (String location)
    {
      searchField.clear();
      searchField.sendKeys(location);
    }
}
