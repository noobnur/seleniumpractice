Feature: Forms
  This feature deals with the basic usage forms input.

  Scenario: Fill out forms in google forms
    Given I navigate to the main form page here: "https://goo.gl/qK4fDy"
    And I enter the following
      | radio    | checkbox  | Short answer                             | Long answer                                                |
      | Option 1 | Option 3  | This is my short cucumber answer hello   | This is my long long looooonnggg cucumber answer try again |
      | Option 2 | Option 2  | This is my short cucumber answer wassup  | This is my long long looooonnggg cucumber answer           |
      | Option 3 | Option 1  | This is my short cucumber answer shortt  | This is my long long looooonnggg cucumber answer           |
      | Option 1 | Option 1  | This is my short cucumber answer mehhh   | This is my long long looooonnggg cucumber answer           |
      | Option 2 | Option 2  | This is my short cucumber answer I ate   | This is my long long looooonnggg cucumber answer           |
      | Option 3 | Option 3  | This is my short cucumber answer too muc | This is my long long looooonnggg cucumber answer           |
      | Option 1 | Option 3  | This is my short cucumber answer h today | This is my long long looooonnggg cucumber answer           |
    And I click "Submit" button
    Then I should see the submitted page