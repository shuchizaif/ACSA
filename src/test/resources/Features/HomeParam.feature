Feature: feature to test HomePage functionality

  Scenario Outline: Check  user is successfully able to logout HomePage
    Given user is on login Page
    When user enters <Emailid> and <Password>
    And clicks on login button
    Then user is navigated to the home Page and compare actual homepage title with expected title
    Then clicks on Logout button
    Then user selects Yes to exit home page

    Examples: 
      | Emailid                         |  | Password      |
      | vineet.arora@mail.vinove.com    |  | Vineet@123    |
      | saurabh.sharma2@mail.vinove.com |  | S@ur@bh@12345 |
