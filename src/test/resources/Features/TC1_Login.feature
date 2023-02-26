@Login
Feature: Verify Instagram Login Page

  Scenario Outline: Verify Instagram Login Page Using Valid Credentials
    Given User is in the Instagram Login Page
    When User Giving Valid Crdentials using "<username>" and "<password>"
    Then User Should Navigate to Home Page and Verify the Message "johntyrhotes"

    Examples: 
      | username               | password  |
      | johntyrhotes@gmail.com | Rhotes@31 |
