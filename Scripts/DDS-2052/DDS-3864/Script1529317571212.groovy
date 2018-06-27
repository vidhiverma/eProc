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

WebUI.waitForElementClickable(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'), 10)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/Check Box For Item3'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToBasketMultipleItem'))

WebUI.click(findTestObject('Popups/AddToBasket/RadioButtonExistingBasket'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Popups/AddToBasket/SearchAndSelectBox'), findTestData('TestData').getValue(2, 5))

WebUI.click(findTestObject('Popups/AddToBasket/SelectNameFromTextBox'))

WebUI.waitForElementVisible(findTestObject('Popups/AddToBasket/ButtonAddToBasket'), 0)

WebUI.click(findTestObject('Popups/AddToBasket/ButtonAddToBasket'))

WebUI.click(findTestObject('Home'))

WebUI.click(findTestObject('OnlineStorePage/HeaderTab/BasketsTab/BasketsTab'))

