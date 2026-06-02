Feature: Multiply numbers with a Calculator
Gives ability to multiply numbers.

  Scenario: Mult two pos numbers
    Given I have a Calculator
    When I multiply 1 and 2
    Then the product should be 2

  Scenario: Mult 1 pos and 1 neg number
    Given I have a Calculator
    When I multiply -1 and 2
    Then the product should be -2

  Scenario: Multiply with 1 and get the same number 1 * x = x
    Given I have a Calculator
    When I multiply 1 and 3
    Then the product should be 3

  Scenario Outline: Mult two numbers
    Given I have a Calculator
    When I multiply <arg0> and <arg1>
    Then the product should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 2    | 2   |
      | 1    | -1   | -1   |
      | -5   | -6   | 30 |
      | 5    | 6    | 30 |