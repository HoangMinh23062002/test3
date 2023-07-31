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

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/p_product'))

WebUI.setText(findTestObject('Object Repository/Cart/Page_Vite  React  TS/input_The best offer that we offer to the w_af0838'), 
    'Bún')

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/img_by category_chakra-image css-lxd7e7'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/p_Show more'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/p_Pellentesque habitan morbi tristiquePelle_e1746d'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/p_Show less'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Add to cart_css-148p1cq'))

WebUI.setText(findTestObject('Object Repository/Cart/Page_Vite  React  TS/input_Add to cart_chakra-input css-108b1as'), 
    '2345678')

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_You item already in shopping cart'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Successfully'), 0)

WebUI.doubleClick(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.doubleClick(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Reviews'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Description'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/svg_Add to cart_chakra-icon css-1ev3uyk'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_bn bn_chakra-button css-1cquxk8'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/Cart/Page_Vite  React  TS/input_bn bn_chakra-input css-1868lrh'), 
    'blackfriday')


WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_apply'))
//WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Your Coupon is applied successfully'),
//	0)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_Successfully'), 0)

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/p_- 1'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/svg_apply_chakra-icon css-onkibi'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_bn bn_chakra-button css-1cquxk8'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Yes'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_OK'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Back to shop'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Buy now'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Proceed to Checkout'))


WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_23'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Cart/Page_Vite  React  TS/select_all NgtKh'), '15', 
    true)

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/img_Banh khoai deo_chakra-image css-lxd7e7'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Buy now'))


//WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/Cart/Page_Vite  React  TS/input_bn bn_chakra-input css-1868lrh'), 
    'eetyu')

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_apply'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/Page_Vite  React  TS/p_Your coupon is invalid'), 
  0)

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_homeproductabout uscontact0Shopping car_242c25'))

WebUI.setText(findTestObject('Object Repository/Cart/Page_Vite  React  TS/input_bn bn_chakra-input css-1868lrh'), 
    'tyuioghjkl')


WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/div_homeproductabout uscontact0Shopping car_242c25'))



WebUI.setText(findTestObject('Object Repository/Cart/Page_Vite  React  TS/input_bn bn_chakra-input css-1868lrh'), 
    'blackfriday')

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_apply'))



WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Clean Cart'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_Yes'))

WebUI.click(findTestObject('Object Repository/Cart/Page_Vite  React  TS/button_OK'))

WebUI.closeBrowser()
