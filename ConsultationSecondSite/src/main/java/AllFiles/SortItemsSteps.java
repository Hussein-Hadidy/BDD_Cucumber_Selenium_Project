package AllFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SortItemsSteps {
    @Given("I am on the inventory page after logged as {string} and {string}")
    public void i_am_on_the_inventory_page(String username,String password) throws InterruptedException
    {
        AddToCart.resetCartItemsCount();
        LoginPage.goToLoginPage(driver);
        LoginPage.enterUsername(driver, username);
        LoginPage.enterPassword(driver, password);
        LoginPage.clickLoginButton(driver);
    }
    WebDriver driver=new EdgeDriver();
    @When("I click on the sort button and choose Z To A")
    public void i_click_on_the_sort_button_and_choose_a_to_z() throws InterruptedException
    {
        SortItemsPage.chooseSortDescending(driver);

    }
    @Then("I should see the elements sorted by name in descending order")
    public void i_should_see_the_elements_sorted_by_name_in_ascending_order() throws InterruptedException
    {
        System.out.println("I should see the elements sorted by name in descending order");
        boolean checkValue= SortItemsPage.checkSortedByName(driver);
        String status="True";
        if(!checkValue)
        {
            status="False";
        }
        SortItemsPage.assertEqualUrls("True",status);
    }



    @When("I click on the sort button and choose High to Low")
    public void iClickOnTheSortButtonAndChooseHighToLow() throws InterruptedException {
        SortItemsPage.chooseSortDescendingByPrice(driver);
    }

    @Then("I should see the elements sorted by price in descending order")
    public void iShouldSeeTheElementsSortedByPriceInDescendingOrder() throws InterruptedException {
        System.out.println("I should see the elements sorted by price in ascending order");
        boolean checkValue= SortItemsPage.checkSortedByPrice(driver);
        String status="True";
        if(!checkValue)
        {
            status="False";
        }
        SortItemsPage.assertEqualUrls("True",status);
    }
}
