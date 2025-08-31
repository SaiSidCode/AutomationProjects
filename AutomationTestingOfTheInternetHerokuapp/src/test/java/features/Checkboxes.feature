Feature: The webpage has two check boxes that can be toggled on and off

  Scenario: Check if both the check boxes are selected if not then select them

    Given User is on Homepage and goes to Checkboxes page
    When User sees if there are 2 check boxes
    Then User selects both checkboxes