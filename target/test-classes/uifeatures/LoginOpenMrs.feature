Feature: Open Mrs login test

  @smoke @regression @positiveLogin
  Scenario: Positive test to sign in Open Mrs
    When User navigates to Open Mrs home page
    And User logs in with username and password
    Then User is logged in correctly

  @negativeScenario @regression
  Scenario Outline: Negative test to sign in Open Mrs
    Given User navigated to OpenMrs login page with the link "https://demo.openmrs.org/openmrs/login.htm"
    When User provides "<username>" and "<password>" to log in
    Then User has "<error message>" message

    Examples:
      | username | password | error message                                |
      | adminnn  | Admin123 | Invalid username/password. Please try again. |
      | admin    |          | Invalid username/password. Please try again. |
      | tech     | Admin123 | Invalid username/password. Please try again. |
