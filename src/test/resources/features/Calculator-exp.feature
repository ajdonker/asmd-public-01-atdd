Feature: Exponentiation with a Calculator
  Scenario Outline: Raise positive number to another positive number
    Given I have a Calculator
    When I exp <arg0> and <arg1>
    Then I get <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 3   | 1   |
      | 1    | 0   | 1   |
      | 3   | 2   | 9 |
      | 4   | 3   | 64 |
  Scenario: Raise positive number to a negative number
    Given I have a Calculator
    When I exp 3 and -1
    Then an IllegalArgumentException should be thrown
