Feature: Home page  /* Requirements*/

  Scenario: Verify that application logo is displayed on the home page. /* test case*/
    Given I am on the Home page
    Then I should see the application logo
    And I assert that ActualLogoText is present