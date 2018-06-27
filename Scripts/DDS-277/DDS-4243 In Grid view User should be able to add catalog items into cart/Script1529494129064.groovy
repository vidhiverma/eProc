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

WebUI.callTestCase(findTestCase('CommonLibraries/Search By Item'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.delay(10)

WebUI.click(findTestObject('SearchResultPage/GridViewButton'))

WebUI.waitForElementVisible(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Grid view/Check Box 1 item'), 50)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Grid view/Check Box 1 item'))

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/Item3 For 3 Row'), 'item 1')

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Grid view/Check Box 1 item'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Grid view/Add To Cart 1 Item'))

WebUI.click(findTestObject('OnlineStorePage/CartIcon'))

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/Item3 For 3 Row'), 'item 1')

WebUI.closeBrowser()

