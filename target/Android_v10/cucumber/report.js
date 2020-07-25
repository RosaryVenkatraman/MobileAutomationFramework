$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/com/impiger/freshbeniesmobile/features/01LoginPage.feature");
formatter.feature({
  "name": "Freshbenies Login Page Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate login functionality with incorrect credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "app is opened and in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.impiger.freshbeniesmobile.stepDefinitions.LoginPageSteps.app_is_opened_and_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter invalid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.impiger.freshbeniesmobile.stepDefinitions.LoginPageSteps.enter_invalid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate whether appropriate error mesage is thrown",
  "keyword": "Then "
});
formatter.match({
  "location": "com.impiger.freshbeniesmobile.stepDefinitions.LoginPageSteps.validate_whether_appropriate_error_mesage_is_thrown()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate forgotpassword link presence",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "app is opened and in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.impiger.freshbeniesmobile.stepDefinitions.LoginPageSteps.app_is_opened_and_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate whether the forgotpassword link is present",
  "keyword": "Then "
});
formatter.match({
  "location": "com.impiger.freshbeniesmobile.stepDefinitions.LoginPageSteps.validate_whether_the_forgotpassword_link_is_present()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate login functionality with correct credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "app is opened and in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.impiger.freshbeniesmobile.stepDefinitions.LoginPageSteps.app_is_opened_and_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.impiger.freshbeniesmobile.stepDefinitions.LoginPageSteps.enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate whether homepage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.impiger.freshbeniesmobile.stepDefinitions.LoginPageSteps.validate_whether_homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});