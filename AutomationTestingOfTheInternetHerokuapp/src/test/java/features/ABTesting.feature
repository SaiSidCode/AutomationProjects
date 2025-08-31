Feature: AB Testing page has two variations of the same page

  Scenario: Check if the user gets the control or variations version of the page

    Given User is in the Homepage
    And User clicks on the AB Testing option in the list
    Then Check if user is redirect to AB testing page
    And Check if the user is falling under control or variation cohort
