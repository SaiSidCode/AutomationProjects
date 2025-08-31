Feature: Several images are provided in which some of them are broken

  Scenario: Check if image is broken or loading correctly

    Given User is in homepage and redirects themself to Broken Images link
    Then Check if image link returns status code 200
    And Check if image's width is more than 0