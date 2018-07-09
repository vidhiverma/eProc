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

WebUI.callTestCase(findTestCase('CommonLibraries/Search By Item'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 3 Row Item List'), 
    30)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 3 Row Item List'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

WebUI.click(findTestObject('OnlineStorePage/CartIcon'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Cart Page/Qty or Amt Edit Box for line item1'), Keys.chord(Keys.BACK_SPACE, '1'))

WebUI.click(findTestObject('Cart Page/Line Item Details/Quantity or Amt'))

WebUI.verifyElementText(findTestObject('Cart Page/Item Quantity added message'), 'Item quantity successfully updated to cart')

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('Cart Page/Qty or Amt Edit Box for line item1'), 'ng-reflect-model', '1', 
    2)

WebUI.closeBrowser()

