$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("basic.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the basic usage of the",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4593754039,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Make a basic search on google search bar",
  "description": "",
  "id": "loginfeature;make-a-basic-search-on-google-search-bar",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the main search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the following for Search",
  "rows": [
    {
      "cells": [
        "search"
      ],
      "line": 7
    },
    {
      "cells": [
        "noobnur"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the search list page",
  "keyword": "Then "
});
formatter.match({
  "location": "basicStep.navToPage()"
});
formatter.result({
  "duration": 1353010781,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.addToSeachInput(DataTable)"
});
formatter.result({
  "duration": 189524408,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.clickSearchButton()"
});
formatter.result({
  "duration": 1951874922,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.getListOfResults()"
});
formatter.result({
  "duration": 11410826,
  "status": "passed"
});
formatter.after({
  "duration": 230004,
  "status": "passed"
});
});