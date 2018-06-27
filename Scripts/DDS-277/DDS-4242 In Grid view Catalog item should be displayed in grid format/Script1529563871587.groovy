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

WebUI.click(findTestObject('SearchResultPage/ListViewButton'))

WebUI.waitForElementVisible(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/Item3 For 3 Row'), 20)

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/Item3 For 3 Row'), 'item 1')

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/ITEM1 For 2 Row'), 'item 10')

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/ITEM1 For 1 row'), 'item 11')

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/ITEM89 For 4 Row'), 'item 12')

WebUI.click(findTestObject('SearchResultPage/GridViewButton'))

WebUI.waitForElementVisible(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/Item3 For 3 Row'), 20)

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/Item3 For 3 Row'), 'item 1')

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/ITEM1 For 2 Row'), 'item 10')

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/ITEM1 For 1 row'), 'item 11')

WebUI.verifyElementText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Catalog Item List Verification/ITEM89 For 4 Row'), 'item 12')

WebUI.takeScreenshot('C:\\Screenshot/Grid view.png')

WebUI.closeBrowser()

