Feature: feature to test login functionality

  Scenario Outline: Check  login is successful with Credentials
    Given user is on login Page
    When user enters Emailid and Password
    And clicks on login button

   Examples: 
      | Emailid                         |  | Password      |
      | vineet.arora@mail.vinove.com    |  | Vineet@123    |
      | saurabh.sharma2@mail.vinove.com |  | S@ur@bh@12345 |
