package AllFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddContactPage
{
    static By addNewButtonLocator = By.id("add-contact");
    static By errorMessageLocator = By.id("error");
    static By firstNameLocator = By.id("firstName");
    static By lastNameLocator = By.id("lastName");
    static By emailLocator = By.id("email");
    static By birthdateLocator= By.id("birthdate");
    static By phoneLocator = By.id("phone");
    static By addressLocator1 = By.id("street1");
    static By addressLocator2 = By.id("street2");
    static By cityLocator = By.id("city");
    static By stateLocator = By.id("stateProvince");
    static By postalCodeLocator = By.id("postalCode");
    static By countryLocator = By.id("country");
    static By submitButton = By.id("submit");
    static By logoutButton = By.id("logout");


public static void goToAddressBookPage(WebDriver driver) throws InterruptedException
    {
        driver.get("https://thinking-tester-contact-list.herokuapp.com/addContact");
        explicitWait(driver, 15, firstNameLocator);
    }
    public static void enterContactDetails(WebDriver driver, String firstName,String lastName,String dateOfBirth, String email, String phone, String address1,String address2, String city, String state, String zip, String country)
    {
        driver.findElement(firstNameLocator).sendKeys(firstName);
        driver.findElement(lastNameLocator).sendKeys(lastName);
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(birthdateLocator).sendKeys(dateOfBirth);
        driver.findElement(phoneLocator).sendKeys(phone);
        driver.findElement(addressLocator1).sendKeys(address1);
        driver.findElement(addressLocator2).sendKeys(address2);
        driver.findElement(cityLocator).sendKeys(city);
        driver.findElement(stateLocator).sendKeys(state);
        driver.findElement(postalCodeLocator).sendKeys(zip);
        driver.findElement(countryLocator).sendKeys(country);
    }
    public static void clickSubmitButton(WebDriver driver) throws InterruptedException
    {
        driver.findElement(submitButton).click();
        explicitWait(driver, 15, addNewButtonLocator);
    }
    public static void clickLogoutButton(WebDriver driver) throws InterruptedException
    {
        driver.findElement(logoutButton).click();
        Thread.sleep(4000);
    }
    public static void explicitWait(WebDriver driver,int time, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static String getErrorMessage(WebDriver driver)
    {
        explicitWait(driver, 15, errorMessageLocator);
        return driver.findElement(errorMessageLocator).getText();
    }
    public static void assertEqualUrls(String expectedUrl, String actualUrl)
    {
        if (!expectedUrl.equals(actualUrl)) {
            throw new AssertionError("URLs are not equal: expected=" + expectedUrl + ", actual=" + actualUrl);
        }
    }



}
