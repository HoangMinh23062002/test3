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

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/p_product (3)'))

WebUI.setText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx (3)'), 
    'Bún')

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/div_Local specialtys areasThe best offer th_178a87 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/button_2 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/button_3 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/button_bn_chakra-button css-fx3q01'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/button_bn_chakra-button css-fx3q01'))

WebUI.closeBrowser()