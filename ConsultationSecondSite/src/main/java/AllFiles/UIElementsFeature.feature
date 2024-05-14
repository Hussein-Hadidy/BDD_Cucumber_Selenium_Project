Feature: Important UI Elements should be in their place
  Scenario: User should be able to find the cart icon in its desired place
    Given User is on the homepage and logged in as "visual_user" and "secret_sauce"
    When User looks at the top right corner of the page
    Then User should see the cart icon in the top right corner of the page

  Scenario: User should be able to find the cart icon in its desired place
    Given User is on the homepage and logged in as "standard_user" and "secret_sauce"
    When User looks at the top right corner of the page
    Then User should see the cart icon in the top right corner of the page