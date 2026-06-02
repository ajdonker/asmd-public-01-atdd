Feature: Memory matching game
  Scenario: Selecting one cell shows it temporarily
    Given a board with values
    | x | y | value |
    | 0 | 0 | 3 |
    | 1 | 0 | 5 |
    | 0 | 1 | 2 |
    | 1 | 1 | 4 |
    When I hit position 0 0
    Then position 0 0 should be temporarily 3
    And position 0 0 should not be found


  Scenario: Selecting two equal cells makes them found
    Given a board with values
      | x | y | value |
      | 0 | 0 | 3     |
      | 1 | 0 | 3     |
      | 0 | 1 | 2     |
      | 1 | 1 | 4     |
    When I hit position 0 0
    And I hit position 1 0
    Then position 0 0 should be found with value 3
    And position 1 0 should be found with value 3

  Scenario: Selecting two different cells does not make them found
    Given a board with values
      | x | y | value |
      | 0 | 0 | 3     |
      | 1 | 0 | 5     |
      | 0 | 1 | 2     |
      | 1 | 1 | 4     |
    When I hit position 0 0
    And I hit position 1 0
    Then position 0 0 should not be found
    And position 1 0 should not be found

  Scenario: After two selected cells, a new hit clears the previous selection
    Given a board with values
      | x | y | value |
      | 0 | 0 | 3     |
      | 1 | 0 | 5     |
      | 0 | 1 | 2     |
      | 1 | 1 | 4     |
    When I hit position 0 0
    And I hit position 1 0
    And I hit position 0 1
    Then position 0 0 should be hidden
    And position 1 0 should be hidden
    And position 0 1 should be temporarily 2

  Scenario: Game is over when no matching pair remains hidden
    Given a board with values
      | x | y | value |
      | 0 | 0 | 3     |
      | 1 | 0 | 3     |
      | 0 | 1 | 2     |
      | 1 | 1 | 4     |
    When I hit position 0 0
    And I hit position 1 0
    Then the game should be over