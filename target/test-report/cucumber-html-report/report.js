$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/mobileqachallenge.feature");
formatter.feature({
  "name": "Mobile QA Challenge",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "01 Navigate to Kraken website and check that the landing page title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I am at http://www.kraken.com website",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonPageSteps.java:14"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I obtain the pagetitle",
  "keyword": "When "
});
formatter.match({
  "location": "CommonPageSteps.java:17"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see \"Bitcoin \u0026 Cryptocurrency Exchange | Bitcoin Trading Platform | Kraken\"",
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