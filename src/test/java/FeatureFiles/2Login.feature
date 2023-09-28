Feature: Login


  Scenario Outline: Login with username and password

    Given Navigate to CleverEcommerce
    When Enter username as "<username>" and password as "<password>" for negative login
    Then  User should login failed
    And Enter username and password positive login
    And User should login successfully

    Examples:
      |  username| password |
      |TeSt.1231@gmail.com  | 45eaves12 |
      |test.enes1@gmail.com | e.b1357   |
      |test.enes12@gmail.com| e.b13577  |
      |te.enes1234@gmail.com| e.b135712 |