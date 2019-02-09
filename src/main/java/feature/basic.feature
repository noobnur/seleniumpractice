Feature: Search
  This feature deals with the basic usage of the search bar

  Scenario: Make a basic search on google search bar
    Given I navigate to the main search page
    And I enter the following for Search
      | website                 | search       |
      | https://www.google.com/ | helloworld   |
    And I click search button
    Then I should see the search list page