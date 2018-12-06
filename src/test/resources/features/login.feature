Feature: Do the login in Marhaba application

  Scenario: Login into marhaba application
    Given User is on the marhaba website
    When  User provide the "DXB" and "CALL CENTER"
    Then  User navigated to home page