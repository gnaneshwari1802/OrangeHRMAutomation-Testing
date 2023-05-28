Feature: Admin User

  Scenario: Verify that the admin users search panel filters users correctly

    Given I am logged in
    When I click the admin menu
    Then I should see the users page
    When I enter user data
    And click on the search button
    Then Search results should return the correct user



