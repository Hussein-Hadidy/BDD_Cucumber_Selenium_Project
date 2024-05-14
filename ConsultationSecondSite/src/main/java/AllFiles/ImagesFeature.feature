Feature: Each item in the list should have a descriptive image
  Scenario: User can see a list of items with images
  As a user, I want to see a list of items with images so that I can see what each item looks like before I decide to purchase it.
  Definition of Done: The user can see an image for each item in the list.
    Given I am on the home page logged in with credentials "standard_user" and "secret_sauce"
    When I look at the list of items
    Then I should see an image for each item in the list

  Scenario: User can see a list of items with images Errored
  As a user, I want to see a list of items with images so that I can see what each item looks like before I decide to purchase it.
  Definition of Done: The user can see an image for each item in the list.
    Given I am on the home page logged in with credentials "visual_user" and "secret_sauce"
    When I look at the list of items
    Then I should see an image for each item in the list