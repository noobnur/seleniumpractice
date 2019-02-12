Feature: Forms
  This feature deals with the basic usage forms input.

  Scenario: Fill out forms in google forms
    Given I navigate to the main form page here: "https://goo.gl/qK4fDy"
    And I enter the following
      | radio    | checkbox         | short ans | long ans |
      | Option 1 |   |
    And I click search button
    Then I should see the search list page