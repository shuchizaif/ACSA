Feature: feature to test HomePage functionality

  Scenario Outline: Check  user is successfully able to logout HomePage
    Given user is on login Page
    When user enters Emailid and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And clicks on login button
    Then user is navigated to the home Page and compare actual homepage title with expected title
    Then clicks on Logout button
    Then user selects Yes to exit home page

    Examples: 
      | SheetName | RowNumber |
      | Sheet1     |         0 |
      | Sheet1     |         1 |
      
      
