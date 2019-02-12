$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/feature/fillOutForms.feature");
formatter.feature({
  "line": 1,
  "name": "Forms",
  "description": "This feature deals with the basic usage forms input.",
  "id": "forms",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5957178575,
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
        "Long answer"
      ],
      "line": 7
    },
    {
      "cells": [
        "Option 1",
        "Option 3",
        "This is my short cucumber answer",
        "This is my long long looooonnggg cucumber answer"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
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
  "duration": 3594919246,
  "status": "passed"
});
formatter.match({
  "location": "formStep.fillOutForm(DataTable)"
});
formatter.result({
  "duration": 1144373153,
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
  "duration": 789921288,
  "status": "passed"
});
formatter.match({
  "location": "formStep.getResponsePage()"
});
formatter.result({
  "duration": 56157929,
  "status": "passed"
});
formatter.after({
  "duration": 181047759,
  "status": "passed"
});
});