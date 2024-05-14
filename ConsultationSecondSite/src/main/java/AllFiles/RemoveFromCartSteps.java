package AllFiles;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class RemoveFromCartSteps {
    WebDriver driver=new EdgeDriver();

    public RemoveFromCartSteps() throws InterruptedException {
    }
    @Given("I am on the inventory page as {string} and {string}.")
    public void i_am_on_the_inventory_page(String username,String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        AddToCart.resetCartItemsCount();
        LoginPage.goToLoginPage(driver);
        LoginPage.enterUsername(driver, username);
        LoginPage.enterPassword(driver, password);
        LoginPage.clickLoginButton(driver);
    }


    @Then("I should see that the cart icon has a badge with {int}.")
    public void i_should_see_that_the_cart_icon_has_a_badge_with(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        AddToCart.explicitWait(driver, 10, AddToCart.cartBadgeLocator);
        AddToCart.checkCartBadge(driver);
    }
    @Then("the add to cart button of {string} should change to remove.")
    public void the_add_to_cart_button_should_change_to_remove(String itemName) {
        // Write code here that turns the phrase above into concrete actions
        AddToCart.checkButtonChanged(driver,itemName);
    }
    @When("I click on the Remove button for {string}.")
    public void i_click_on_the_remove_button_for(String string) throws InterruptedException {
        RemoveFromCart.RemoveItemFromCart(driver, string);
    }
    @Then("the add to cart button of {string} should change to Add to Cart.")
    public void the_add_to_cart_button_of_should_change_to_add_to_cart(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
        RemoveFromCart.checkButtonChangedToAddToCart(driver,string);
    }

    @And("I click on the Add to Cart button for {string} {string}.")
    public void iClickOnTheAddToCartButtonFor(String arg0, String arg1) throws InterruptedException {
        AddToCart.AddItemToCart(driver, arg0);
        Thread.sleep(2000);
        AddToCart.AddItemToCart(driver, arg1);
    }
}
