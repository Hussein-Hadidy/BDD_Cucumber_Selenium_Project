Feature: Remove From Cart Feature
  Scenario: User removes an item from the cart
    Given I am on the inventory page as "standard_user" and "secret_sauce".
    And I click on the Add to Cart button for "Sauce Labs Backpack" "Sauce Labs Bike Light".
    When I click on the Remove button for "Sauce Labs Backpack".
    Then the add to cart button of "Sauce Labs Backpack" should change to Add to Cart.

#    Scenario: User removes two items from the cart
#    Given I am on the inventory page as "standard_user" and "secret_sauce

