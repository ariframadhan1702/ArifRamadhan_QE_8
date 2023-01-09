@CheckOut
Feature: Feature checkout
  description feature

  Scenario: User purchase the item until the order successful
    Given User open the website sauce demo
    When user input "standard_user" as userName and input "secret_sauce" as password
    And User sort product list from z to a
    And User pick item Sauce Labs Onice
    And User pick item Test.allTheThingsT-Shirt
    And User click shopping cart
    Then verify item 1 display on Landing Page
    Then verify item 2 display on Landing Page
    And User Click Remove Button for 1 Item Test.allTheThingsT-ShirtRed
    Then User Click Button CheckOut
    When User input "Arif" as fisrtName and input "Ramadhan" as lastName and input "13880" as postal code
    Then verify item Total
    Then verify tax of payment
    Then verify total of payment
    And User Click Button Finish
    Then user will direct to page CheckOut Complete
    Then Pop up Message THANK YOU FOR YOUR ORDER
