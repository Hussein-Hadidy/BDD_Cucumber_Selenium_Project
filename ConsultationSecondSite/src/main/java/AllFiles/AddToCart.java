package AllFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCart
{
    static int cartItemsCount = 0;

    static By  usernameLocator = By.id("user-name");
    static By passwordLocator = By.id("password");
    static By loginButtonLocator = By.id("login-button");
    static By addItem1Locator = By.id("add-to-cart-sauce-labs-backpack");
    static By addItem2Locator = By.id("add-to-cart-sauce-labs-bike-light");
    static By addItem3Locator = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    static By addItem4Locator = By.id("add-to-cart-sauce-labs-fleece-jacket");
    static By addItem5Locator = By.id("add-to-cart-sauce-labs-onesie");
    static By addItem6Locator = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    static By removeItem1Locator = By.id("remove-sauce-labs-backpack");
    static By removeItem2Locator = By.id("remove-sauce-labs-bike-light");
    static By removeItem3Locator = By.id("remove-sauce-labs-bolt-t-shirt");
    static By removeItem4Locator = By.id("remove-sauce-labs-fleece-jacket");
    static By removeItem5Locator = By.id("remove-sauce-labs-onesie");
    static By removeItem6Locator = By.id("remove-test.allthethings()-t-shirt-(red)");

    static By cartLocator = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    static By cartBadgeLocator = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");

    static By checkoutButtonLocator = By.id("checkout");
    static By continueCheckoutButtonLocator = By.id("continue");
    static By overviewCheckoutLocator = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    static By finishCheckoutLocator = By.id("finish");

    static By firstNameLocator = By.id("first-name");
    static By lastNameLocator = By.id("last-name");
    static By zipCodeLocator = By.id("postal-code");
    static By thanksMessageLocator=By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

public AddToCart() throws InterruptedException {
       cartItemsCount = 0; 
    }
    public static void explicitWait(WebDriver driver,int time, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void AddItemToCart(WebDriver driver, String itemName)
    {
        switch (itemName) {
            case "Sauce Labs Backpack":
                driver.findElement(addItem1Locator).click();
                cartItemsCount++;

                break;
            case "Sauce Labs Bike Light":
                driver.findElement(addItem2Locator).click();
                cartItemsCount++;
                break;
            case "Sauce Labs Bolt T-Shirt":
                driver.findElement(addItem3Locator).click();
                cartItemsCount++;
                break;
            case "Sauce Labs Fleece Jacket":
                driver.findElement(addItem4Locator).click();
                cartItemsCount++;
                break;
            case  "Sauce Labs Onesie":
                driver.findElement(addItem5Locator).click();
                cartItemsCount++;
                break;
            case "Test.allTheThings() T-Shirt (Red)":
                driver.findElement(addItem6Locator).click();
                cartItemsCount++;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + itemName);
        }
    }

    public static void checkCartBadge(WebDriver driver)
    {
        String badgeValue = driver.findElement(cartBadgeLocator).getText();
        System.out.println("Cart badge value: " + badgeValue);
        System.out.println("Cart items count: " + cartItemsCount);
        if (!badgeValue.equals(String.valueOf(cartItemsCount))) {
            throw new AssertionError("Cart badge value is not "+ cartItemsCount +": actual=" + badgeValue);
        }
    }

    public static String getThanksMessage(WebDriver driver)
    {
       explicitWait(driver, 15, thanksMessageLocator);
       return driver.findElement(thanksMessageLocator).getText();
    }

    public static void checkButtonChanged(WebDriver driver, String itemName)
    {
        switch (itemName) {
            case "Sauce Labs Backpack":
                if (!driver.findElement(removeItem1Locator).getText().equals("Remove")) {
                    throw new AssertionError("Button text is not Remove: actual=" + driver.findElement(addItem1Locator).getText());
                }
                break;
            case "Sauce Labs Bike Light":
                if (!driver.findElement(removeItem2Locator).getText().equals("Remove")) {
                    throw new AssertionError("Button text is not Remove: actual=" + driver.findElement(addItem2Locator).getText());
                }
                break;
            case "Sauce Labs Bolt T-Shirt":
                if (!driver.findElement(removeItem3Locator).getText().equals("Remove")) {
                    throw new AssertionError("Button text is not Remove: actual=" + driver.findElement(addItem3Locator).getText());
                }
                break;
            case "Sauce Labs Fleece Jacket":
                if (!driver.findElement(removeItem4Locator).getText().equals("Remove")) {
                    throw new AssertionError("Button text is not Remove: actual=" + driver.findElement(addItem4Locator).getText());
                }
                break;
            case  "Sauce Labs Onesie":
                if (!driver.findElement(removeItem5Locator).getText().equals("Remove")) {
                    throw new AssertionError("Button text is not Remove: actual=" + driver.findElement(addItem5Locator).getText());
                }
                break;
            case "Test.allTheThings() T-Shirt (Red)":
                if (!driver.findElement(removeItem6Locator).getText().equals("Remove")) {
                    throw new AssertionError("Button text is not Remove: actual=" + driver.findElement(addItem6Locator).getText());
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + itemName);
        }
    }
    public static void addCheckoutDetails(WebDriver driver, String firstName, String lastName, String zipCode) throws InterruptedException
    {
        explicitWait(driver, 15, firstNameLocator);
        driver.findElement(firstNameLocator).sendKeys(firstName);
        driver.findElement(lastNameLocator).sendKeys(lastName);
        driver.findElement(zipCodeLocator).sendKeys(zipCode);
        Thread.sleep(2000);
    }

    public static void clickOnCart(WebDriver driver)
    {
        explicitWait(driver, 15, cartLocator);
        driver.findElement(cartLocator).click();
    }

    public static void clickOnCheckout(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        explicitWait(driver, 15, checkoutButtonLocator);
        driver.findElement(checkoutButtonLocator).click();
    }

    public static void clickOnContinueCheckout(WebDriver driver)
    {
        explicitWait(driver, 15, continueCheckoutButtonLocator);
        driver.findElement(continueCheckoutButtonLocator).click();
    }

    public static void resetCartItemsCount()
    {
        cartItemsCount = 0;
    }

    public static void checkOverviewPage(WebDriver driver)
    {
        explicitWait(driver, 15, overviewCheckoutLocator);
    }

    public static void clickOnFinishCheckout(WebDriver driver)
    {
        explicitWait(driver, 15, finishCheckoutLocator);
        driver.findElement(finishCheckoutLocator).click();
    }



    public static void assertEqualUrls(String expectedUrl, String actualUrl)
    {
        if (!expectedUrl.equals(actualUrl)) {
            throw new AssertionError("URLs are not equal: expected=" + expectedUrl + ", actual=" + actualUrl);
        }
    }

    public static void assertUrlContains(String expectedUrl, String actualUrl)
    {
        if (!actualUrl.contains(expectedUrl)) {
            throw new AssertionError("URL does not contain expected value: expected=" + expectedUrl + ", actual=" + actualUrl);
        }
    }



}
