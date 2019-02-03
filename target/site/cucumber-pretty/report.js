$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("basic.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the basic usage of the",
  "id": "loginfeature",
  "keyword": "Feature"
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
        "tosearch"
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
  "name": "I should see the search list p",
  "keyword": "Then "
});
formatter.match({
  "location": "basicStep.i_navigate_to_the_main_search_page()"
});
formatter.result({
  "duration": 329379680,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.i_enter_the_following_for_Search(DataTable)"
});
formatter.result({
  "duration": 3551419,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.i_click_search_button()"
});
formatter.result({
  "duration": 296355,
  "status": "passed"
});
formatter.match({
  "location": "basicStep.i_should_see_the_search_list_p()"
});
formatter.result({
  "duration": 49697,
  "status": "passed"
});
});