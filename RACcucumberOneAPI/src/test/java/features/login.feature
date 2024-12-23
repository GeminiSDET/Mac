Feature: Login API Test

  Scenario: Successful login with valid credentials
    Given I login with valid credentials
    Then I should receive a valid token
