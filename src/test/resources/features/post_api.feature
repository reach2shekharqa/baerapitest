Feature: Post API call

@post
  Scenario: Make a Post call
    Given I make a POST call to "/api/users" with body
      | filepath    |
      | requestBody |
    Then the response status code should be "201"




