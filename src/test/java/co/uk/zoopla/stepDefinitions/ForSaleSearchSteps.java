package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import co.uk.zoopla.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ForSaleSearchSteps extends BasePage
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver,SearchResultPage.class);

    @Given("I navigate to Zoopla.co.uk")
    public void i_navigate_to_Zoopla_co_uk()
    {
      launchURL();
    }

    @When("I enter a {string} in the search bar")
    public void i_enter_a_in_the_search_bar(String location)
    {
     homePage.enterLocation(location);
    }

    @When("I select {string} from the Min dropdown")
    public void i_select_from_the_Min_dropdown(String minPrice)
    {
     homePage.selectMinimumPrice(minPrice);
    }

    @When("I select {string} from the Max dropdown")
    public void i_select_from_the_Max_dropdown(String maxPrice)
    {
     homePage.selectMaximumPrice(maxPrice);
    }

    @When("I select {string} from the Property dropdown")
    public void i_select_from_the_Property_dropdown(String property)
    {
     homePage.selectPropertyType(property);
    }

    @When("I select {string} from the rooms dropdown")
    public void i_select_from_the_rooms_dropdown(String beds)
    {
        homePage.selectNoOfBeds(beds);
    }

    @When("I click on the Search button")
    public void i_click_on_the_Search_button()
    {
      searchResultPage=homePage.clickOnSubmitButton();
    }

    @Then("all the property within the selected location and price range are displayed")
    public void all_the_property_within_the_selected_location_and_price_range_are_displayed() {
            }

}
