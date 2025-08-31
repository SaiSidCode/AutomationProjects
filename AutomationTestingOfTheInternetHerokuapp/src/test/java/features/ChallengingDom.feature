Feature: Testing the challenging DOM

  Scenario: Check if a particular button can be tapped even if the locater are hard to find

    Given User is on Homepage and goes to Challenging DOM page
    Then User tries to tap on blue button 5 times
    And User tries to tap on red button 5 times
    And User tries to tap on green button 5 times