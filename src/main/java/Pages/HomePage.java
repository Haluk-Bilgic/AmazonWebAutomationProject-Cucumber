package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }   //This initElements method can initialize all the web elements located by @FindBy annotation.

    @FindBy(css = "#twotabsearchtextbox")
    // I used this annotation to locate and declare web elements using different locators.
    @CacheLookup  //I used it because is better to cache objects and save execution time of the test run.
    private WebElement searchBox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    @CacheLookup
    private WebElement submitButton;


    public void typeSearchBox() {
        waitFor(2);         // I used this method to view actions
        sendKeysFunction(searchBox, "socks");
    }

    public void clickSearchButton() {
        waitFor(2);
        clickFunction(submitButton);
    }
}
