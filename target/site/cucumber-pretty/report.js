$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/feature/toolsQa.feature");
formatter.feature({
  "line": 1,
  "name": "ToolsQa",
  "description": "This feature deals with the basic usage forms input.",
  "id": "toolsqa",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9907543031,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Fill out forms in google forms",
  "description": "",
  "id": "toolsqa;fill-out-forms-in-google-forms",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the main form page here: \"https://www.toolsqa.com/automation-practice-form/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "open the link \"Partial Link Test\" in a new tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the following for toolsqa",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "sex",
        "experience",
        "date",
        "profession",
        "img",
        "download",
        "continent",
        "commands"
      ],
      "line": 8
    },
    {
      "cells": [
        "firstname",
        "lastname",
        "Female",
        "2",
        "130219",
        "Automation Tester",
        "mtc_2017.jpg",
        "Test File to Download",
        "South America",
        "Wait Commands"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click \"submit\" button toolsqa",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.toolsqa.com/automation-practice-form/",
      "offset": 40
    }
  ],
  "location": "formStep.navigateToFormPage(String)"
});
formatter.result({
  "duration": 3102528655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Partial Link Test",
      "offset": 15
    }
  ],
  "location": "toolsQaStep.openLinkInNewTab(String)"
});
formatter.result({
  "duration": 10709976884,
  "status": "passed"
});
formatter.match({
  "location": "toolsQaStep.fillOutToolsQaForm(DataTable)"
});
formatter.result({
  "duration": 17476566534,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "submit",
      "offset": 9
    }
  ],
  "location": "toolsQaStep.submitToolsQaForm(String)"
});
formatter.result({
  "duration": 3997149041,
  "status": "passed"
});
formatter.after({
  "duration": 180092316,
  "status": "passed"
});
});