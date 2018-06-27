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

WebUI.waitForElementVisible(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'), 20)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

WebUI.click(findTestObject('OnlineStorePage/CartIcon'))

not_run: WebUI.click(findTestObject('Cart Page/Empty Cart Button'))

WebUI.delay(6)

WebUI.click(findTestObject('Popups/Empty cart/Yes Button'))

WebUI.delay(2)

WebUI.verifyElementNotVisible(findTestObject('Cart Page/Checkout Button'))

WebUI.verifyElementNotVisible(findTestObject('Cart Page/Add Cart To Basket Button'))

WebUI.verifyElementNotVisible(findTestObject('Cart Page/Empty Cart Button'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

