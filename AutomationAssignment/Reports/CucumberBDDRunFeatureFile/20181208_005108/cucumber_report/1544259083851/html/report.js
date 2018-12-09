$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/VarunSubrayaYadapadithaya/Desktop/Varun/Work/eclipse workspaces/AutomationAssignment/Include/features/SalesforceAutomation.feature");
formatter.feature({
  "name": "Login to developer.salesforce.com and check the functionalities",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginToURL"
    }
  ]
});
formatter.scenario({
  "name": "Login to developer.salesforce.com URL",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginToURL"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I enter the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "SalesforceAutomation.I_enter_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "SalesforceAutomation.I_see_homepage()"
});
formatter.result({
  "status": "passed"
});
});