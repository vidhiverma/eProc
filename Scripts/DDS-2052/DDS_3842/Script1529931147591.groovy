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

WebUI.delay(10)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxFirstItem'))

String itemName = WebUI.getText(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/FirstItemNameHyperlink'))

WebUI.doubleClick(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToBasketMultipleItem'))

WebUI.sendKeys(findTestObject('Popups/AddToBasket/BasketNameInputBox'), 'Testbasket')

WebUI.doubleClick(findTestObject('Popups/AddToBasket/ButtonAddToBasket'))

WebUI.delay(5)

WebUI.back()

WebUI.doubleClick(findTestObject('OnlineStorePage/HeaderTab/BasketsTab/BasketsTab'))

WebUI.doubleClick(findTestObject('OnlineStorePage/HeaderTab/BasketsTab/ViewAllButton'))

WebUI.delay(10)

WebUI.doubleClick(findTestObject('BasketsPage/Basket'))

WebUI.delay(5)

WebUI.click(findTestObject('BasketItemsListingPage/Item1/FavoriteIcon'))

WebUI.delay(5)

WebUI.back()

WebUI.back()

WebUI.delay(10)

WebUI.doubleClick(findTestObject('OnlineStorePage/HeaderTab/FavoritesAndPreviouslyUsedTab/FavoritesAndPreviouslyUsedTab'))

WebUI.doubleClick(findTestObject('OnlineStorePage/HeaderTab/FavoritesAndPreviouslyUsedTab/ViewAllButton'))

WebUI.delay(5)

String favoriteItemName = WebUI.getText(findTestObject('FavoritesAndPreviouslyUsedPage/FavoritesItemOne'))

WebUI.verifyMatch(itemName, favoriteItemName, true)

WebUI.delay(10)

WebUI.closeBrowser()

