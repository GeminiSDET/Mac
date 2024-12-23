Feature: Salesforce Account Management

  Scenario Outline: Automate the Process of Creating, Handling, and Deleting an Account Record and Associated Files in Salesforce
    Given User is on the Salesforce login page
    When User logs in with username "<username>" and password "<password>"
    Then User creates an account with name "<accountName>"

  Examples:
    | username                        | password  | accountName  |
    | azarriju88-vd7d@force.com       | Azar~!@#4 | TestAccount1 |
