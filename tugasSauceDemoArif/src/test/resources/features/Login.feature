@Login
Feature: Login
  As a user i want to login to website sauce demo

  Scenario: Normal Login
    Given User open the website sauce demo
    When user input "standard_user" as userName and input "secret_sauce" as password

  Scenario Outline: Invalid Login
    Given User open the website sauce demo
    When user input "<userName>" as userName and input "<password>" as password
    Then User see error "<errorMessage>" on login page
    Examples:
      | userName | password | errorMessage                                                              |
      | ucok     | gatau    | Epic sadface: Username and password do not match any user in this service |
      | ucok     |          | Epic sadface: Password is required                                        |
      |          | gatau    | Epic sadface: Username is required                                        |