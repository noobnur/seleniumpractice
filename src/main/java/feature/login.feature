Feature: Login
  This feature deals with the basic usage of the search bar

  Scenario: Login into google
    Given I navigate to the main search page
    And I enter the following for Search
      | website                 | email                |
      | https://www.google.com/ | nurhsans@gmail.com   |
    And I click search button
    Then I should see the search list page