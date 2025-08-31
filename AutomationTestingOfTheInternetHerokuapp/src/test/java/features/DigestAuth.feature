Feature: Digest Auth is secure way to login in

  Scenario: Check if user can enter Digest Auth Page using the credentials

    Given User is on homepage and tries to enter Digest Auth Page
    When User Enters the correct username and password
    Then User enters Digest Auth Page