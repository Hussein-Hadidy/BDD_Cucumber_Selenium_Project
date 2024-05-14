Feature: Important UI Elements should be in their place
  As a user I want to see the cart icon in the top right corner of the page and the checkout button in the bottom right corner of the page so that I can easily find them.
  Definition of Done: The cart icon should be in the top right corner of the page and the checkout button should be in the bottom right corner of the page.
  Scenario: User should be able to find the cart icon in its desired place
    Given User is on the homepage and logged in as "visual_user" and "secret_sauce"
    When User looks at the top right corner of the page
    Then User should see the cart icon in the top right corner of the page

  Scenario: User should be able to find the cart icon in its desired place
    As a user I want to see the cart icon in the top right corner of the page so that I can easily find it.
    Definition of Done: The cart icon should be in the top right corner of the page.
    Given User is on the homepage and logged in as "standard_user" and "secret_sauce"
    When User looks at the top right corner of the page
    Then User should see the cart icon in the top right corner of the page


  Scenario: User should be able to find the checkout button in its desired place
    As a user I want to see the checkout button in the bottom right corner of the page so that I can easily find it.
    Definition of Done: The checkout button should be in the bottom right corner of the page.
    Given User is on the homepage and logged in as "standard_user" and "secret_sauce"
    When the user chooses an item to add to the cart
    And User looks at the bottom right corner of the page
    Then User should see the checkout button in the bottom right corner of the page

  Scenario: User should be able to find the checkout button in its desired place
    As a user I want to see the checkout button in the bottom right corner of the page so that I can easily find it.
    Definition of Done: The checkout button should be in the bottom right corner of the page.
    Given User is on the homepage and logged in as "visual_user" and "secret_sauce"
    When the user chooses an item to add to the cart
    And User looks at the bottom right corner of the page
    Then User should see the checkout button in the bottom right corner of the page

