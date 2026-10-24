
# Quiz 2 - Test Driven Development

## Project Overview
This project implements Calculator and DateChecker using Java,
JUnit 5, Maven, and Test-Driven Development (TDD).

## Task 1: Calculator
Implements five operations:
- Addition
- Subtraction
- Multiplication
- Integer division with divide-by-zero handling
- Even/odd number checking

## Task 2: DateChecker
Determines whether a month has 31 days using a Month enum.

- Returns true for seven 31-day months.
- Returns false for February and four 30-day months.
- Throws IllegalArgumentException for null input.

## Technologies
- Java
- JUnit 5
- Apache Maven
- Git and GitHub

## Running Tests
Run the following command from the project directory:

```bash
mvn clean test
```

## Test Results
- Calculator: 6 passing tests
- DateChecker: 15 passing tests
- Total: 21 passing tests

## TDD Reflection
I practiced the Red-Green-Refactor process by writing tests,
observing failures, implementing functionality, and rerunning
the test suite. The DateChecker development included several
test-first cycles. Calculator addition and subtraction also
began with failing tests. Some remaining Calculator methods
were implemented before their tests, reinforcing the importance
of maintaining a consistent test-first workflow.
