Feature: Demonstrating multi glue

  Scenario: A single scenario and multiple step definitions
    Given I am on the login page
    When I submit valid credentials
    Then I am logged in successfully