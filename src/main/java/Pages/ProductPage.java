package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@name='dropdown_selected_size_name']")
    private WebElement sizeButton;

    @FindBy(css = "#add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[starts-with(@class,'a-size-medium-plus a-color-base')]")
    private WebElement addedText;

    @FindBy(xpath = "//*[@id=\"sw-atc-details-single-container\"]/div[2]/div[1]/div/div/i")
    private WebElement icon;

    public void selectSize(){
        waitFor(2);
        selectElement(sizeButton,1);
    }
    public void addToCart(){
        waitFor(2);
        clickFunction(addToCartButton);
    }
    public void verifyAddedText(){
        assertion(addedText,"Added to Cart");
    }
    public void verifyDisplayedIcon(){
        if(icon.isDisplayed()){
            System.out.println("The icon is visible and Test passed successfully");
        }
        else{
            System.out.println("The icon is not visible");
        }
    }


}
