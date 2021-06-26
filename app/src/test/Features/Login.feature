#      @Celis, Mario - 6/25/2021
Feature: This feature will contain scenarios to test the login screen and it's functionalities.


  @Login @S1
    Scenario Outline: These scenarios will test the login functionality. The user will enter valid credentials and will be able to advance to the next screen.
    #Start driver and open app (additional info of scenario for future documentation
    Given The user enters the app for scenario "<Scenario>"
    #Check user is on login screen
    When The user is presented to the login screen
    #User enters credentials
    Then User enter "<User>" and "<Password>" credentials
    #User sees the "Sign In" buttton as Enabled and clicks on "Sign in"
    And User sees the "Sign In" button as "Enabled"
    And User clicks on "Sign In" button
    #User advances to the next screen
    Then User is presented in the Home Screen

  Examples:
  | Scenario         | User             | Password   |
  | HappyPath        | Admin@admin.com  | Admin      |
  | GenCredentials1  | Gen              | GenAlpha   |
  | GenCredentials2  | Gen              | GenAlfaNum |
  | GenCredentials3  | Gen              | GenAny     |
    #For the examples "Gen" is a keyword that a function will generate a String;
    #"Alfa" will generate alphabetic characters
    #"AlfaNum" will generate alphanumeric characters
    #"Any" will generate any character (letters, numbers, symbols)

  @Login @S2 @Negative

    Scenario Outline: These scenarios will test negative scenarios; the user will enter INVALID credentials, this will disable the "Sign In" button
     #Start driver and open app (additional info of scenario for future documentation
    Given The user enters the app for scenario "<Scenario>"
    #Check user is on login screen
    When The user is presented to the login screen
    #User enters INVALID credentials
    Then User enter "<User>" and "<Password>" credentials
    #Sign in button is disabled
    And User sees the "Sign In" button as "Disabled"

    Examples:
  | Scenario         | User             | Password   |
  | HappyPath        | Admin@admin.com  | Admin      |
  | GenCredentials1  | Gen              | GenAlpha   |
  | GenCredentials2  | Gen              | GenAlfaNum |
  | GenCredentials3  | Gen              | GenAny     |

    #For the examples "Gen" is a keyword that a function will generate a String;
    #"IV" will generate INVALID strings per 'App Requisites',
    # in this case strings containing 5 or less characters
    #"Alfa" will generate alphabetic characters
    #"AlfaNum" will generate alphanumeric characters
    #"Any" will generate any character (letters, numbers, symbols)
