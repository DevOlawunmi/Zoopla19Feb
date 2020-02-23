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
    @FindBy(id = "forsale_price_min")
    private WebElement minPrice;

    public void enterLocation (String location)
    {
      searchField.clear();
      searchField.sendKeys(location);
    }
    public void selectMinimumPrice(String miniPrice)
    {
        selectElementByVisibleText(minPrice,miniPrice);
    }
}
