Feature: Test Log in Functionalities
  @Regression

  Scenario: As a user I should be able to sign up successfully

    Given user is on homepage
    When when user fills up sign ups form
    And user clicks on sign up button
    Then user should be registered successfully

