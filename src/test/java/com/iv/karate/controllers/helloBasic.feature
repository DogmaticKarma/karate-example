Feature: Hello World
  Background:
    Given url baseUrl
    Given path '/api/hello'

  @basic
  Scenario: Hello World
    When method GET
    Then status 200
    And match $ == 'Hello world!'

  @withParam
  Scenario: Hello with a Param
    Given param name = 'Ike'
    When method GET
    Then status 200
    And match $ == 'Hello Ike!'
