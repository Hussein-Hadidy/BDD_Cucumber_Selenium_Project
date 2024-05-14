package AllFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UIElementsPage {

    static By cartLocator = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    public static void explicitWait(WebDriver driver, int time, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static String checkCartPosition(WebDriver driver)
    {
        explicitWait(driver, 15, cartLocator);
        WebElement cartElement = driver.findElement(cartLocator);
        Point location = cartElement.getLocation();
        int x = location.getX();
        int y = location.getY();
        if(x==912 && y==10)
        {
            return "True";
        }
        else
        {
            return "False";
        }
    }
    public static void assertEqualUrls(String expectedUrl, String actualUrl)
    {
        if (!expectedUrl.equals(actualUrl))
        {
            throw new AssertionError("URLs are not equal: expected=" + expectedUrl + ", actual=" + actualUrl);
        }
    }
}
