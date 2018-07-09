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

WebUI.openBrowser(findTestData('TestData').getValue(2, 1))

WebUI.waitForElementVisible(findTestObject('LoginPage/UserID'), 10)

WebUI.sendKeys(findTestObject('LoginPage/UserID'), findTestData('TestData').getValue(5, 2))

WebUI.sendKeys(findTestObject('LoginPage/Password'), findTestData('TestData').getValue(3, 3))

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('OnlineStorePage/Search Box'), findTestData('TestData').getValue(2, 4))

WebUI.click(findTestObject('OnlineStorePage/Search Icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15)

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxFirstItem'))

WebUI.click(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/CheckboxSecondItem'))

WebUI.doubleClick(findTestObject('SearchResultPage/SearchItemTab/CatalogItems/AddToBasketMultipleItem'))

WebUI.sendKeys(findTestObject('Popups/AddToBasket/BasketNameInputBox'), 'Newsharingbasket')

WebUI.doubleClick(findTestObject('Popups/AddToBasket/Add To Basket'))

WebUI.delay(5)

WebUI.back()

WebUI.doubleClick(findTestObject('OnlineStorePage/HeaderTab/BasketsTab/BasketsTab'))

WebUI.doubleClick(findTestObject('OnlineStorePage/HeaderTab/BasketsTab/ViewAllButton'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('BasketsPage/BasketDetails/BasketAddToCartButton'), 5)

WebUI.doubleClick(findTestObject('BasketsPage/BasketDetails/BasketShareButton'))

WebUI.doubleClick(findTestObject('Popups/SharingScope/ShareButton'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('DropDown/NavigationBar/My account icon'))

WebUI.doubleClick(findTestObject('DropDown/NavigationBar/Logout'))

WebUI.delay(10)

WebUI.callTestCase(findTestCase('CommonLibraries/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.doubleClick(findTestObject('OnlineStorePage/HeaderTab/BasketsTab/BasketsTab'))

WebUI.doubleClick(findTestObject('OnlineStorePage/HeaderTab/BasketsTab/ViewAllButton'))

WebUI.doubleClick(findTestObject('BasketsPage/BasketsSubTab/SharedBaskets'))

WebUI.delay(10)

WebUI.verifyTextPresent('Newsharingbasket', true)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('BasketsPage/BasketsSubTab/SharedBasket/AddToCart'), 5)

WebUI.delay(5)

WebUI.closeBrowser()

