Feature: The page contains items that disappears when user reload the page

  Scenario: Check if items disappear and reappear when user reloads the game

    Given User is on homepage and clicks on Disappearing Items button
    When User reloads the page 20 times
    Then Check if buttons disappear and appear
    And Check which buttons disappear and appear