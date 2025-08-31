Feature: This page allows user to upload any file and gives confirmation if a file is uploaded successfully

  Scenario: Check if file can be uploaded

    Given User is on homepage and clicks on File Upload Page
    When User uploads the file
    Then User gets a message that file has be uploaded succesfully