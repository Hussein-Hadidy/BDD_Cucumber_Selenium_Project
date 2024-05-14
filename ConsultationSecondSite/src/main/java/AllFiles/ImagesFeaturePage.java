package AllFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class ImagesFeaturePage {

    static By image1 = By.xpath("//img[@alt='Sauce Labs Backpack']");
    static By image2 = By.xpath("//*[@id=\"item_0_img_link\"]/img");
    static By image3=By.xpath("//*[@id=\"item_1_img_link\"]/img");
    static By image4=By.xpath("//*[@id=\"item_5_img_link\"]/img");
    static By image5 = By.xpath("//*[@id=\"item_2_img_link\"]/img");
    static By image6 = By.xpath("//*[@id=\"item_3_img_link\"]/img");
    static String image1Src = "https://www.saucedemo.com/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg";
    static String image2Src = "https://www.saucedemo.com/static/media/bike-light-1200x1500.37c843b0.jpg";
    static String image3Src ="https://www.saucedemo.com/static/media/bolt-shirt-1200x1500.c2599ac5.jpg";
    static String image4Src = "https://www.saucedemo.com/static/media/sauce-pullover-1200x1500.51d7ffaf.jpg";
    static String image5Src = "https://www.saucedemo.com/static/media/red-onesie-1200x1500.2ec615b2.jpg";
    static String image6Src = "https://www.saucedemo.com/static/media/red-tatt-1200x1500.30dadef4.jpg";

    public static void explicitWait(WebDriver driver,int time, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static String checkImagesSrcs(WebDriver driver)
    {
        explicitWait(driver, 15, image1);
        String src1 = driver.findElement(image1).getAttribute("src");
        String src2 = driver.findElement(image2).getAttribute("src");
        String src3 = driver.findElement(image3).getAttribute("src");
        String src4 = driver.findElement(image4).getAttribute("src");
        String src5 = driver.findElement(image5).getAttribute("src");
        String src6 = driver.findElement(image6).getAttribute("src");
//        System.out.println(src1);
//        System.out.println(src2);
//        System.out.println(src3);
//        System.out.println(src4);
//        System.out.println(src5);
//        System.out.println(src6);
        if (Objects.equals(src1, image1Src) && Objects.equals(src2, image2Src) && Objects.equals(src3, image3Src) && Objects.equals(src4, image4Src) && Objects.equals(src5, image5Src) && Objects.equals(src6, image6Src))
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
    public static void scrollImages(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
    }

}
