$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("basic.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "This feature deals with the basic usage of the search bar",
  "id": "search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5203052440,
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
        "search"
      ],
      "line": 7
    },
    {
      "cells": [
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
  "duration": 1818105376,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.addToSeachInput(DataTable)"
});
formatter.result({
  "duration": 205741180,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.clickSearchButton()"
});
formatter.result({
  "duration": 1301748118,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.getListOfResults()"
});
formatter.result({
  "duration": 19011935,
  "error_message": "org.junit.ComparisonFailure: expected:\u003chelloworl[d] - Google Search\u003e but was:\u003chelloworl[] - Google Search\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat steps.basicStep.getListOfResults(basicStep.java:45)\n\tat ✽.Then I should see the search list page(basic.feature:10)\n",
  "status": "failed"
});
formatter.after({
  "duration": 191728661,
  "status": "passed"
});
});