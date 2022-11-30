Feature: Navigate around the XYZ Bank website

  Scenario: Login and Deposit Amount

    Given the user is on the login page
    When the user clicks on the customer login button
    And clicks on the dropdown button and selects Harry Potter's account
    And clicks on the login button and lands on the account page
    When the user clicks on the deposit button
    And enters the amount and clicks the deposit button
    Then the deposit should be successful

