Feature: Admin User

  # In Gherkins there is no word for Preconditions. It is called Background. SO basically the Background is the Precondition.
  Background: Precondition for admin to search for a user
    #From the CommonSteps1.feature file
    Given I am on the application home page
    And I login


  Scenario: Verify that the admin users search panel filters users correctly
    #Commented out because this is a precondition
    #Given I am logged in
    When I click the admin menu
    Then I should see the users page
    When I enter user data
    And click on the search button
    Then Search results should return the correct user



