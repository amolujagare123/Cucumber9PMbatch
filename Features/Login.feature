Feature: Login page functionalities


  @validInputTest
  Scenario: to test the functionality of login page for valid username & password
   Given we are on the login page
   When we enter correct username & password
   And  click on login button
   Then we should land up to the home page

  @invalidInputTest
  Scenario: to test the functionality of login page for invalid username & password
    Given we are on the login page
    When we enter incorrect username & password
    And  click on login button
    Then There should be error message


  Scenario: to test the functionality new page
    Given we are on the new page
    And  click on first button
    Then There should be next page
