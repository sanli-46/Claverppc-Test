Feature: Checkout

  Background:

    Given Navigate to CleverEcommerce
    When Enter username and password positive login
    Then User should login successfully
    And Click Dresses button
    When Select three random clothes
    Then Verify a shopping card

  Scenario: OrderAndPayment

    And Cart and checkout click
    When Going the payment way
    Then Payment methods checks
    And Payment completion
