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

WebUI.doubleClick(findTestObject('OnlineStorePage/CartIcon'))

if (WebUI.verifyElementClickable(findTestObject('CartPage/EmptyCartButton')) == true) {
    WebUI.doubleClick(findTestObject('CartPage/EmptyCartButton'))

    WebUI.doubleClick(findTestObject('Popups/Empty cart/Yes Button'))

    WebUI.delay(10)
}

WebUI.doubleClick(findTestObject('CartPage/EmptyCartButton'))

WebUI.doubleClick(findTestObject('Popups/Empty cart/Yes Button'))

WebUI.delay(10)

WebUI.back()

for (int i : (2..4)) {
    WebUI.sendKeys(findTestObject('OnlineStorePage/SearchBox'), findTestData('TestData').getValue(i, 4))

    WebUI.click(findTestObject('OnlineStorePage/SearchIcon'), FailureHandling.STOP_ON_FAILURE)

    WebUI.check(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxFirstItem'))

    WebUI.check(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxSecondItem'))

    WebUI.doubleClick(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

    WebUI.back()
}

WebUI.sendKeys(findTestObject('OnlineStorePage/SearchBox'), findTestData('TestData').getValue(i, 4))

WebUI.click(findTestObject('OnlineStorePage/SearchIcon'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxFirstItem'))

WebUI.check(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxSecondItem'))

WebUI.doubleClick(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

WebUI.back()

WebUI.doubleClick(findTestObject('OnlineStorePage/CartIcon'))

WebUI.verifyElementPresent(findTestObject('CartPage/ScrollBar'), 10)

WebUI.closeBrowser()

