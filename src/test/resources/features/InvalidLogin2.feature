@ignore
Feature: Login

  Scenario:  User with wrong password should not be able to login
    Given I get to the homepage
    When I type in correct username
    And I type in incorrect password
    When I tap the login
    Then My login attempt should fail