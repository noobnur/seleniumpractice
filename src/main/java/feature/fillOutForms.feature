Feature: Forms
  This feature deals with the basic usage forms input.

  Scenario: Fill out forms in google forms
    Given I navigate to the main form page here: "https://goo.gl/qK4fDy"
    And I enter the following
      | radio    | checkbox  | Short answer                     | Long answer                                      |
      | Option 1 | Option 3  | This is my short cucumber answer | This is my long long looooonnggg cucumber answer |
    And I click "Submit" button
    Then I should see the submitted page