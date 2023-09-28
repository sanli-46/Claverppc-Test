
Feature: DataTable Register Functionality


  Scenario: Create New Account
    Given Navigate to CleverEcommerce
    When Click the sign in button
    Then Enter email address and click create account button

    And User sending the keys in Elements

      | Field       | Value                       |
      | FirstName   | Team                        |
      | LastName    | Technostudy                 |
      | Email       | test.eaves13@gmail.com      |
      | Password    | Teammmm                     |

    And Click on the element in Elements
      | RegisterBtn |

    Then Success message should be displayed