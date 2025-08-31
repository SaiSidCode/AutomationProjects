Feature: The page allows user to drag and drop items from A to B

  Scenario: Check if A box can be dragged to B box position and vice versa

    Given User is in homepage and clicks on Drag and Drop button
    When User drags A to B
    Then A should be replaced with B
    When Places B back to A
    Then B should be replaced with A