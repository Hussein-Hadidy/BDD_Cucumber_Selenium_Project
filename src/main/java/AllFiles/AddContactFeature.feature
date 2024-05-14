Feature: Adding a new contact to the address book
  As a user of the address book feature, I want to be able to add a new contact with valid details
  so that I can keep track of important contacts easily.


  Scenario: Adding a valid new contact to the address book
  As a user, I should be logged in successfully using my email "huss1@gmail.com" and password "12345678".
  After logging in, I should be navigated to the address book page.
  On the address book page, I should see a form to enter the details of the new contact.
  I enter the contact details including first name "Hussein," last name "Khaled," date of birth "2024-12-20," email "example@hotmail.com," phone number "01022020337," street address line 1 "Street address1," street address line 2 "Street address2," city "Cairo," state/province "Cairo," postal code "90210," and country "Egypt."
  Upon entering all the required details, I click on the submit button.
  After submission, I should receive confirmation that the new contact has been successfully added to the address book.
  I should now be able to see the new contact listed in the address book.
  Definition of Done: The application allows users to log in, navigate to the address book page, fill out the new contact form with valid details, submit the form, and receive confirmation of successful addition of the new contact to the address book.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "example@hotmail.com" and "01022020337" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should see the new contact added to the address book

  Scenario: Adding a new contact with valid large email to the address book
  As a user of the address book feature, I want to be able to add a new contact with valid details,
  including a large email address, so that I can efficiently manage my contacts without limitations.
  I should be logged in successfully using my email "huss1@gmail.com" and password "12345678".
  After logging in, I should be navigated to the address book page.
  On the address book page, I should see a form to enter the details of the new contact.
  I enter the contact details including first name "Hussein," last name "Khaled," date of birth "2024-12-20," email "daniel@email.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm,"
  phone number "01022020337," street address line 1 "Street address1," street address line 2 "Street address2," city "Cairo," state/province "Cairo," postal code "90210," and country "Egypt."
  Upon entering all the required details, I click on the submit button.
  Definition of Done: After submission, I should receive confirmation that the new contact with the large email address has been successfully added to the address book.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "daniel@email.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm" and "01022020337" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should see the new contact added to the address book

  Scenario: Adding a new contact with invalid email to the address book

  As a user of the address book feature, I want the system to validate email addresses when adding a new contact to ensure data accuracy and prevent errors.
  I should be logged in successfully using my email "huss1@gmail.com" and password "12345678".
  After logging in, I should be navigated to the address book page.
  On the address book page, I should see a form to enter the details of the new contact.
  I enter the contact details including first name "Hussein," last name "Khaled," date of birth "2024-12-20," invalid email "example," phone number "01022020337," street address line 1 "Street address1," street address line 2 "Street address2," city "Cairo," state/province "Cairo," postal code "90210," and country "Egypt."
  Upon entering all the required details, I click on the submit button.
  Definition of done: After submission, I should receive an error message specifically for the email field indicating that the entered email address is invalid.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "example" and "01022020337" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should see an error message for the email field

  Scenario: Adding a new contact with invalid email to the address book

  As a user of the address book feature, I expect the system to validate email addresses when adding a new contact to prevent erroneous data entries.
  I successfully log in using my email "huss1@gmail.com" and password "12345678" and reach the address book page.
  On the address book page, I see a form to input new contact details.
  I enter the new contact's details: first name "Hussein," last name "Khaled," date of birth "2024-12-20," invalid email "example," phone number "01022020337",
  street address line 1 "Street address1," street address line 2 "Street address2," city "Cairo," state/province "Cairo," postal code "90210," and country "Egypt."
  After clicking the submit button, the system should detect the invalid email format.
  Definition of done: error message specifically related to the email field should be displayed, indicating that the entered email address is invalid.
  and The form should not proceed with adding the new contact until a valid email address is provided.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "example" and "01022020337" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should see an error message for the email field

  Scenario: Adding a new contact with invalid phone number to the address book

  As a user of the address book feature, I expect the system to validate phone numbers when adding a new contact to ensure accurate data entry.
  I successfully log in using my email "huss1@gmail.com" and password "12345678" and reach the address book page.
  On the address book page, I see a form to input new contact details.
  I enter the new contact's details: first name "Hussein," last name "Khaled," date of birth "2024-12-20," email "example@hotmail.com," invalid phone number "800453521a",
  street address line 1 "Street address1," street address line 2 "Street address2," city "Cairo," state/province "Cairo," postal code "90210," and country "Egypt."
  After clicking the submit button, the system should detect the invalid phone number format.
  Definition of done: error message specifically related to the phone number field should be displayed, indicating that the entered phone number is invalid.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "example@hotmail.com" and "800453521a" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should see an error message for the phone number field

  Scenario: User clicks on logout button

  As a user of the address book feature, I want the ability to log out securely so that my session ends and I can return to the login page.
  I successfully log in using my email "huss1@gmail.com" and password "12345678" and reach the address book page.
  On the address book page, I should see a logout button.
  On clicking the logout button, the system should end my session.
  Definition of Done: After logging out, I should be redirected to the login page.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I click on the logout button
    Then I should see the login page

  Scenario: Adding a duplicated contact to the address book

  As a user of the address book feature, I expect the system to prevent the addition of duplicated contacts to maintain data integrity.
  I successfully log in using my email "huss1@gmail.com" and password "12345678" and reach the address book page.
  On the address book page, I see a form to input new contact details.
  I enter the new contact's details: first name "Hussein," last name "Khaled," date of birth "2024-12-20," email "example@hotmail.com," phone number "01022020337",
  street address line 1 "Street address1," street address line 2 "Street address2," city "Cairo," state/province "Cairo," postal code "90210," and country "Egypt."
  After clicking the submit button, the system should check if a contact with the same email or phone number already exists in the address book.
  If a duplicate contact is detected, I should remain on the add contact page.
  Definition of done: An errror message should be displayed, indicating that the contact already exists and preventing the addition of the duplicate contact.

    Given I am on the address book page after login with "huss1@gmail.com" and "12345678"
    When I enter the contact details "hussein" and "khaled" and "2024-12-20" and "example@hotmail.com" and "01022020337" and "Street address1" and "Street address2" and "Cairo" and "Cairo" and "90210 " and "Egypt"
    And I click on the submit button
    Then I should stuck in add contact page and have an error