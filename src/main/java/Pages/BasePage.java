package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
// All page object classes extends the BasePage, thus inheriting all the base methods.

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickFunction(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void selectElement(WebElement dropdown, int element) {
        Select slc = new Select(dropdown);
        slc.selectByIndex(element);
    }

    public void getText(WebElement value) {
        wait.until(ExpectedConditions.visibilityOf(value));
        System.out.println("Result:" + value.getText());
    }

    public void assertion(WebElement actual, String expected) {
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
    }

    public void jsScrollToElement(String parameter, WebElement element) {
        JavascriptExecutor jselement = (JavascriptExecutor) driver;
        jselement.executeScript(parameter, element);
    }


    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
