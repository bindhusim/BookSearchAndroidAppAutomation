Feature: Verify search functionality for book search

  @Mobile
  Scenario Outline: Book Search And Search Results

    Given am on  Home Page
    And I should be able to search for <searchString>
    Then I should see respective <searchResults>

    Examples:
    |searchString|searchResults|
    | Fiction    | Fiction     |

  @Mobile
  Scenario Outline: Book particulars and details

    Given am on  Home Page
    And I should be able to search for <searchString>
    Then I should see respective <searchResults>
    And I should see title,list of Pages and pubblished by details for each book

    Examples:
      |searchString|searchResults|
      | Fiction    | Fiction     |
      | Drama      | Drama       |
      | Action     | Action      |
      | Health     | Health      |
      | History    | History     |







