@Login
Feature: Login

  Scenario Outline: As a user I want to Login Successfully
    Given I am on the Home Page
    And I see a Logo Banner
    When I click SignIn Button
    And I enter user email "<email>" details
    And I enter user password "<password>" details
    And I click the Login Button
    Then I should be logged in successfully
    And I sign out

    Examples:
      |email                   |password     |
      |bennaroh@gmail.com      |benedith12   |






