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

WebUI.navigateToUrl('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Home (5)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Bank Manager Login (3)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Customers (3)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Delete (3)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Open Account (3)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Add Customer (3)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_First Name_form-control ng-pristine n_693e51 (2)'), 
    'jhbvcdf')

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Last Name_form-control ng-pristine ng_64913d (2)'), 
    'vfcd')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/input_Last Name_form-control ng-pristine ng_64913d (2)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Post Code_form-control ng-untouched n_322706 (2)'), 
    '65')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Add Customer_1 (3)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Add Customer (3)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_First Name_form-control ng-pristine n_693e51 (2)'), 
    'hgbf')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/form_First Name  Last Name  Post Code Add Customer'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Last Name_form-control ng-pristine ng_64913d (2)'), 
    'hbgf')

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Post Code_form-control ng-untouched n_322706 (2)'), 
    '654')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Add Customer_1 (3)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Open Account (3)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_XYZ Bank/select_---Customer Name---       Harry Pott_b5208d'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_XYZ Bank/select_---Currency---       Dollar      Pou_e54511 (3)'), 
    'Dollar', true)

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Process (3)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Open Account (3)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Customers (3)'))



WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Add Customer (3)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/input_First Name_form-control ng-pristine n_693e51 (2)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Home (5)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Customer Login (5)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/div_Your Name       ---Your Name---       R_8f8921'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_XYZ Bank/select_---Your Name---       Ron WeaslyAlbu_1ac8a0'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Login (5)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Deposit (5)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd (3)'), 
    '8')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Deposit_1 (5)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Withdrawl (5)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd (3)'), 
    '76')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Withdraw (4)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Transactions (2)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Reset'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Back (2)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Transactions (2)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Back (2)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Deposit (5)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd (3)'), 
    '87654376543')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Deposit_1 (5)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Withdrawl (5)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd (3)'), 
    '6543')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Withdraw (4)'))

WebUI.closeBrowser()
