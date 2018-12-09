package sfdc
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class SalesforceAutomation {

	@Given("I enter the URL")
	def I_enter_the_URL() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('developer.salesforce.com')
	}

	@Then("I should see the homepage")
	def I_see_homepage() {

		String PageTitle = WebUI.getWindowTitle()

		WebUI.verifyMatch(PageTitle, 'Salesforce Developers | API Documentation, Developer Forums & More', false)
	}

	@Given("I enter the Writing Tests in the searchbox and click Enter key")
	public void i_enter_the_Writing_Tests_in_the_searchbox_and_click_Enter_key() {
		if (WebUI.verifyElementPresent(findTestObject('Page_Salesforce Developers  API Doc/GDPR_Div_CloseButton'), 60, FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Page_Salesforce Developers  API Doc/GDPR_Div_CloseButton'))
		}

		WebUI.waitForElementVisible(findTestObject('Page_Salesforce Developers  API Doc/Search_TextBox'), 60)

		WebUI.setText(findTestObject('Page_Salesforce Developers  API Doc/Search_TextBox'), 'Writing Tests')

		WebUI.sendKeys(findTestObject('Page_Salesforce Developers  API Doc/Search_TextBox'), Keys.chord(Keys.ENTER))
	}

	@Then("I should see the result page")
	public void i_should_see_the_result_page() {
		WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('Page_Search/a_Writing Tests  Apex Develope'), 30)
	}
	
	@Given("Click on the Writing tests page and check the links under contents")
	public void Click_on_the_Writing_tests_page_and_check_the_links_under_contents() {
		WebUI.waitForElementClickable(findTestObject('Page_Search/a_Writing Tests  Apex Develope'), 20)
		
		WebUI.click(findTestObject('Page_Search/a_Writing Tests  Apex Develope'), FailureHandling.STOP_ON_FAILURE)
		
		WebUI.delay(5)
		
		
		}

	@Then("I should see each clicked 'contents' link opened")
	public void I_should_see_each_clicked_contents_link_opened() {
		
		WebDriver driver = DriverFactory.getWebDriver()
		
		int contentSize = driver.findElements(By.xpath('(//div[@class=\'toc-container\']/following::span[contains(@class,\'ng-binding ng-scope\')])')).size()
		
		int index = 1
		
		while (contentSize != index) {
			
			WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Page_Writing Tests  Apex Developer/ContentLinks',
					[('x') : index]), 30)
		
			WebUI.scrollToElement(findTestObject('Page_Writing Tests  Apex Developer/ContentLinks', [('x') : index]), 10, FailureHandling.CONTINUE_ON_FAILURE)
		
			String contentLinkText = WebUI.getText(findTestObject('Page_Writing Tests  Apex Developer/ContentLinks', [('x') : index]),
				FailureHandling.CONTINUE_ON_FAILURE)
		
			WebUI.click(findTestObject('Page_Writing Tests  Apex Developer/ContentLinks', [('x') : index]), FailureHandling.CONTINUE_ON_FAILURE)
		
			WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
		
			String header = WebUI.getText(findTestObject('Page_Writing Tests  Apex Developer/h1_ContentHeader'), FailureHandling.CONTINUE_ON_FAILURE)
		
			WebUI.scrollToElement(findTestObject('Page_Writing Tests  Apex Developer/h1_ContentHeader'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		
			WebUI.verifyElementText(findTestObject('Page_Writing Tests  Apex Developer/h1_ContentHeader'), contentLinkText, FailureHandling.CONTINUE_ON_FAILURE)
		
			if (index == 100) {
				
				break;
			}
			
			index++
		
			contentSize = driver.findElements(By.xpath('(//div[@class=\'toc-container\']/following::span[contains(@class,\'ng-binding ng-scope\')])')).size()
		}
		
		
		
		}
	
	@Given("I Search for Writing Tests and click Enter key")
	public void I_enter_the_Writing_Tests_in_the_searchbox_and_click_Enter() {
		
		WebUI.waitForElementVisible(findTestObject('Page_Salesforce Developers  API Doc/Search_TextBox'), 60)
		
		WebUI.setText(findTestObject('Page_Salesforce Developers  API Doc/Search_TextBox'), 'Writing Tests')
		
		WebUI.sendKeys(findTestObject('Page_Salesforce Developers  API Doc/Search_TextBox'), Keys.chord(Keys.ENTER))
		
		WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)
		
		}
	
	@When("I am on Writing Tests Page")
	public void I_am_on_Writing_Tests_Page() {
		
		
		
		WebUI.verifyElementPresent(findTestObject('Page_Search/a_Writing Tests  Apex Develope'), 30)
		
		WebUI.waitForElementClickable(findTestObject('Page_Search/a_Writing Tests  Apex Develope'), 20)
		
		WebUI.click(findTestObject('Page_Search/a_Writing Tests  Apex Develope'), FailureHandling.STOP_ON_FAILURE)
		
		WebUI.delay(3)
		
		}

	
	@And("I Click the Link 'Testing Apex'")
	public void I_Click_Testing_Apex() {
		
		
		WebUI.scrollToElement(findTestObject('Page_Writing Tests  Apex Developer/a_Testing Apex'), 15)
		
		WebUI.click(findTestObject('Page_Writing Tests  Apex Developer/a_Testing Apex'), FailureHandling.STOP_ON_FAILURE)
		
		WebUI.delay(1)
		
		
		}

	@Then("I Verify Testing Apex page is loaded")
	public void I_Verify_page_is_loaded() {
		
		String header = WebUI.getText(findTestObject('Page_Writing Tests  Apex Developer/h1_ContentHeader'), FailureHandling.CONTINUE_ON_FAILURE)
		
		WebUI.scrollToElement(findTestObject('Page_Writing Tests  Apex Developer/h1_ContentHeader'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		
		WebUI.verifyElementText(findTestObject('Page_Writing Tests  Apex Developer/h1_ContentHeader'), 'Testing Apex', FailureHandling.CONTINUE_ON_FAILURE)
		
		WebUI.closeBrowser()
		
		}
}