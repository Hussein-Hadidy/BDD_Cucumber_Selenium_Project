package AllFiles;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdateContactsPage
{

    static By emailLocator = By.id("email");
    static By submitButtonLocator = By.id("submit");
    static By buttonToEditContact = By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]");
    static By editButtonLocator = By.id("edit-contact");
    static By deleteButtonLocator=By.id("delete");
    static By returnButtonLocator=By.id("return");
    static By addNewContactButton = By.id("add-contact");

    static By cancelButton = By.id("cancel");

    public static void explicitWait(WebDriver driver,int time, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void returnToContactList(WebDriver driver) throws InterruptedException
    {
        explicitWait(driver,15,cancelButton);
        driver.findElement(cancelButton).click();
        explicitWait(driver, 15, returnButtonLocator);
        driver.findElement(returnButtonLocator).click();
        explicitWait(driver, 15, addNewContactButton);
    }
    public static void clickDeleteButton(WebDriver driver) throws InterruptedException
    {
        explicitWait(driver, 15, emailLocator);
        WebElement element=driver.findElement(deleteButtonLocator);
        element.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
    }

    public static void enterNewEmail(WebDriver driver, String email) throws InterruptedException {
        explicitWait(driver, 15, emailLocator);
        Thread.sleep(2000);
        driver.findElement(emailLocator).click();
        driver.findElement(emailLocator).clear();
        Thread.sleep(1500);
        driver.findElement(emailLocator).sendKeys(email);
    }

    public static void goToEditContact(WebDriver driver) throws InterruptedException
    {
        explicitWait(driver, 15, buttonToEditContact);
        driver.findElement(buttonToEditContact).click();
    }

    public static void clickToEditContact(WebDriver driver)
    {
        explicitWait(driver, 15, buttonToEditContact);
        driver.findElement(buttonToEditContact).click();
        explicitWait(driver, 15, editButtonLocator);
        driver.findElement(editButtonLocator).click();
    }

    public static void clickSubmitButton(WebDriver driver) throws InterruptedException
    {
        driver.findElement(submitButtonLocator).click();
        Thread.sleep(2000);
        explicitWait(driver, 15, emailLocator);
    }

    public static String checkEmailAfterUpdated(WebDriver driver)
    {
        explicitWait(driver, 15, emailLocator);
        return driver.findElement(emailLocator).getText();
    }

    public static void assertEqualUrls(String expectedUrl, String actualUrl)
    {
        if (!expectedUrl.equals(actualUrl)) {
            throw new AssertionError("URLs are not equal: expected=" + expectedUrl + ", actual=" + actualUrl);
        }
    }

}
