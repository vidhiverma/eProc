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

WebUI.waitForElementPresent(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'), 0)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

WebUI.click(findTestObject('OnlineStorePage/CartIcon'))

WebUI.click(findTestObject('Cart Page/Delete Icon_line item 1'))

WebUI.click(findTestObject('Popups/Delete Item Pop Up/Yes Button'))

WebUI.verifyElementText(findTestObject('Cart Page/Delete One Item  Message '), 'Item successfully deleted')

WebUI.click(findTestObject('Home'))

WebUI.sendKeys(findTestObject('OnlineStorePage/SerachBox'), findTestData('TestData').getValue(2, 4))

WebUI.click(findTestObject('OnlineStorePage/SearchIcon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

WebUI.click(findTestObject('OnlineStorePage/CartIcon'))

WebUI.click(findTestObject('Cart Page/Delete Icon_line item 1'))

WebUI.click(findTestObject('Popups/Delete Item Pop Up/Yes Button'))

WebUI.verifyElementText(findTestObject('Cart Page/Delete One Item  Message '), 'Item successfully deleted')

WebUI.closeBrowser()
