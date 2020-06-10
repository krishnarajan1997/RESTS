$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/file.feature");
formatter.feature({
  "name": "going to verify the adactin webpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify the login page with valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "enter the valid data to username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "Mainclass.enter_the_valid_data_to_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Mainclass.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the outcome result",
  "keyword": "Then "
});
formatter.match({
  "location": "Mainclass.verify_the_outcome_result()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.stepdefinition.Mainclass.verify_the_outcome_result(Mainclass.java:29)\r\n\tat ✽.verify the outcome result(src/test/resources/feature/file.feature:5)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "verify the login page invalid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter  invalid user and password",
  "keyword": "Given "
});
formatter.match({
  "location": "Mainclass.enter_invalid_user_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login",
  "keyword": "When "
});
formatter.match({
  "location": "Mainclass.click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the result",
  "keyword": "Then "
});
formatter.match({
  "location": "Mainclass.check_the_result()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.stepdefinition.Mainclass.check_the_result(Mainclass.java:50)\r\n\tat ✽.check the result(src/test/resources/feature/file.feature:10)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "check the login page with invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "pass the data to username only",
  "keyword": "Given "
});
formatter.match({
  "location": "Mainclass.pass_the_data_to_username_only()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the log button in page",
  "keyword": "When "
});
formatter.match({
  "location": "Mainclass.click_the_log_button_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the outcome result",
  "keyword": "Then "
});
formatter.match({
  "location": "Mainclass.check_the_outcome_result()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.stepdefinition.Mainclass.check_the_outcome_result(Mainclass.java:69)\r\n\tat ✽.Check the outcome result(src/test/resources/feature/file.feature:15)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
});