package AllFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImagesFeatureSteps {

    WebDriver driver = new EdgeDriver();

    @Given("I am on the home page logged in with credentials {string} and {string}")
    public void i_am_on_the_home_page_logged_in_with_credientials_and(String string, String string2) throws InterruptedException {
        LoginPage.goToLoginPage(driver);
        LoginPage.enterUsername(driver, string);
        LoginPage.enterPassword(driver, string2);
        LoginPage.clickLoginButton(driver);
    }
    @When("I look at the list of items")
    public void i_look_at_the_list_of_items()
    {
        ImagesFeaturePage.scrollImages(driver);
    }
    @Then("I should see an image for each item in the list")
    public void i_should_see_an_image_for_each_item_in_the_list()
    {
        String status = ImagesFeaturePage.checkImagesSrcs(driver);
        ImagesFeaturePage.assertEqualUrls("True", status);

    }

}
