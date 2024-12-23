Feature: Automate Salesforce Account and File Management

  Background:
    Given I launch the Salesforce login page
    When I enter username as "ajniran1106-b1wq@force.com" and password as "SDET@2024"
    Then I should be logged into the Salesforce home page

  Scenario: Creating, Handling, and Deleting an Account Record and Associated Files
    When I create a new account with name "Test Account" and industry "Technology"
    Then I should see the account created successfully
    And I attach two files to the account
    Then I validate the uploaded files
    And I delete one of the files
    When I update the account's industry to "Finance"
    Then the account details should be updated successfully
    When I delete the account
    Then the account should no longer exist in the account list
