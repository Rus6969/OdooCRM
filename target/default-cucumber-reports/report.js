$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Notes.feature");
formatter.feature({
  "name": "Navigate to Notes",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@notes"
    }
  ]
});
formatter.scenario({
  "name": "Login as a sales manager and navigate to Note module",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@notes"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sales manager enters login credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.sales_manager_enters_login_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.the_user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Note module",
  "keyword": "When "
});
formatter.match({
  "location": "NotesStepDefs.the_user_clicks_on_Note_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be navigated to Note",
  "keyword": "Then "
});
formatter.match({
  "location": "NotesStepDefs.the_user_should_be_navigated_to_Note()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});