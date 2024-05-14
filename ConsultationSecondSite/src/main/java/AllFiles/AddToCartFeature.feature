Feature: Add To Cart Feature

  Scenario: User adds an item to cart
  As a user, I want to be able to add an item to the cart so that I can purchase it later
  Definition of done: The item should be added to the cart and the cart icon should have a badge with the number of items in the cart
    Given I am on the inventory page as "standard_user" and "secret_sauce"
    When I click on the Add to Cart button for "Sauce Labs Backpack"
    Then I should see that the cart icon has a badge with 1 
    And the add to cart button of "Sauce Labs Backpack" should change to remove


  Scenario: User adds an item to cart
  As a user, I want to be able to add an item to the cart so that I can purchase it later
  Definition of done: The item should be added to the cart and the cart icon should have a badge with the number of items in the cart
    Given I am on the inventory page as "error_user" and "secret_sauce"
    When I click on the Add to Cart button for "Sauce Labs Bolt T-Shirt"
    Then I should see that the cart icon has a badge with 1
    And the add to cart button of "Sauce Labs Bolt T-Shirt" should change to remove


  Scenario: User adds multiple items to cart
  As a user, I want to be able to add multiple items to the cart so that I can purchase them later
  Definition of done: The items should be added to the cart and the cart icon should have a badge with the number of items in the cart
    Given I am on the inventory page as "standard_user" and "secret_sauce"
    When I click on the Add to Cart button for "Sauce Labs Backpack"
    And I click on the Add to Cart button for "Sauce Labs Bike Light"
    Then I should see that the cart icon has a badge with 2
    And the add to cart button of "Sauce Labs Backpack" should change to remove
    And the add to cart button of "Sauce Labs Bike Light" should change to remove

  Scenario: User adds multiple items to cart
  As a user, I want to be able to add multiple items to the cart so that I can purchase them later
  Definition of done: The items should be added to the cart and the cart icon should have a badge with the number of items in the cart
    Given I am on the inventory page as "standard_user" and "secret_sauce"
    When I click on the Add to Cart button for "Sauce Labs Backpack"
    And I click on the Add to Cart button for "Sauce Labs Bike Light"
    And I click on the Add to Cart button for "Sauce Labs Bolt T-Shirt"
    And I click on the Add to Cart button for "Sauce Labs Onesie"
    And I click on the Add to Cart button for "Test.allTheThings() T-Shirt (Red)"
    And I click on the Add to Cart button for "Sauce Labs Fleece Jacket"
    Then I should see that the cart icon has a badge with 2
    And the add to cart button of "Sauce Labs Backpack" should change to remove
    And the add to cart button of "Sauce Labs Bike Light" should change to remove

  Scenario: User adds multiple items to cart
  As a user, I want to be able to add multiple items to the cart so that I can purchase them later
  Definition of done: The items should be added to the cart and the cart icon should have a badge with the number of items in the cart
    Given I am on the inventory page as "error_user" and "secret_sauce"
    When I click on the Add to Cart button for "Sauce Labs Backpack"
    And I click on the Add to Cart button for "Sauce Labs Bike Light"
    And I click on the Add to Cart button for "Sauce Labs Bolt T-Shirt"
    And I click on the Add to Cart button for "Sauce Labs Onesie"
    And I click on the Add to Cart button for "Test.allTheThings() T-Shirt (Red)"
    And I click on the Add to Cart button for "Sauce Labs Fleece Jacket"
    Then I should see that the cart icon has a badge with 2
    And the add to cart button of "Sauce Labs Backpack" should change to remove
    And the add to cart button of "Sauce Labs Bike Light" should change to remove

  Scenario: User checks out the cart standard
  As a user, I want to be able to check out the cart so that I can purchase the items
  Definition of done: The user should be able to check out the cart and see the checkout overview page

    Given I am on the inventory page as "standard_user" and "secret_sauce"
    When I click on the Add to Cart button for "Sauce Labs Backpack"
    And I click on the cart icon
    And I click on the checkout button
    And I enter my checkout information of "Hussein" and "Last Name" and "Postal Code"
    And I click on the continue button
    Then I should see the checkout overview page
    And upon clicking the finish button
    Then I should see thank you your order is completed

  Scenario: User checks out the cart Other User
  As a user, I want to be able to check out the cart so that I can purchase the items
  Definition of done: The user should be able to check out the cart and see the checkout overview page
    Given I am on the inventory page as "error_user" and "secret_sauce"
    When I click on the Add to Cart button for "Sauce Labs Backpack"
    And I click on the cart icon
    And I click on the checkout button
    And I enter my checkout information of "Hussein" and "Last Name" and "Postal Code"
    And I click on the continue button
    Then I should see the checkout overview page
    And upon clicking the finish button
    Then I should see thank you your order is completed

  Scenario: User checks out the cart Other User problem
  As a user, I want to be able to check out the cart so that I can purchase the items
  Definition of done: The user should be able to check out the cart and see the checkout overview page
    Given I am on the inventory page as "problem_user" and "secret_sauce"
    When I click on the Add to Cart button for "Sauce Labs Backpack"
    And I click on the cart icon
    And I click on the checkout button
    And I enter my checkout information of "Hussein" and "Last Name" and "Postal Code"
    And I click on the continue button
    Then I should see the checkout overview page
    And upon clicking the finish button
    Then I should see thank you your order is completed





  # Scenario: User logs in with problem_user username
  #   Given I am on the login page
  #   When I enter valid "problem_user" and "secret_sauce"
  #   And I press Login
  #   Then I should be logged in to the application

  # Scenario: User logs in with error_user username
  #   Given I am on the login page
  #   When I enter valid "error_user" and "secret_sauce"
  #   And I press Login
  #   Then I should be logged in to the application




