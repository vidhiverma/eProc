import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonLibraries/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('OnlineStorePage/Search Box'), findTestData('TestData').getValue(4, 6))

WebUI.click(findTestObject('OnlineStorePage/Search Icon'))

WebUI.waitForElementPresent(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 1 Row Item List'), 
    50)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/ERP ID verifications/ERP ID verification'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/ERP ID verifications/ERP ID text'), 
    '9999999999999')

WebUI.delay(2)

WebUI.takeScreenshot('C:\\Screenshot/ERPIDSearch.png')

WebUI.closeBrowser()
