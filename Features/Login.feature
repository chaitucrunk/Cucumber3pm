Feature: verfiy Login Page

  Scenario: Verfiy Login page with valid credentials
    Given Open Browser and enter URL
    When Enter Valid ID and Password
    And Click on Submit Button
    Then Should redirect to Managers Page
