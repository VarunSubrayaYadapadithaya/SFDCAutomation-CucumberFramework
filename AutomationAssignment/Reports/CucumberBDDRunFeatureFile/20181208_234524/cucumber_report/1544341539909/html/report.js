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
      "name": "@TC001"
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
formatter.scenario({
  "name": "Search for Writing Tests and Assert Writing test page is listed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginToURL"
    },
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "I enter the Writing Tests in the searchbox and click Enter key",
  "keyword": "Given "
});
formatter.match({
  "location": "SalesforceAutomation.i_enter_the_Writing_Tests_in_the_searchbox_and_click_Enter_key()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the result page",
  "keyword": "Then "
});
formatter.match({
  "location": "SalesforceAutomation.i_should_see_the_result_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Retrieve the links in the contents, click each one of them and verify links are working",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginToURL"
    },
    {
      "name": "@TC003"
    }
  ]
});
formatter.step({
  "name": "Click on the Writing tests page and check the links under contents",
  "keyword": "Given "
});
formatter.match({
  "location": "SalesforceAutomation.Click_on_the_Writing_tests_page_and_check_the_links_under_contents()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see each clicked \u0027contents\u0027 link opened",
  "keyword": "Then "
});
formatter.match({
  "location": "SalesforceAutomation.I_should_see_each_clicked_contents_link_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "On the Writing Tests Page, Click Link Testing Apex and Verify Testing Apex page is loaded and close the Browser.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginToURL"
    },
    {
      "name": "@TC004"
    }
  ]
});
formatter.step({
  "name": "I Search for Writing Tests and click Enter key",
  "keyword": "Given "
});
formatter.match({
  "location": "SalesforceAutomation.I_enter_the_Writing_Tests_in_the_searchbox_and_click_Enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on Writing Tests Page",
  "keyword": "When "
});
formatter.match({
  "location": "SalesforceAutomation.I_am_on_Writing_Tests_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click the Link \u0027Testing Apex\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "SalesforceAutomation.I_Click_Testing_Apex()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify Testing Apex page is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "SalesforceAutomation.I_Verify_page_is_loaded()"
});
formatter.result({
  "status": "passed"
});
});