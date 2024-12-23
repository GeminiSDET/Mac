Feature: Salesforce Automation

  Scenario Outline: Automate the Process of Creating, Handling, and Deleting an Account Record and Associated Files in Salesforce
    Given I am on the Salesforce login page
    When I login using "<username>" and "<password>"
    Then I create an account record named "<accountName>"
    And I open the created account record page
    Then I attach two files to the account record
    And I validate the file attachments
    Then I delete one of the files
    And I update the account record with "<updatedAccountName>"
    Then I delete the account record

  Examples:
    | username                          | password    | accountName     | updatedAccountName |
    | azarriju88-vd7d@force.com         | Azar~!@#4   | TestAccount     | UpdatedTestAccount |
