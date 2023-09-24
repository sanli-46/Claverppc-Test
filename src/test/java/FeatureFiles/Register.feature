
Feature: DataTable Register Functionality

  @SmokeTest @Regression
  Scenario: Create New Account
    Given Navigate to the cleverppc
    When Click the sign in button
    Then Enter email address and click create account button

    And User sending the keys in Elements

      | Field       | Value                       |
      | FirstName   | Team                        |
      | LastName    | Technostudy                 |
      | Email       | wokisa921240@alvisani.com   |
      | Password    | Teammmm                     |

    And Click on the element in Elements
      | RegisterBtn |

    Then Success message should be displayed