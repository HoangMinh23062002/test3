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

WebUI.click(findTestObject('Object Repository/hmmm/Page_Vite  React  TS/p_product'))

WebUI.click(findTestObject('Object Repository/hmmm/Page_Vite  React  TS/div_by price_horizontal-slider'))

WebUI.verifyElementPresent(findTestObject('Object Repository/hmmm/Page_Vite  React  TS/div_by price_example-thumb example-thumb-0 active'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/hmmm/Page_Vite  React  TS/div_by price_example-thumb example-thumb-1 active'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/hmmm/Page_Vite  React  TS/select_all NgtKh'), '20', true)

WebUI.setText(findTestObject('Object Repository/hmmm/Page_Vite  React  TS/input_The best offer that we offer to the w_af0838'), 
    'IPH')

