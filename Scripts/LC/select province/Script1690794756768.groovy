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
WebUI.comment('Story: Book an appointment')
WebUI.navigateToUrl('http://localhost:5173/')

WebUI.click(findTestObject('Object Repository/privince/Page_Local Specialty/p_product'))

WebUI.click(findTestObject('Object Repository/privince/Page_Local Specialty/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/privince/Page_Local Specialty/svg_concat(Local specialty, , s areas)_chak_8d4b6a'))

WebUI.click(findTestObject('Object Repository/privince/Page_Local Specialty/button_Proceed to Checkout'))

WebUI.selectOptionByValue(findTestObject('Object Repository/privince/Page_Local Specialty/select_Select your provinceThnh ph H NiTnh _4299c3'), 
    '04', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/privince/Page_Local Specialty/select_Select your districtThnh ph Cao BngH_11cf5a'), 
    '043', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/privince/Page_Local Specialty/select_Select your wardTh trn Bo LcX Cc Png_13a651'), 
    '01327', true)

WebUI.click(findTestObject('Object Repository/privince/Page_Local Specialty/button_place order'))

