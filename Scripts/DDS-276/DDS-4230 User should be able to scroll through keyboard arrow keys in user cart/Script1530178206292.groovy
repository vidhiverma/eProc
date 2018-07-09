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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('CommonLibraries/Search By Pen'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 1 Row Item List'), 
    50)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 1 Row Item List'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 2 row item list'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 3 Row Item List'))

WebUI.scrollToElement(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 3 Row Item List'), 4)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 4 Row Item List'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 5 Row Item List'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 6 Row Item List'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 7 Row Item List'))

WebUI.scrollToElement(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 7 Row Item List'), 4)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 8 Row Item List'))

WebUI.scrollToElement(findTestObject('OnlineStorePage/CartIcon'), 6)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

WebUI.delay(5)

WebUI.click(findTestObject('OnlineStorePage/CartIcon'))

WebUI.click(findTestObject('Cart Page/Line Item Details/Quantity or Amt'))

WebUI.sendKeys(findTestObject('Cart Page/Scroll For Element 5 line Item'), Keys.chord(Keys.DOWN))

WebUI.closeBrowser()
