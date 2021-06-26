#      @Celis, Mario - 6/25/2021
Feature: This feature will contain scenarios to test the Home screen and it's functionalities.


  @Login @S1
  Scenario Outline: These scenarios will test the login functionality. The user will enter valid credentials and will be able to advance to the next screen.
    #See "Login feature" to comments on snippets
    Given The user enters the app for scenario "<Scenario>"
    When The user is presented to the login screen
    Then User enter "<User>" and "<Password>" credentials
    And User sees the "Sign In" button as "Enabled"
    And User clicks on "Sign In" button
    Then User is presented in the Home Screen

    #Check if username is present in the Home Screen
    And Check if Email is present

    Examples:
      | Scenario         | User             | Password   |
      | HappyPath        | Admin@admin.com  | Admin      |
      | GenCredentials1  | Gen              | GenAlpha   |
      | GenCredentials2  | Gen              | GenAlfaNum |
      | GenCredentials3  | Gen              | GenAny     |

    #For the examples "Gen" is a keyword that a function will generate a String;
    #"Alpha" will generate alphabetic characters
    #"AlfaNum" will generate alphanumeric characters
    #"Any" will generate any character (letters, numbers, symbols)
