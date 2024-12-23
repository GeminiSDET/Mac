Feature: Add a place to the maps API

Scenario: Add place and verify
  Given I create a new place with name "Test Place" and 
            address "123 Street" and language "English"
  When I send the Add Place API request
  Then the response should return status code 200
  And the response should contain "status" as "OK"