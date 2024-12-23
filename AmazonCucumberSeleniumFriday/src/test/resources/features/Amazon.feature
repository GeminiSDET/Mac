Feature: Amazon Workflow

  Scenario Outline: Login and navigate workflow
    Given User launches the Amazon login page
    When User logs in with "<username>" and "<password>"
    Then User validates the login
    When User searches for "Bag"
    Then User selects a bag named "Skybags"
    When User adds the bag to the cart
    Then User navigates to the cart
    And User validates the cart contents
    When User scrolls to the bottom
    And User scrolls to the top
    Then User takes a screenshot
    When User clicks on Proceed to Buy
    And User selects the 2nd address
    Then User validates the address selection

  Examples:
    | username  | password      |
    | azarriju  | Azar~!@#4     |
