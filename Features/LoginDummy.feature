# new feature
# Tags: optional

Feature: A Login dummy examples

  Background: initial steps
    Given I open browser
    And I Maximize it

  @dummyLogin
  Scenario: to test the functionality of login page for valid username & password

    When we enter "admin" & "admin"
    And  click on login button
    Then we should land up to the home page

  @dummyLogin
  Scenario: to test the functionality of login page for invalid username & password
    Given we are on the login page
    When we enter "admin1" & "admin1"
    And  click on login button
    Then There should be error message

  @dummyLogin
  Scenario: to test the functionality of login page for blank username & password
    Given we are on the login page
    When we enter " " & " "
    And  click on login button
    Then we should be on same page

@userDetailsparameterization
Scenario: to verify the record  to be inserted in user details page

  Given user details page should be opened
  When  I enter user details as below
  | amol | 9800000 | amol@gmail.com | pune |
  And click on submit button
  Then  record should be added successfully


  @ParameterizarionWithExampleKeyword

  Scenario Outline: test the login page with 10 inputs
    Given we are on the login page
    When we will enter <username> & <password>
    And  click on login button
    Then we should land up to the home page

  Examples:
    | username | password |
    | user-1   | Pass-1   |
    | user-2   | Pass-2   |
    | user-3   | Pass-3   |
    | user-4   | Pass-4   |
    | user-5   | Pass-5   |
