$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/CodeFiosLogin.feature");
formatter.feature({
  "name": "Codefios Other Add New Account validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginScenario"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to loging succefully and add a new account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" in the \"username\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the \"\u003cpassword\u003e\" in the \"password\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on \"listAccounts\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"addAccount\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountName\u003e\" in the \"accountName\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cdescription\u003e\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountNumber\u003e\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccontactPerson\u003e\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"Save\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountName",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson"
      ]
    },
    {
      "cells": [
        "demo@codefios.com",
        "abc123",
        "susmita",
        "savingAccount",
        "30000",
        "24563",
        "sseope"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.userIsOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to loging succefully and add a new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginScenario"
    }
  ]
});
formatter.step({
  "name": "User enters the \"demo@codefios.com\" in the \"username\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.userEntersUsernameAndPassword(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"abc123\" in the \"password\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.userEntersUsernameAndPassword(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.clicksOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.dashboardvalidation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"listAccounts\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.clicksOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"addAccount\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.clicksOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"susmita\" in the \"accountName\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ListAccountStepDefinition.userEntersDetails(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"savingAccount\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ListAccountStepDefinition.userEntersDetails(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"30000\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ListAccountStepDefinition.userEntersDetails(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"24563\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ListAccountStepDefinition.userEntersDetails(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"sseope\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ListAccountStepDefinition.userEntersDetails(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"Save\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.clicksOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListAccountStepDefinition.validateAccount()"
});
formatter.result({
  "status": "passed"
});
});