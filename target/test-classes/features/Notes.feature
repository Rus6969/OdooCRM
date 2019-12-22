@notes
Feature: Navigate to Notes


  Scenario: Login as a sales manager and navigate to Note module
    Given the user is on login page
    When sales manager enters login credentials
    Then the user should be logged in
    When the user clicks on Note module
    Then the user should be navigated to Note

