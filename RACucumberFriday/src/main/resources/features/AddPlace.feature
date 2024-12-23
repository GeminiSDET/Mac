Feature: Add Place API
  As a user, I want to add a new place using the Add Place API.

  Scenario: Add a place successfully
    Given I have a valid request body
    When I send a POST request to add a place
    Then the response status code should be 200
    And the response should contain a valid place_id
