package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#twotabsearchtextbox")
    @CacheLookup
    private WebElement searchBox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    @CacheLookup
    private WebElement submitButton;


    public void typeSearchBox(){
        waitFor(2);
        sendKeysFunction(searchBox,"socks");
    }
    public void ClickSearchButton(){
        waitFor(2);
        clickFunction(submitButton);
    }
}
