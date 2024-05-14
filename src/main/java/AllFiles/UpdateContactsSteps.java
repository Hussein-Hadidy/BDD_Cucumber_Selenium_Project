package AllFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UpdateContactsSteps {

    WebDriver driver=new EdgeDriver();
    @Given("I am on the contact page logged in with {string} and {string}")
    public void i_am_on_the_contact_page_logged_in_with_and(String string, String string2) throws InterruptedException {
        LoginPage.goToLoginPage(driver);
        LoginPage.enterEmail(driver, string);
        LoginPage.enterPassword(driver, string2);
        LoginPage.clickSubmitButton(driver);
    }
    @When("I choose a contact to edit")
    public void i_choose_a_contact_to_edit() throws InterruptedException
    {
        UpdateContactsPage.clickToEditContact(driver);
    }
    @When("I change the email to {string}")
    public void i_change_the_email_to(String string) throws InterruptedException {
        UpdateContactsPage.enterNewEmail(driver, string);
    }
    @When("I click the submit button")
    public void i_click_the_submit_button() throws InterruptedException
    {
        UpdateContactsPage.clickSubmitButton(driver);
    }
    @Then("I should see the contact's email as {string}")
    public void i_should_see_the_contact_s_email_as(String string)
    {
        String email=UpdateContactsPage.checkEmailAfterUpdated(driver);
        UpdateContactsPage.assertEqualUrls(string,email);
    }

    @When("I choose a contact to delete")
    public void i_choose_a_contact_to_delete() throws InterruptedException
    {
        UpdateContactsPage.goToEditContact(driver);
    }
    @When("I click the delete button")
    public void i_click_the_delete_button() throws InterruptedException
    {
        UpdateContactsPage.clickDeleteButton(driver);
    }
    @Then("I should be redirected back to the home page with the contact deleted")
    public void i_should_be_redirected_back_to_the_home_page_with_the_contact_deleted()
    {
        String url=driver.getCurrentUrl();
        UpdateContactsPage.assertEqualUrls("https://thinking-tester-contact-list.herokuapp.com/contactList",url);
    }

    @When("I click the return button")
    public void i_click_the_return_button() throws InterruptedException {
        UpdateContactsPage.returnToContactList(driver);
    }
    @Then("I should be redirected back to the home page")
    public void i_should_be_redirected_back_to_the_home_page()
    {
        String url=driver.getCurrentUrl();
        UpdateContactsPage.assertEqualUrls("https://thinking-tester-contact-list.herokuapp.com/contactList",url);

    }



}
