Feature: The page has dynamic controls/buttons that appear after few seconds of loading time

  Background:
    Given User is in homepage and goes to Dynamic Control Page

  Scenario: Check if checkbox disappears on tapping the Remove button

    When User taps on Remove button
    Then A check box is removed
    And Remove button changes to Add button


  Scenario: Check if checkbox appears on tapping Add button

    When User taps on Remove button to change it to Add
    And User taps on Add button
    Then A check box is added
    And Add button changes to remove button


  Scenario: Check if Text box becomes enabled when user taps on enable button

    When User taps on Enable button
    Then Text box is enabled
    And Enable button changes to Disable button

  Scenario: Check if Text box becomes disabled when user taps on disabled button

    When User taps on Enable button to change to Disable
    And User taps on Disable button
    Then Text box is Disabled
    And Disable button changes to Enable button