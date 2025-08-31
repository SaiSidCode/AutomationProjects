Feature: This page has a dropdown box from which user can select any option

  Scenario: Check if user can select option 1 and then option 2

    Given User is in hompage and then clicks on Drop Down button
    When User click on dropdown option
    Then User is able to select option 1
    And After which User is able to select option 2