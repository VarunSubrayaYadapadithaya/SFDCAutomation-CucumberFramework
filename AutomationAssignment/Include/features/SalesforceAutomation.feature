#Author: varun.varo@gmail.com

@LoginToURL
Feature: Login to developer.salesforce.com and check the functionalities

  @TC001
  Scenario: Login to developer.salesforce.com URL
    Given I enter the URL
    Then I should see the homepage
    
  @TC002
  Scenario: Search for Writing Tests and Assert Writing test page is listed
    Given I enter the Writing Tests in the searchbox and click Enter key
    Then I should see the result page
    
  @TC003
  Scenario: Retrieve the links in the contents, click each one of them and verify links are working
    Given Click on the Writing tests page and check the links under contents
    Then I should see each clicked 'contents' link opened
    
  @TC004
  Scenario: On the Writing Tests Page, Click Link Testing Apex and Verify Testing Apex page is loaded and close the Browser.
    Given I Search for Writing Tests and click Enter key
    When I am on Writing Tests Page
    And I Click the Link 'Testing Apex'
    Then I Verify Testing Apex page is loaded
    
 
