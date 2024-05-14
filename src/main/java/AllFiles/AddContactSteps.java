package AllFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AddContactSteps {
    WebDriver driver=new EdgeDriver();

    public AddContactSteps() throws InterruptedException {
    }
    @Given("I am on the address book page after login with {string} and {string}")
    public void i_am_on_the_address_book_page_after_login_with_and(String username, String password) throws InterruptedException {
        LoginPage.goToLoginPage(driver);
        LoginPage.enterEmail(driver, username);
        LoginPage.enterPassword(driver, password);
        LoginPage.clickSubmitButton(driver);
        AddContactPage.goToAddressBookPage(driver);
    }

    @When("I enter the contact details {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void i_enter_the_new_contact_details_and_and_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11)
    {
        AddContactPage.enterContactDetails(driver, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11);
    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() throws InterruptedException
    {
        AddContactPage.clickSubmitButton(driver);
        Thread.sleep(2000);
    }

    @Then("I should see the new contact added to the address book")
    public void i_should_see_the_new_contact_added_to_the_address_book()
    {
        String currURL = driver.getCurrentUrl();
        AddContactPage.assertEqualUrls("https://thinking-tester-contact-list.herokuapp.com/contactList", currURL);
    }

    @When("I click on the logout button")
    public void i_click_on_the_logout_button() throws InterruptedException {
        AddContactPage.clickLogoutButton(driver);
    }

    @Then("I should see the login page")
    public void i_should_see_the_login_page()
    {
        String currURL = driver.getCurrentUrl();
        AddContactPage.assertEqualUrls("https://thinking-tester-contact-list.herokuapp.com/", currURL);
        driver.quit();
    }

    @Then("I should stuck in add contact page and have an error")
    public void i_should_stuck_in_add_contact_page_and_have_an_error()
    {
        String url=driver.getCurrentUrl();
        AddContactPage.assertEqualUrls("https://thinking-tester-contact-list.herokuapp.com/addContact",url);
        driver.quit();
    }

    @Then("I should see an error message for the email field")
    public void i_should_see_an_error_message()
    {
        String errorMessage=AddContactPage.getErrorMessage(driver);
        AddContactPage.assertEqualUrls("Contact validation failed: email: Email is invalid",errorMessage);
        driver.quit();
    }

    @Then("I should see an error message for the phone number field")
    public void i_should_see_an_error_message_for_the_phone_number_field()
    {
        String errorMessage=AddContactPage.getErrorMessage(driver);
        AddContactPage.assertEqualUrls("Contact validation failed: phone: Phone number is invalid",errorMessage);
        driver.quit();
    }




}
