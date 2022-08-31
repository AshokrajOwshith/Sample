$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FaceBookFeatures/FacebookLogin.feature");
formatter.feature({
  "name": "Validation of LoginPage in FaceBook Application",
  "description": "",
  "keyword": "Feature"
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
  "name": "User Lanuch FaceBook Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionFaceBook.user_Lanuch_FaceBook_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify login page is displayed",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionFaceBook.user_verify_login_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC01_Validation of login page with invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters invalid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionFaceBook.user_enters_invalid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionFaceBook.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify error message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFaceBook.user_verify_error_message_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});