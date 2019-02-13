$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/feature/fillOutForms.feature");
formatter.feature({
  "line": 1,
  "name": "Forms",
  "description": "This feature deals with the basic usage forms input.",
  "id": "forms",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3544322512,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Fill out forms in google forms",
  "description": "",
  "id": "forms;fill-out-forms-in-google-forms",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the main form page here: \"https://goo.gl/qK4fDy\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the following",
  "rows": [
    {
      "cells": [
        "radio",
        "checkbox",
        "Short answer",
        "Long answer",
        "Dropdown"
      ],
      "line": 7
    },
    {
      "cells": [
        "Option 1",
        "Option 3",
        "This is my short cucumber answer hello",
        "This is my long long looooonnggg cucumber answer try again",
        "Dropdown 1"
      ],
      "line": 8
    },
    {
      "cells": [
        "Option 2",
        "Option 2",
        "This is my short cucumber answer wassup",
        "This is my long long looooonnggg cucumber answer",
        "Dropdown 2"
      ],
      "line": 9
    },
    {
      "cells": [
        "Option 3",
        "Option 1",
        "This is my short cucumber answer shortt",
        "This is my long long looooonnggg cucumber answer",
        "Dropdown 3"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see the submitted page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://goo.gl/qK4fDy",
      "offset": 40
    }
  ],
  "location": "formStep.navigateToFormPage(String)"
});
formatter.result({
  "duration": 2743392627,
  "status": "passed"
});
formatter.match({
  "location": "formStep.fillOutForm(DataTable)"
});
formatter.result({
  "duration": 7820637209,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 9
    }
  ],
  "location": "formStep.submitForm(String)"
});
formatter.result({
  "duration": 656450521,
  "status": "passed"
});
formatter.match({
  "location": "formStep.getResponsePage()"
});
formatter.result({
  "duration": 34219684,
  "status": "passed"
});
formatter.after({
  "duration": 245396,
  "status": "passed"
});
});