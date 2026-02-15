Feature: Feature to test Registration

  @register
  Scenario: Valid Registration
    Given user is on OpenCart homepage
    When user clicks on MyAccount and clicks on Register
    Then user should navigated to Registration page
    When user enters personal details, password and clicks on continue
    Then user should get success message
