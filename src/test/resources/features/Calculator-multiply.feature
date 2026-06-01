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
