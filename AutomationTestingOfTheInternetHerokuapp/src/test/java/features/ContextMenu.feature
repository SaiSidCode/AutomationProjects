Feature: Context Menu page has box which on right clicking will trigger a java alert

  Scenario: Check if on right clicking the box. JavaScript Alert is triggered

    Given User landing in homepage and enters ContextMenu Page
    When User right clicks on the box
    Then A JavaScript alert is triggers
    And Also check if this alert can be closed

