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

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/p_product'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/label_Less than 300.000'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/label_From 300.000 to 800.000'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/label_More than 800.000'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/button_Kh'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/label_Less than 300.000'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/div_allKhMinhhonag'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/button_Minhhonag'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/button_Kh'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/label_Less than 300.000'))

WebUI.click(findTestObject('Object Repository/Filterr/Page_Vite  React  TS/label_All'))

WebUI.closeBrowser()