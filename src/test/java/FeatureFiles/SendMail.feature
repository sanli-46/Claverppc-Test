Feature: Send Mail to Website Team functionality

  Background:
    Given Navigate to the cleverppc
    When Click the sign in button
    Then Enter email and password and click sign in button


  @SmokeTest @Regression
  Scenario: Successfully sending a receipt email

    When Click on the Contact Us button
    And Select Customer service from the Subject Heading dropdown
    And Enter an email address
    And Enter a Order Reference Number
    And Enter a Product
    And Click on fileUpload button
    And Enter a message
    And Click the Send button
    Then Success message should be displayed.