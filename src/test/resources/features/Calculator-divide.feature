Feature: Dividing numbers with a Calculator

  Scenario: Divide two positive nonzero numbers
    Given I have a Calculator
    When I divide 4 and 2
    Then the quotient should be 2

  Scenario: Divide positive and negative number
    Given I have a Calculator
    When I divide 6 and -2
    Then the quotient should be -3

  Scenario Outline: Div two numbers
    Given I have a Calculator
    When I divide <arg0> and <arg1>
    Then the quotient should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 2    | 1    | 2   |
      | 3    | -1   | -3   |
      | -10   | -2   | 5 |
      | 10    | 2    | 5 |

  Scenario: Div by zero
     Given I have a Calculator
     When I divide 4 and 0
     Then an IllegalArgumentException should be thrown