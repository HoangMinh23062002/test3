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

WebUI.click(findTestObject('Object Repository/getText/Page_Vite  React  TS/p_product'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/getText/Page_Vite  React  TS/div_by price_horizontal-slider'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Object Repository/getText/Page_Vite  React  TS/minValue'), 10)

minValue = WebUI.getAttribute(findTestObject('Object Repository/getText/Page_Vite  React  TS/minValue'), 'aria-valuenow')

maxValue = WebUI.getAttribute(findTestObject('Object Repository/getText/Page_Vite  React  TS/maxValue'), 'aria-valuemax')

print minValue

print maxValue

length =WebUI.getText(findTestObject('Object Repository/getText/Page_Vite  React  TS/getPrice'))


for( int i=1; i<=length.i;i++) {
	system.out.print(length)
}