Feature: Editing a contact
  Scenario: Editing a user's email

  As a user of the address book feature, I want to modify a contact's email to ensure accurate information.
  I log in, select the contact for editing, update the email, save changes, and verify the updated email in the contact details.

    Given I am on the contact page logged in with "huss1@gmail.com" and "12345678"
    When I choose a contact to edit
    And I change the email to "huss@gmail.com"
    And I click the submit button
    Then I should see the contact's email as "huss@gmail.com"

  Scenario: Deleting a contact

  As a user of the address book feature, I want to delete contacts efficiently.
  I log in, choose a contact for deletion, confirm the action, and verify successful deletion on the home page.

    Given I am on the contact page logged in with "huss1@gmail.com" and "12345678"
    When I choose a contact to delete
    And I click the delete button
    Then I should be redirected back to the home page with the contact deleted

  Scenario: Returning to contact list

  As a user of the address book feature, I want to easily navigate back to the contact list after editing a contact.
  I log in, edit a contact's details, and ensure seamless redirection back to the home page with the updated contact list displayed.

    Given I am on the contact page logged in with "huss1@gmail.com" and "12345678"
    When I choose a contact to edit
    And I click the return button
    Then I should be redirected back to the home page