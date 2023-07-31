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

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/p_product'))

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/img_Banh khoai chuoi_chakra-image css-lxd7e7'))

WebUI.doubleClick(findTestObject('Object Repository/checkout2/Page_Local Specialty/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/button_Add to cart'))

WebUI.click(findTestObject('checkout2/Page_Local Specialty/cart'))

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/button_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_First Name_first_name'), 'Minh')

WebUI.setText(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_Last Name_last_name'), 'Yuan')

WebUI.setText(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_Email_email'), 'Minh23@gmail.com')

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_Phone Number_phone'), '0367876543')

WebUI.selectOptionByValue(findTestObject('Object Repository/privince/Page_Local Specialty/select_Select your provinceThnh ph H NiTnh _4299c3'), 
    '04', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/privince/Page_Local Specialty/select_Select your districtThnh ph Cao BngH_11cf5a'), 
    '043', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/privince/Page_Local Specialty/select_Select your wardTh trn Bo LcX Cc Png_13a651'), 
    '01327', true)

WebUI.setText(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_Your Street_street'), '1010 b lê Hữu trác')

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/label_vnpay'))

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/button_place order'))

WebUI.delay(30)

WebUI.verifyElementPresent(findTestObject('Object Repository/checkout2/Page_Local Specialty/div_Full nameYuan Minhphone0367876543Order _9b7179'), 
    0)

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/button_reorder'))

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/label_cash'))

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/div_First NameLast NameEmailPhone Number'))

WebUI.setText(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_First Name_first_name'), 'Minh')

WebUI.setText(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_Last Name_last_name'), 'Yuan')

WebUI.setText(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_Email_email'), 'Minh23@gmail.com')

WebUI.setText(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_Phone Number_phone'), '0365876523')

WebUI.selectOptionByValue(findTestObject('Object Repository/privince/Page_Local Specialty/select_Select your provinceThnh ph H NiTnh _4299c3'), 
    '04', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/privince/Page_Local Specialty/select_Select your districtThnh ph Cao BngH_11cf5a'), 
    '043', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/privince/Page_Local Specialty/select_Select your wardTh trn Bo LcX Cc Png_13a651'), 
    '01327', true)


//WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/label_Your Street'))

WebUI.setText(findTestObject('Object Repository/checkout2/Page_Local Specialty/input_Your Street_street'), '1010 b lê Hữu trác')

WebUI.click(findTestObject('Object Repository/checkout2/Page_Local Specialty/button_place order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/checkout2/Page_Local Specialty/div_Full nameYuan Minhphone0365876523Order _a1dcf2'), 
    0)

