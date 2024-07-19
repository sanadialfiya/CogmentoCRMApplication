Feature: Test Cogmento CRM Application

  Scenario: Validate login functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button
