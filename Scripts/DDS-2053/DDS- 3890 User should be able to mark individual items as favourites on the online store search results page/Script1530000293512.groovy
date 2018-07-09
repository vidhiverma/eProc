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

WebUI.waitForElementPresent(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For 2 row item list'), 50)

WebUI.waitForElementPresent(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For ITEM1'), 10)

WebUI.waitForElementPresent(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For Item3'), 10)

String Attribute1 = WebUI.getAttribute(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For ITEM1'), 
    'ng-reflect-icon')

String Attribute2 = WebUI.getAttribute(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For Item3'), 
    'ng-reflect-icon')

if (Attribute1 == 'heart-fill') {
    WebUI.mouseOver(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For ITEM1'))

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For ITEM1'))

    WebUI.delay(2)

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For ITEM1'))

    WebUI.delay(3)

    WebUI.verifyElementAttributeValue(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For ITEM1'), 
        'ng-reflect-icon', 'heart-fill', 5)
} else {
    WebUI.mouseOver(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For ITEM1'))

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For ITEM1'))

    WebUI.delay(2)

    WebUI.verifyElementAttributeValue(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For ITEM1'), 
        'ng-reflect-icon', 'heart-fill', 5)
}

if (Attribute2 == 'heart-fill') {
    WebUI.mouseOver(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For Item3'))

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For Item3'))

    WebUI.delay(2)

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For Item3'))

    WebUI.delay(3)

    WebUI.verifyElementAttributeValue(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For Item3'), 
        'ng-reflect-icon', 'heart-fill', 5)
} else {
    WebUI.mouseOver(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For Item3'))

    WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For Item3'))

    WebUI.delay(3)

    WebUI.verifyElementAttributeValue(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Favorite Button For Item3'), 
        'ng-reflect-icon', 'heart-fill', 5)
}

WebUI.closeBrowser()

