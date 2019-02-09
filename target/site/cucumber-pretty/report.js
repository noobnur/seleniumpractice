$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/feature/basic.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "This feature deals with the basic usage of the search bar",
  "id": "search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3988364314,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Make a basic search on google search bar",
  "description": "",
  "id": "search;make-a-basic-search-on-google-search-bar",
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
        "website",
        "search"
      ],
      "line": 7
    },
    {
      "cells": [
        "https://www.google.com/",
        "helloworld"
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
  "duration": 1631083874,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.addToSeachInput(DataTable)"
});
formatter.result({
  "duration": 298965683,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.clickSearchButton()"
});
formatter.result({
  "duration": 1529100582,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.getListOfResults()"
});
formatter.result({
  "duration": 11510248,
  "status": "passed"
});
formatter.after({
  "duration": 130089752,
  "status": "passed"
});
});