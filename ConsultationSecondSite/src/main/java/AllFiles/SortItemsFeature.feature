Feature: Sorting Feature
  Scenario: Sorting by Name
    Given I am on the inventory page after logged as "standard_user" and "secret_sauce"
    When I click on the sort button and choose Z To A
    Then I should see the elements sorted by name in descending order

  Scenario: Sorting by Name Other User
    Given I am on the inventory page after logged as "error_user" and "secret_sauce"
    When I click on the sort button and choose Z To A
    Then I should see the elements sorted by name in descending order

  Scenario: Sorting by Price
    Given I am on the inventory page after logged as "standard_user" and "secret_sauce"
    When I click on the sort button and choose High to Low
    Then I should see the elements sorted by price in descending order

  Scenario: Sorting by Price Other User
    Given I am on the inventory page after logged as "error_user" and "secret_sauce"
    When I click on the sort button and choose High to Low
    Then I should see the elements sorted by price in descending order




