Feature: LoginFeature
  This feature deals with the basic usage of the

  Scenario: Make a basic search on google search bar
    Given I navigate to the main search page
    And I enter the following for Search
      | tosearch  |
      | noobnur   |
    And I click search button
    Then I should see the search list page