@facebook
Feature: login

  @login
  Scenario: open login page
    Given user open application
    When user login
    Then user verify title and url
