Feature: Sorting

  Scenario: Login using valid username and password
    Given User is on Login Page
    And User input username with "standard_user"
    And User input password with "secret_sauce"
    When User click login button
    Then User is on Homepage

  Scenario: Sort products by price low to high
    Given User is on Homepage product
    And User click sorting button
    When User select price low to high
    Then Products sort by price to high
