Feature: Checkout

  Scenario: Login using valid username and password
    Given User is on Login Page
    And User input username with "standard_user"
    And User input password with "secret_sauce"
    When User click login button
    Then User is on Homepage

  Scenario: Select product want to checkout
    Given User is on Homepage product
    And User click product1 add to cart
    And User click product2 add to cart
    When User click cart button
    Then User is on shopping cart page

  Scenario: Proceed Checkout
    Given User on the shopping cart page
    When User click checkout button
    Then User is on checkout information

  Scenario: Provide information checkout
    Given User on the checkout information
    And User input firstname "Carel"
    And User input lastname "Putra"
    And User input zip "123"
    When User click continue
    Then User is on checkout overview

  Scenario: Preview and finish order
    Given User on the checkout overview
    When User click finish button
    Then User is on checkout complete