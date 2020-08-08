$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/new_account.feature");
formatter.feature({
  "line": 1,
  "name": "New Account Page",
  "description": "As a user I want a New account Page so that accounts can be created.",
  "id": "new-account-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7380231700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add new account",
  "description": "",
  "id": "new-account-page;add-new-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "a user with username \"techfiosdemo@gmail.com\" and password \"abc123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigates to New Account Page",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "techfiosdemo@gmail.com",
      "offset": 22
    },
    {
      "val": "abc123",
      "offset": 60
    }
  ],
  "location": "NewAccountSteps.a_user_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 2711680000,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 6146642800,
  "status": "passed"
});
});