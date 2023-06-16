Feature: Admin User

  # In Gherkins there is no word for Preconditions. It is called Background. SO basically the Background is the Precondition.
  Background:

    Given I am on the landing page
    When I enter username in the username field
    And I enter password in the password field
    When I click the login button



  Scenario: Verify that the admin users search panel filters users correctly
    #Commented out because this is a precondition
    #Given I am logged in
    When I click the admin menu
    Then I should see the users page
    When I enter user data
    And click on the search button
    Then Search results should return the correct user



