Feature: Add and Delete Button

  Scenario: Check if Add Button and delete buttons are functioning

    Given User is redirected to Add Remove Button Page
    Then Check if Add buttons adds more buttons
    And Check if all the buttons added can be deleted
