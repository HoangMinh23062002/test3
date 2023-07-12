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

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/p_product (1)'))

WebUI.delay(5)

//

WebUI.setText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx (3)'),
	'Bún')

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/div_Local specialtys areasThe best offer th_178a87 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/button_2 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/button_3 (1)'))

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/button_bn_chakra-button css-fx3q01'))
//
//WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/button_bn_chakra-button css-fx3q01'))

//
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx (1)'),
	'Bánh Tráng 73')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/label_More than 800.000'))


//

WebUI.setText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx (1)'), 
  '@#$%^&*()')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/ErrosSearchMessage'), 'There is no result found with keyword: @#$%^&*()')

//

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/div_Local specialtys areasThe best offer th_ff2b61'))

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/label_More than 800.000'))

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/div_Local specialtys areasThe best offer th_421523'))

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/div_allKhMinhhonag'))

WebUI.delay(5)

//


WebUI.setText(findTestObject('Searching1/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx (1)'), ' 76543')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/ErrosSearchMessage'), 'There is no result found with keyword: 76543')

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/span_Filter_chakra-radio__control css-vtg3j9'))


//

WebUI.delay(5)

WebUI.setText(findTestObject('Searching1/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx (1)'), ' Chung Cake is a traditional cake of Vietnam. The cake implies gratitude of later generations to their forefather and hometown. Ingredients of Chung Cake include sticky rice, green bean, pork, dong leaves, and other additional spices as salt and pepper. Chung Cake is often made on traditional Tet Holiday of Vietnamese people and Hung King Festival (on the 10th day of the third lunar month). Chung Cake has the oldest history in traditional Vietnam cuisine. It is mentioned regularly in historical documents. The traditional cake has a significant position in the heart of Vietnamese people. The cake originated from a legend relating to Lang Lieu Prince, son of the 6th Hung King. The legend recalls the next generation about the national tradition. It is also a meaningful explanation and origin ')

WebUI.verifyElementText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/ErrosTooMuchCharacter'), 'Too many characters, Enter major again')


//


WebUI.delay(5)

WebUI.setText(findTestObject('Searching1/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx (1)'), ' Cá nục Lào')

WebUI.verifyElementText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/ErrosSearchMessage'), 'There is no result found with keyword: Cá nục Lào')

WebUI.delay(5)

//

WebUI.setText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx'), 
    '\' or 1=1--')

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/div_Local specialtys areasThe best offer th_178a87'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/p_There is no result found with keyword  or 11--'), 
    'There is no result found with keyword: \' or 1=1--')

//


WebUI.setText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx'), 
    '<script>alert("hihiihi")</script>')

WebUI.click(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/div_homeproductabout uscontact0Local specia_fa4591'))
WebUI.delay(5)
WebUI.verifyElementText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/p_Invalid searching keyword'), 
    'Invalid searching keyword')

//

WebUI.setText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/input_Minhhonag_chakra-input css-1pdm0hx'), 'b')
WebUI.delay(5)
WebUI.verifyElementText(findTestObject('Object Repository/Searching1/Page_Vite  React  TS/p_Searching keyword should be more than 1 letter'),
	'Searching keyword should be more than 1 letter')

WebUI.closeBrowser()


