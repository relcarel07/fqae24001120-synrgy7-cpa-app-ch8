Feature: Login

  @positive
  Scenario: Login using valid username and password
    Given User is on Login Page
    And User input username with "standard_user"
    And User input password with "secret_sauce"
    When User click login button
    Then User is on Homepage

  @negative
  Scenario: Login using valid username and invalid password
    Given User is on Login Page
    And User input username with "standard_user"
    And User input password with "tes123"
    When User click login button
    Then User should see an error message