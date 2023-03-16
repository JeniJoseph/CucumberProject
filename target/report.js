$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Facebook.feature");
formatter.feature({
  "name": "To check the functionality of facebook elements",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check the userid and password of the facebook element",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set the url",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookClass.set_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set the user id",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookClass.set_the_user_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set the password",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookClass.set_the_password()"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat org.stepdefinition.FacebookClass.set_the_password(FacebookClass.java:32)\r\n\tat ✽.Set the password(src/test/resources/Facebook.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Login the fb",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookClass.login_the_fb()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookClass.close_the_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});