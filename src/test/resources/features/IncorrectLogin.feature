@InvalidLogin
Feature: Invalid Login

  Scenario Outline: As a user I want to see error message when I log in incorrectly
    Given I am on the Home Page
    And I see a Logo Banner
    When I click SignIn Button
    And I enter user email "<email>" details
    And I enter user password "<password>" details
    And I click the Login Button
    Then I see an error "<ErrorMessage>" message details


   Examples:

      |email                |password     |ErrorMessage                |
      |bennaroh@gmail.com   |             |Password is required        |
#      |                     |Monday1      |  An email address required |
#      |bennaroh@gmail.com   |xxxxxx       |  Authentication failed     |
#      |sarah@gmail.com      |Thursday     |  An email address required |