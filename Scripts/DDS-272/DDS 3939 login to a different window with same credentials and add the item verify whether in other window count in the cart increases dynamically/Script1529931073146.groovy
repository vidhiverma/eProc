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

WebUI.click(findTestObject('OnlineStorePage/CartIcon'))

WebUI.delay(3)

String b = WebUI.getAttribute(findTestObject('Cart Page/Empty Cart Button'), 'ng-reflect-is-disabled')

if (b == 'false') {
    WebUI.click(findTestObject('Cart Page/Empty Cart Button'))

    WebUI.click(findTestObject('Object Repository/Popups/Empty cart/Yes Button'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Home'))

    WebUI.sendKeys(findTestObject('OnlineStorePage/SerachBox'), findTestData('TestData').getValue(2, 4))

    WebUI.click(findTestObject('OnlineStorePage/SearchIcon'))

    WebUI.waitForElementVisible(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'), 50)

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'))

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item1'))

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

    WebUI.callTestCase(findTestCase('CommonLibraries/Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('OnlineStorePage/CartIcon'), 50)

    WebUI.click(findTestObject('OnlineStorePage/CartIcon'))

    WebUI.verifyElementText(findTestObject('Cart Page/Count Display For Count 2'), 'Cart (02)')

    WebUI.closeBrowser()
} else {
    WebUI.click(findTestObject('Home'))

    WebUI.sendKeys(findTestObject('OnlineStorePage/SerachBox'), findTestData('TestData').getValue(2, 4))

    WebUI.click(findTestObject('OnlineStorePage/SearchIcon'))

    WebUI.waitForElementVisible(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'), 50)

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'))

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item1'))

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToCart_MultipleItem'))

    WebUI.callTestCase(findTestCase('CommonLibraries/Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('OnlineStorePage/CartIcon'), 50)

    WebUI.click(findTestObject('OnlineStorePage/CartIcon'))

    WebUI.verifyElementText(findTestObject('Cart Page/Count Display For Count 2'), 'Cart (02)')

    WebUI.closeBrowser()
}

