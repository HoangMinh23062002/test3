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

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/p_product'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/img_Filter_chakra-image css-lxd7e7'))

WebUI.setText(findTestObject('Object Repository/PD/Page_Vite  React  TS/input_Add to cart_chakra-input css-108b1as'), '134567867')

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/button_Add to cart'))

WebUI.doubleClick(findTestObject('Object Repository/PD/Page_Vite  React  TS/svg_Add to cart_chakra-icon css-a7mwtc'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/svg_Add to cart_chakra-icon css-a7mwtc'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/svg_Add to cart_chakra-icon css-a7mwtc'))

WebUI.doubleClick(findTestObject('Object Repository/PD/Page_Vite  React  TS/rect'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/rect'))

WebUI.doubleClick(findTestObject('Object Repository/PD/Page_Vite  React  TS/rect'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/rect'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/button_Buy now'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/p_product'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/img_Filter_chakra-image css-lxd7e7'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/button_Reviews'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/button_Description'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/button_Reviews'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/button_Description'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/p_product'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/button_21'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/img_Filter_chakra-image css-lxd7e7_1'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/img_Add to cart_chakra-image css-1laxgy7'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/img_Filter_chakra-image css-lxd7e7_1'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/div_ffgdf4Pellentesque habitant morbi trist_8d1679'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/img_Add to cart_chakra-image css-1laxgy7'))

WebUI.click(findTestObject('Object Repository/PD/Page_Vite  React  TS/p_product'))

WebUI.closeBrowser()

