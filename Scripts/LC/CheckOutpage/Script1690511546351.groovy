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

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/p_product'))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/img_by category_chakra-image css-lxd7e7'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Add to cart_chakra-input css-dpyc48'), 
    '1234567')

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_SuccessfullyYou item already in shopping cart'), 
    0)

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/button_Buy now'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Banh khoai ba Kha_chakra-input css-10tbmt2'), 
    'blackfriday')

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/button_apply'))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_SuccessfullyYour Coupon is applied succ_992caa'), 
    0)

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/button_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/button_place order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_First Name is required'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Last Name is required'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Email is required'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Phone is required'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Province is required'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_District is required'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Ward is required'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Address is required'), 0)

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'), 'chung ta rat tuyej,. vpifwh')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'), Keys.chord(Keys.DELETE))

WebUI.clearText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_First Name can not include numbers and _fa2194'), 
    0)

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), 'chung ta rat , tuywrj')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), Keys.chord(Keys.DELETE))

//WebUI.clearText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Last Name can not include number and sp_257390'), 
    0)


WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), 'chung ta rat tuyejt voue .')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.DELETE))

//WebUI.clearText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Please input vaild email'), 
    0)


WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/h2_Presonal details'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'), '')

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), 'chung ta rat , tuywrj')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), Keys.chord(Keys.DELETE))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), '')

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Phone Number_phone'), '')

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_01Presonal details'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), '')

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'), '@#$%^&*(')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), '@#$%^&*()_')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), '@#$%^&*()_')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.DELETE))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_First Name can not include numbers and _fa2194'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Last Name can not include number and sp_257390'), 
    0)

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Please input vaild email'))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Please input vaild email'), 
    0)

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Phone Number_phone'), '')

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Phone is required'), 0)

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/h2_01'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'), 'Minh')

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_checkout01Presonal detailsFirst NameLas_f3258d'))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_First Name_first_name'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Last Name_last_name'), 'Tuan')

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_checkout01Presonal detailsFirst NameLas_6c8f61'))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Phone Number_phone'), '0246283628')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Phone Number_phone'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Phone Number_phone'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), '@#$%^&*()_')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.DELETE))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Phone Number_phone'), '0346283628')

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Phone Number'))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_01Presonal details'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), '@#$%^&*()_')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.DELETE))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Please input vaild email'), 
    0)

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_01Presonal details'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), 'minhhoang23.com')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.DELETE))


WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), 0)

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_01Presonal details'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), 'minhhoang23.com')
WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.DELETE))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_01Presonal details'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), 'minh hoang23A@.xom')

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.DELETE))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Please input vaild email'), 
    0)

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_01Presonal details'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), 'minh@.gmail.com')
WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.DELETE))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Please input vaild email'), 
    0)

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_01Presonal details'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), '@minh.com')
WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), Keys.chord(Keys.DELETE))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Please input vaild email'), 
    0)
WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), '')

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_01Presonal details'))

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Email_email'), 'minh23@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/CheckOUt/Page_Local Specialty/select_Select your provinceThnh ph H NiTnh _4299c3 (1)'),
	'04', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CheckOUt/Page_Local Specialty/select_Select your districtThnh ph Cao BngH_11cf5a'),
	'045', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CheckOUt/Page_Local Specialty/select_Select your wardTh trn Thng NngX Cn _70b725'),
	'01378', true)

WebUI.setText(findTestObject('Object Repository/testcoi/Page_Local Specialty/input_Your Street_street'), '101b lê hữu trác')

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_homeproductabout uscontact1checkout01Pr_df77c7'))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/button_place order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Choose your payment method'), 
    0)

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/label_cash'))

WebUI.click(findTestObject('Object Repository/testcoi/Page_Local Specialty/button_place order'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Object Repository/testcoi/Page_Local Specialty/div_Full nameTuan Minhphone0346283628Order _7db2db'), 
    0)
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


WebUI.closeBrowser()
