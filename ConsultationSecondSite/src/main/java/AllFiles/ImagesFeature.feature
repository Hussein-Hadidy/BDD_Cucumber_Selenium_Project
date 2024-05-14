Feature: Each item in the list should have a descriptive image
  Scenario: User can see a list of items with images
    Given I am on the home page logged in with credentials "standard_user" and "secret_sauce"
    When I look at the list of items
    Then I should see an image for each item in the list

  Scenario: User can see a list of items with images Errored
    Given I am on the home page logged in with credentials "visual_user" and "secret_sauce"
    When I look at the list of items
    Then I should see an image for each item in the list