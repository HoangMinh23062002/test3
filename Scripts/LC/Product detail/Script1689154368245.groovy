import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/p_product'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/button_22'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/img_d_chakra-image css-lxd7e7'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.doubleClick(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_You item already in shopping cart'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_Successfully'), 0)

WebUI.setText(findTestObject('productdetail/Page_Vite  React  TS/input_Add to cart_chakra-input css-108b1as'), '1345678')

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/button_Buy now'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/a_Gi ch bnh 29'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/button_Reviews'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/p_product'))

WebUI.setText(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx'), 'Bún')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_Local specialtys areasThe best offer th_d9771b'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/img_Filter_chakra-image css-lxd7e7'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.doubleClick(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.setText(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/input_Add to cart_chakra-input css-108b1as'), 
    '1345678')

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/p_Show more'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/p_Show less'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/button_Reviews_1'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/button_Description'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/button_Buy now'))

WebUI.click(findTestObject('Object Repository/productdetail/Page_Vite  React  TS/p_product'))

WebUI.closeBrowser()

