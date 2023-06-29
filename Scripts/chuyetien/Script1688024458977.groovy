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

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Home (4)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Bank Manager Login (2)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Open Account (2)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Add Customer (2)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_First Name_form-control ng-pristine n_693e51 (1)'), 
    'MInhh')

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Last Name_form-control ng-pristine ng_64913d (1)'), 
    'xzJU')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/input_Last Name_form-control ng-pristine ng_64913d (1)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Post Code_form-control ng-untouched n_322706 (1)'), 
    '76')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Add Customer_1 (2)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Open Account (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_XYZ Bank/select_---Customer Name---       Hermoine G_677498'), 
    '6', true)		

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_XYZ Bank/select_---Currency---       Dollar      Pou_e54511 (2)'), 
    'Pound', true)

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Process (2)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Add Customer (2)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Home (4)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Customer Login (4)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_XYZ Bank/select_---Your Name---       MInhh xzJU'), '6', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_XYZ Bank/select_---Your Name---       MInhh xzJU'), '6', 
    true)

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Login (4)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Deposit (4)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd (2)'), 
    '98765432')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Deposit_1 (4)'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Withdrawl (4)'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd (2)'), 
    '765')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Withdraw (3)'))

WebUI.closeBrowser()
