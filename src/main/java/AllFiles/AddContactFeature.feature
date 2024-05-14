Feature: Adding a new contact to the address book
  As a user of the address book feature, I want to be able to add a new contact with valid details
  so that I can keep track of important contacts easily.


  Scenario: Adding a valid new contact to the address book
  As a user, I need to log in, navigate to the address book page, fill out a form with contact details, and submit it. Upon submission, I should receive confirmation and see the new contact listed in the address book.
  Definition of done: After adding the new contact, I should navigate back to the address book page and see the new contact listed with the details I entered.
    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "example@hotmail.com" and "01022020337" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should see the new contact added to the address book

  Scenario: Adding a new contact with valid large email to the address book
  As a user, I need to log in, navigate to the address book, fill out a form with contact details including a large email address, and submit it. Upon submission, I should receive confirmation that the new contact has been added successfully, even with the large email address. This is necessary for efficient contact management without limitations.
  Definition of done: After adding the new contact, I should navigate back to the address book page and see the new contact listed with the details I entered.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "daniel@email.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm" and "01022020337" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should see the new contact added to the address book


  Scenario: Adding a new contact with invalid email to the address book

  As a user, I need the system to validate email addresses when adding a new contact after logging in and navigating to the address book page. If I enter an invalid email and submit the form, I should receive an error message for the email field, ensuring data accuracy and error prevention.
  Definition of done: After submission, I should receive an error message specifically for the email field indicating that the entered email address is invalid.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "example" and "01022020337" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should see an error message for the email field

  Scenario: Adding a new contact with invalid phone number to the address book

  As a user, I expect the system to validate phone numbers when adding a new contact after logging in and navigating to the address book page. If I enter an invalid phone number and submit the form, the system should detect the error and display a specific message for the phone number field. The form should not proceed with adding the new contact until a valid phone number is provided, ensuring data accuracy and error prevention.
  Definition of done: After submission, I should receive an error message specifically for the phone number field indicating that the entered phone number is invalid.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "example@hotmail.com" and "800453521a" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should see an error message for the phone number field

  Scenario: User clicks on logout button

  As a user, after successfully logging in and navigating to the address book page, I should see a logout button. Clicking this button should end my session securely. The system should then redirect me to the login page, confirming the session has ended.
  Definition of done: After clicking the logout button, I should be redirected to the login page, confirming that my session has ended securely.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I click on the logout button
    Then I should see the login page

  Scenario: Adding a duplicated contact to the address book
  As a user, after logging in and navigating to the address book page, I should be able to input new contact details. If I attempt to add a contact that already exists in the system, the system should detect this duplication. I should remain on the add contact page and receive an error message indicating that the contact already exists, preventing the addition of duplicate contacts and maintaining data integrity.
  Definition of done: After submission, I should receive an error message indicating that the contact already exists, and I should remain on the add contact page.
    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "example@hotmail.com" and "01022020337" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should stuck in add contact page and have an error