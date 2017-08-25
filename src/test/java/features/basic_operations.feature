Feature: BasicArithmeticOperationsFeature
  This feature deals with the 4 basic arithmetic operations

  Background: Open calculator
    Given The calculator app is running

  Scenario: Summing two numbers
    When I sum 7 and 4
    Then The sum result should be 11

  Scenario: Subtracting two numbers
    When I subtract 2 and 5
    Then The subtraction result should be -3

  Scenario: Multiplicating two numbers
    When I multiply 0 and 8
    Then The multiplication result should be 0

  Scenario: Dividing two numbers
    When I divide 6 by 0
    Then The division result should be an error