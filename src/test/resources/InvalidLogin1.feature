Feature: Login

  Scenario: Login with invalid credentials should not be successful

    Given I am get on the homepage
    When I enter invalid username
    And I enter Valid Password
    When I press the login button
    Then my login should not be successful
