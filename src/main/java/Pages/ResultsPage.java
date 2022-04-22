package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ResultsPage extends BasePage {

    public ResultsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".a-section.a-text-center.s-pagination-container")
    @CacheLookup
    private WebElement pagination;

    @FindBy(xpath = "(//a[@class='s-pagination-item s-pagination-button'])[1]")
    @CacheLookup
    private WebElement pageTwo;

    @FindBy(xpath = "//span[@aria-label='Current page, page 2']")
    @CacheLookup
    private WebElement currentPage;

    @FindBy(xpath = "//div[@data-index='6']") //The product on the second row and second column
    @CacheLookup
    private WebElement product;


    public void scrollDown() {
        jsScrollToElement("arguments[0].scrollIntoView();", pagination);
        waitFor(2);
    }

    public void openSecondPage() {
        waitFor(2);
        clickFunction(pageTwo);
    }

    public void verifyPage() {
        assertion(currentPage, "2");
        getText(currentPage);
    }

    public void clickTheProduct() {
        waitFor(2);
        clickFunction(product);
    }


}
