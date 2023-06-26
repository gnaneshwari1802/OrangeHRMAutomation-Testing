Feature: Admin User

  # In Gherkins there is no word for Preconditions. It is called Background. SO basically the Background is the Precondition.
  Background:

    Given I am logged in


  Scenario: Verify that the admin users search panel filters users correctly

    When I click the admin menu
    Then I should see the users page
    When I enter user data
    And click on the search button
    Then Search results should return the correct user



