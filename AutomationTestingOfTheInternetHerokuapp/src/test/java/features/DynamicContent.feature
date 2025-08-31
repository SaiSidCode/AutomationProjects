Feature: Dynamic Content page has images and text that changes on every reload
  
  Scenario: Verify that Content updates on every refresh

    Given User is in homepage and redirects to Dynamic Content Page
    When User reloads the dynamic content page
    Then Text and images should change
