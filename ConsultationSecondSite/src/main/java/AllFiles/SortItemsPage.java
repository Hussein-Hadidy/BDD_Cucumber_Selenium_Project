package AllFiles;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SortItemsPage
{
    static By sortButton = By.cssSelector("[data-test=\'product-sort-container\']");

    static By name1Locator = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    static By name2Locator = By.xpath("//*[@id=\"item_0_title_link\"]/div");
    static By name3Locator = By.xpath("//*[@id=\"item_1_title_link\"]/div");
    static By name4Locator = By.xpath("//*[@id=\"item_5_title_link\"]/div");
    static By name5Locator = By.xpath("//*[@id=\"item_2_title_link\"]/div");
    static By name6Locator = By.xpath("//*[@id=\"item_3_title_link\"]/div");

    public static void explicitWait(WebDriver driver,int time, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    private static boolean isSortedDescending(List<WebElement> items) {
        String[] firstWords = new String[items.size()];
        System.out.println("HII");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getText());
            firstWords[i] = getFirstWord(items.get(i).getText());
        }
        for (int i = 0; i < firstWords.length - 1; i++) {
            if (firstWords[i].compareTo(firstWords[i + 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSortedDescendingByPrice(List<WebElement> items) {
        List<Double> prices = new ArrayList<>();
        for (WebElement item : items) {
            prices.add(getPriceValue(item.getText()));
        }
        for (int i = 0; i < prices.size() - 1; i++) {
            if (prices.get(i) < prices.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    private static double getPriceValue(String priceText) {
        // Remove the dollar sign and convert to double
        return Double.parseDouble(priceText.replace("$", ""));
    }

    private static String getFirstWord(String text) {
        return text.split(" ")[0];
    }
    public static void chooseSortDescending(WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);
        explicitWait(driver, 15, sortButton);
     //   List<WebElement> items = driver.findElements(By.className("inventory_item"));
        WebElement sortIcon = driver.findElement(sortButton);
        Select select = new Select(sortIcon);
        select.selectByVisibleText("Name (Z to A)");
        Thread.sleep(2000);
    }

    public static void chooseSortDescendingByPrice(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        explicitWait(driver, 15, sortButton);
        //   List<WebElement> items = driver.findElements(By.className("inventory_item"));
        WebElement sortIcon = driver.findElement(sortButton);
        Select select = new Select(sortIcon);
        select.selectByVisibleText("Price (high to low)");
        Thread.sleep(2000);
    }

    public static boolean checkSortedByPrice(WebDriver driver) throws InterruptedException
    {
        Thread.sleep(1000);
        List<WebElement> items = driver.findElements(By.className("inventory_item_price"));
        return isSortedDescendingByPrice(items);
    }

    public static boolean checkSortedByName(WebDriver driver) throws InterruptedException
    {
        Thread.sleep(1000);
        List<WebElement> items = driver.findElements(By.className("inventory_item_name"));
        return isSortedDescending(items);
    }
    public static void assertEqualUrls(String expectedUrl, String actualUrl)
    {
        if (!expectedUrl.equals(actualUrl))
        {
            throw new AssertionError("URLs are not equal: expected=" + expectedUrl + ", actual=" + actualUrl);
        }
    }


}
