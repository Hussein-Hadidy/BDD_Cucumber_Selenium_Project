package AllFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UIElementsSteps {

    WebDriver driver = new EdgeDriver();
    @Given("User is on the homepage and logged in as {string} and {string}")
    public void user_is_on_the_homepage_and_logged_in_as_and(String string, String string2) throws InterruptedException {
        LoginPage.goToLoginPage(driver);
        LoginPage.enterUsername(driver, string);
        LoginPage.enterPassword(driver, string2);
        LoginPage.clickLoginButton(driver);
    }
    @When("User looks at the top right corner of the page")
    public void user_looks_at_the_top_right_corner_of_the_page()
    {

    }
    @Then("User should see the cart icon in the top right corner of the page")
    public void user_should_see_the_cart_icon_in_the_top_right_corner_of_the_page()
    {
        String status = UIElementsPage.checkCartPosition(driver);
        UIElementsPage.assertEqualUrls("True", status);
    }

    @When("the user chooses an item to add to the cart")
    public void the_user_chooses_an_item_to_add_to_the_cart()
    {
        AddToCart.AddItemToCart(driver, "Sauce Labs Backpack");
        AddToCart.clickOnCart(driver);
    }
    @When("User looks at the bottom right corner of the page")
    public void user_looks_at_the_bottom_right_corner_of_the_page()
    {

    }
    @Then("User should see the checkout button in the bottom right corner of the page")
    public void user_should_see_the_checkout_button_in_the_bottom_right_corner_of_the_page()
    {
        String status = UIElementsPage.checkCheckoutPosition(driver);
        UIElementsPage.assertEqualUrls("True", status);

    }
}
