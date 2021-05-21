Feature: Login page feature

  Scenario: Login page title
    Given user is on landing page
    When user click login or signup link
    And user gets the url of login page
    Then page url should be "https://qasrn7-central.serino.com/"

  Scenario: Login with valid credentials
    Given user is on landing page
    When user click login or signup link
    And user input username "roycelland.tester+20@gmail.com"
    And user input password "P@ssw0rd"
    And user click Login button
    And user gets the url of login page
    Then page url should be "https://qasrn7-central.serino.com/login"