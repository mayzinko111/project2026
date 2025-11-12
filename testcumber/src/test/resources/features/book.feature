Feature: Book management
  Scenario: Add a new book and verify it's in the list
    Given the library is empty
    When I add a book titled "Clean Code" by "Robert Martin"
    Then the library should contain 1 book
    And the book list should include "Clean Code"
