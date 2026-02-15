Feature: feature to test login

  @login
  Scenario Outline: valid login
    Given user is on OpenCart homepage
    When user clicks on MyAccount and clicks on login
    Then user should be navigated to loginpage
    Then user enters <username> and <password> and clicks on login
    Then user navigates to homepage

    Examples: 
      | username      |  | password |
      | abd@gmail.com |  | test12   |

  