Feature: Dividing numbers with a Calculator

  Scenario: Divide two positive nonzero numbers
    Given I have a Calculator
    When I divide 4 and 2
    Then the quotient should be 2

  Scenario: Divide positive and negative number
    Given I have a Calculator
    When I divide 6 and -2
    Then the quotient should be -3