package StepDefinition;

import Helper.BrowserSetup;
import Pages.HomePage;
import Pages.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddToCartSteps {

    public static WebDriver driver;

    HomePage homePage;
    ResultsPage resultsPage;

    @Given("^navigate to ”https://www\\.amazon\\.com/”$")
    public void navigate_to_https_www_amazon_com() {
        driver = BrowserSetup.startBrowser("chrome", "https://www.amazon.com/");
    }

    @When("^Enter “socks” to search box$")
    public void enter_socks_to_search_box() {
        homePage = new HomePage(driver);
        homePage.typeSearchBox();
        homePage.ClickSearchButton();
    }

    @When("^Open the second page of the results$")
    public void open_the_second_page_of_the_results() {
        resultsPage = new ResultsPage(driver);
        resultsPage.scrollDown();
        resultsPage.openSecondPage();
    }

    @When("^Verify the second page is opened$")
    public void verify_the_second_page_is_opened() {
        resultsPage.verifyPage();
    }

    @When("^Select the product on the second row and second column$")
    public void select_the_product_on_the_second_row_and_second_column() {
        resultsPage.clickTheProduct();
    }

    @When("^Select first available size on the “Size” dropdown element$")
    public void select_first_available_size_on_the_Size_dropdown_element() {

    }

    @When("^Click on the “Add to Cart” button on the newly opened right panel$")
    public void click_on_the_Add_to_Cart_button_on_the_newly_opened_right_panel() {

    }

    @When("^Verify the “Added” text is visible$")
    public void verify_the_Added_text_is_visible() {

    }

    @Then("^Verify a check icon is is visible just near the “Added” text$")
    public void verify_a_check_icon_is_is_visible_just_near_the_Added_text() {

    }
}
