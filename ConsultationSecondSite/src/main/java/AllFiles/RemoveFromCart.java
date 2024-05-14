package AllFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RemoveFromCart
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

public RemoveFromCart() throws InterruptedException {
       cartItemsCount = 0; 
    }
    public static void explicitWait(WebDriver driver,int time, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void RemoveItemFromCart(WebDriver driver, String itemName) throws InterruptedException {
        Thread.sleep(1000);
        switch (itemName) {
            case "Sauce Labs Backpack":
                explicitWait(driver, 15, removeItem1Locator);
                driver.findElement(removeItem1Locator).click();
                cartItemsCount--;
                break;
            case "Sauce Labs Bike Light":
                explicitWait(driver, 15, removeItem2Locator);
                driver.findElement(removeItem2Locator).click();
                cartItemsCount--;
                break;
            case "Sauce Labs Bolt T-Shirt":
                explicitWait(driver, 15, removeItem3Locator);
                driver.findElement(removeItem3Locator).click();
                cartItemsCount--;
                break;
            case "Sauce Labs Fleece Jacket":
                explicitWait(driver, 15, removeItem4Locator);
                driver.findElement(removeItem4Locator).click();
                cartItemsCount--;
                break;
            case  "Sauce Labs Onesie":
                explicitWait(driver, 15, removeItem5Locator);
                driver.findElement(removeItem5Locator).click();
                cartItemsCount--;
                break;
            case "Test.allTheThings() T-Shirt (Red)":
                explicitWait(driver, 15, removeItem6Locator);
                driver.findElement(removeItem6Locator).click();
                cartItemsCount--;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + itemName);
        }
    }

    public static void checkCartBadge(WebDriver driver)
    {
        String badgeValue = driver.findElement(cartBadgeLocator).getText();
        if (!badgeValue.equals(String.valueOf(cartItemsCount))) {
            throw new AssertionError("Cart badge value is not "+ cartItemsCount +": actual=" + badgeValue);
        }
    }

    public static void checkButtonChangedToAddToCart(WebDriver driver, String itemName)
    {
        switch (itemName) {
            case "Sauce Labs Backpack":
                System.out.println("I am here");
                explicitWait(driver, 15, addItem1Locator);
                if (!driver.findElement(addItem1Locator).getText().equals("Add to cart")) {
                    throw new AssertionError("Button text is not Add to cart: actual=" + driver.findElement(addItem1Locator).getText());
                }
                break;
            case "Sauce Labs Bike Light":
                explicitWait(driver, 15, addItem2Locator);
                if (!driver.findElement(addItem2Locator).getText().equals("Add to cart")) {
                    throw new AssertionError("Button text is not Add to cart: actual=" + driver.findElement(addItem2Locator).getText());
                }
                break;
            case "Sauce Labs Bolt T-Shirt":
                explicitWait(driver, 15, addItem3Locator);
                if (!driver.findElement(addItem3Locator).getText().equals("Add to cart")) {
                    throw new AssertionError("Button text is not Add to cart: actual=" + driver.findElement(addItem3Locator).getText());
                }
                break;
            case "Sauce Labs Fleece Jacket":
                explicitWait(driver, 15, addItem4Locator);
                if (!driver.findElement(addItem4Locator).getText().equals("Add to cart")) {
                    throw new AssertionError("Button text is not Add to cart: actual=" + driver.findElement(addItem4Locator).getText());
                }
                break;
            case  "Sauce Labs Onesie":
                explicitWait(driver, 15, addItem5Locator);
                if (!driver.findElement(addItem5Locator).getText().equals("Add to cart")) {
                    throw new AssertionError("Button text is not Add to cart: actual=" + driver.findElement(addItem5Locator).getText());
                }
                break;
            case "Test.allTheThings() T-Shirt (Red)":
                explicitWait(driver, 15, addItem6Locator);
                if (!driver.findElement(addItem6Locator).getText().equals("Add to cart")) {
                    throw new AssertionError("Button text is not Add to cart: actual=" + driver.findElement(addItem6Locator).getText());
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + itemName);
        }
    }

    public static void resetCartItemsCount()
    {
        cartItemsCount = 0;
    }   




}
