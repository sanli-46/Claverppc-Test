Feature: Testing CleverPPC's web-based e-commerce platform

  Background:
    Given Navigate to CleverEcommerce
    When Enter username and password pozitive login
    Then User should login successfully

  Scenario: Adding product to cart
    When The user is directed to the women category by clicking on the Women category
    And Clicks on the Summer dress product and is directed to the product page
    And The user hovers over a random product.
    Then It must be verified that the product has been successfully added to the cart