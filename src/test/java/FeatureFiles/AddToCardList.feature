Feature: Add To Card List
  Background:
    Given Navigate to CleverEcommerce
    When Enter username and password pozitive login
    Then User should login successfully

  Scenario: Add to clothes in shopping card
    Given Click Dresses button
    When Select three random clothes
    Then Verify a shopping card


