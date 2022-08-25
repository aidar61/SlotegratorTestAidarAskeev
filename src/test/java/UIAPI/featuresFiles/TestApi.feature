@TestAPI
Feature: Test

  Scenario: Get BearerToken
    Given perform POST method to get bearerToken
    Then bearerToken and status code 200 is returned

  Scenario: Create new Player
    Given perform POST method to create new player with mock Data
    Then status code 201 is returned

  Scenario: Resource Owner Password Credentials Grant
    Given perform POST method to authorization under created player with savedMockData
    Then players refresh and access tokens with status code 200 is returned

  Scenario: Get new Player Credential Grants
    Given perform GET method with the taken player's bearer token and get credentials
    Then new player credentials and status code 200 is returned

  Scenario: Get other player credentials
    Given perform GET method with player's token and get other player credentials
    Then status code 404 is returned with following body
    |{"name": "Not Found","message": "Object not found: 12402","code": 0,"status": 404}|