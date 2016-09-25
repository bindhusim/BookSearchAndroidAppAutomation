Feature: Verify search functionality for book search
  @Mobile
  Scenario Outline: Book Search And Search Results

    Given am on  Home Page
    And I should be able to search for <searchString>
    Then I should see respective search results for <searchResults>

    Examples:
    |searchString|searchResults|
    | Fiction    | Fiction     |
    | Drama      | Drama       |
    | Action     | Action      |
    | Comic      | Comic       |
  @Mobile
  Scenario Outline: Book particulars and details

    Given am on  Home Page
    And I should be able to search for <searchString>
    Then I should see respective search results for <searchResults>
    And I should see title,author and publisher
    Examples:
      |searchString|searchResults|
      | Fiction    | Fiction     |
      | Drama      | Drama       |
      | Action     | Action      |
      | Comic      | Comic       |

  @Mobile
  Scenario Outline: Book Share

    Given am on  Home Page
    And I should be able to search for <searchString>
    Then I should see respective search results for <searchResults>
    And I navigate to book particulars page
    Then I verify book can be shared

    Examples:
      |searchString|searchResults|
      | Fiction    | Fiction     |








