package stepDefintions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class HeaderLinksTestSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);

    @When("I click on Header link {string}")
    public void i_click_on_header_link(String headerLinks) {
        homePage.clickHeaderLinks(headerLinks);
    }
    @Then("I should get re-directed appropriately to correspoding pages with title as {string}")
    public void i_should_get_re_directed_appropriately_to_correspoding_pages_with_title_as(String expectedPageTitle) {
        homePage.headerLinksReDirectionVal(expectedPageTitle);
    }


}
