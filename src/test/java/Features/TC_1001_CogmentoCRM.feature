Feature: Test Cogmento CRM Application

  Scenario: Validate login functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button

  Scenario: validate homePage functionality
    When user is on home page then validate the home page logo
    Then validate the home page title as "Cogmento CRM"
    Then validate the home page url

  Scenario: validate create contact page functionality
    When user click on contacts link and click on create button
    Then user enter firstname, lastname and select status
      | Rajani | Raut | Active |
    Then user click on save button
