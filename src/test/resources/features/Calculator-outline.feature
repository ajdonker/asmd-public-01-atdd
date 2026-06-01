Feature:  Adding numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to add numbers using a Calculator

  Scenario Outline: Add two numbers
    Given I have a Calculator
    When I multiply <arg0> and <arg1>
    Then the sum should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 1    | 2   |
      | 1    | -1   | 0   |
      | -5   | -6   | -11 |

Feature: Dividing numbers with a Calculator
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

Feature: Multiplying numbers with a Calculator
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
