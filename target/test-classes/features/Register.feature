@ignore
Feature: Register

  Scenario: As a user I want to Register Successfully
    Given I am on the Home Page
    And I see a Logo Banner
    When I click SignIn Button
    And I type email address to create new user
    And I click create an account
    Then I see Your Personal Information
    Then I select Mr
    Then I enter first name in the first name input field
    Then I enter last name in the last name input field
    Then I see my email address
    Then I type password in the password input field
    Then I enter date of birth
    Then I select option to sign up for our newsletter
    Then I select option to receive special offers from our partners
    Then I see Your Address
    Then I type first name in the first name input field
    Then I type last name in the last name input field
    Then I enter company name in the company input field
    Then I enter company address in the address input field
    Then I enter the city
    Then I enter the state
    Then I enter the postal code in the postal code field
    Then I select the country
    Then I enter additional information
    Then I enter mobile phone
    Then I enter my address in the assign an address alaias for future reference
    Then I click the Register Button
    Then I should be register successfully
    And I click on sign out to return to sign in page