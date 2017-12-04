@ForgotPassword
Feature: Forgot  Password

  Scenario: As a user I want to reset my Password
    Given I am on the Home Page
    And I see a Logo Banner
    When I click SignIn Button
    And  I click forgot password Link
    And I enter user email "bennaroh@gmail.com" details
    When I click retrieve password button