$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Verify search functionality for book search",
  "description": "",
  "id": "verify-search-functionality-for-book-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Book Search And Search Results",
  "description": "",
  "id": "verify-search-functionality-for-book-search;book-search-and-search-results",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Mobile"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "am on  Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should be able to search for \u003csearchString\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see respective \u003csearchResults\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "verify-search-functionality-for-book-search;book-search-and-search-results;",
  "rows": [
    {
      "cells": [
        "searchString",
        "searchResults"
      ],
      "line": 11,
      "id": "verify-search-functionality-for-book-search;book-search-and-search-results;;1"
    },
    {
      "cells": [
        "Fiction",
        "Fiction"
      ],
      "line": 12,
      "id": "verify-search-functionality-for-book-search;book-search-and-search-results;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Book Search And Search Results",
  "description": "",
  "id": "verify-search-functionality-for-book-search;book-search-and-search-results;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Mobile"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "am on  Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should be able to search for Fiction",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see respective Fiction",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.am_on_Home_Page()"
});
