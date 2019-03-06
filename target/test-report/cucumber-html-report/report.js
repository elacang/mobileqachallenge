$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/mobileqachallenge.feature");
formatter.feature({
  "name": "Mobile QA Challenge",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "04 Select \"Digtal Music\" department from Amazon website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I am at http://www.amazon.com website",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonPageSteps.java:14"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"Digital Music\" department from the menu",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonPageSteps.java:13"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I obtain the page title",
  "keyword": "And "
});
formatter.match({
  "location": "CommonPageSteps.java:17"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see \"Amazon.com: Digital Music\" as the page title",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageSteps.java:21"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});