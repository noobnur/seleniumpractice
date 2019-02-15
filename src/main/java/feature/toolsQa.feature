Feature: ToolsQa
  This feature deals with the basic usage forms input.

  Scenario: Fill out forms in google forms
    Given I navigate to the main form page here: "https://www.toolsqa.com/automation-practice-form/"
    And open the link "Partial Link Test" in a new tab
    And I enter the following for toolsqa
      | firstname    | lastname  | sex    | experience | date   | profession        | img          | download              | continent     | commands      |
      | firstname    | lastname  | Female | 2          | 130219 | Automation Tester | mtc_2017.jpg | Test File to Download | South America | Wait Commands |
    And I click "submit" button toolsqa