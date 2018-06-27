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

WebUI.callTestCase(findTestCase('CommonLibraries/Search'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxFirstItem'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxSecondItem'))

WebUI.doubleClick(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

WebUI.delay(5)

WebUI.back()

WebUI.doubleClick(findTestObject('OnlineStorePage/CartIcon'))

WebUI.doubleClick(findTestObject('Cart Page/Empty Cart Button'))

WebUI.doubleClick(findTestObject('Popups/Empty cart/Yes Button'))

WebUI.delay(5)

WebUI.back()

for (int i : (2..4)) {
    WebUI.sendKeys(findTestObject('OnlineStorePage/SerachBox'), findTestData('TestData').getValue(i, 4))

    WebUI.click(findTestObject('OnlineStorePage/SearchIcon'), FailureHandling.STOP_ON_FAILURE)

    WebUI.check(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxFirstItem'))

    WebUI.check(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxSecondItem'))

    WebUI.doubleClick(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

    WebUI.back()
}

WebUI.doubleClick(findTestObject('OnlineStorePage/CartIcon'))

WebUI.verifyElementPresent(findTestObject('CartPage/ScrollBar'), 10)

WebUI.delay(5)

WebUI.closeBrowser()

