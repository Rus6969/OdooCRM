
Feature: User should be able to login

  Background:
    Given the user is on login page

  @login
  Scenario: Login as a sales manager
    When sales manager enters login credentials
    Then the user should be logged in


  Scenario: Login as an expense manager
    When expense manager enters login credentials
    Then the user should be logged in


  Scenario: Login as an events crm manager
    When events crm manager enters login credentials
    Then the user should be logged in
