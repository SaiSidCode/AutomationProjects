Feature: Test if user is able to login inside this base authentication page

  Scenario: Check if user can add username and password to login in to the basic auth page

    Given User is in home page and tries to redirect to Basic Auth Page
    Then User is able login to basic Auth page
    And User is has entered the Auth Page and is able to see the page's contents