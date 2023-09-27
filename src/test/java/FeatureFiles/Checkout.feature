Feature: Checkout

  Background:

    Given Navigate to CleverEcommerce
    When Enter username and password pozitive login
    Then User should login successfully
    And Click Dresses button
    When Select three random clothes
    Then Verify a shopping card

  Scenario: OrderAndPayment

    And Cart and chackout click
    When Going the payment way
    Then Payment methods checks
    And Payment completion
