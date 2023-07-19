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

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_product'))

WebUI.setText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/input_The best offer that we offer to the w_af0838'), 
    'Bún')

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_Local specialtys areasThe best offer th_96ccf5'))

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/img_by category_chakra-image css-lxd7e7'))

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/button_Reviews'))

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/button_Description'))

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/button_Reviews'))

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.doubleClick(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_Add to cart_swiper-button-next'))

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_Show more'))

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_Show less'))

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/svg_Add to cart_chakra-icon css-a7mwtc'))

WebUI.setText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/input_Add to cart_chakra-input css-108b1as'), 
    '23456789')

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_You item already in shopping cart'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_Successfully'), 0)

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_product'))

WebUI.setText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/input_The best offer that we offer to the w_af0838'), 
    'Bánh tráng 73')


WebUI.verifyElementText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_There is no result found with keyword Bnh_3d0075'), 
    'There is no result found with keyword: Bánh tráng 73')

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_The best offer that we offer to the wor_ba291f'))

WebUI.setText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/input_The best offer that we offer to the w_af0838'), 
    '@#$%^&*()')

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_Local specialtys areasThe best offer th_96ccf5'))

WebUI.verifyElementText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_There is no result found with keyword ()'), 
    'There is no result found with keyword: @#$%^&*()')

WebUI.setText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/input_The best offer that we offer to the w_af0838'), 
    '34567890')

WebUI.verifyElementText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_There is no result found with keyword 34567890'), 
    'There is no result found with keyword: 34567890')

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_Local specialtys areasThe best offer th_e97193'))

WebUI.setText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/input_The best offer that we offer to the w_af0838'), 
    ' Soaked the sticky rice overnight, then drain and shake with salt.  - Soak crushed mung beans in water for 2-4 hours, wash away the husks, cook,  grind, and shape them into fist-sized balls  - Cut the pork into squares and season them with salt, pepper, and minced onion.  - Place dong leaves on a flat surface; put a small bowl portion of rice on it, sprinkle on half of a mong bean ball, place 2 pork squares in the middle, sprinkle on the other half of the mung bean ball, and cover with another small bowl portion of rice. Fold the leaves over, wrap the cake into a square shape, and tie it with bamboo strings.  - Place cakes in a pot padded with dong leaf stalks, pour in enough water to submerge the cakes, and boil on high heat. As the water boils off, add enough to keep the cakes submerged. Boil continuously for 12 hours. After the cakes are taken from the pot, press them to remove excess water. Soaked the sticky rice overnight, then drain and shake with salt.  - Soak crushed mung beans in water for 2-4 hours, wash away the husks, cook,  grind, and shape them into fist-sized balls  - Cut the pork into squares and season them with salt, pepper, and minced onion.  - Place dong leaves on a flat surface; put a small bowl portion of rice on it, sprinkle on half of a mong bean ball, place 2 pork squares in the middle, sprinkle on the other half of the mung bean ball, and cover with another small bowl portion of rice. Fold the leaves over, wrap the cake into a square shape, and tie it with bamboo strings.  - Place cakes in a pot padded with dong leaf stalks, pour in enough water to submerge the cakes, and boil on high heat. As the water boils off, add enough to keep the cakes submerged. Boil continuously for 12 hours. After the cakes are taken from the pot, press them to remove excess water.')

WebUI.verifyElementText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_Too many characters, Enter major again'), 
    'Too many characters, Enter major again')

WebUI.setText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/input_The best offer that we offer to the w_af0838'), 
    '\' or 1=1--')

WebUI.click(findTestObject('Object Repository/Searching/Page_Vite  React  TS/div_Local specialtys areasThe best offer th_d9771b'))

WebUI.verifyElementText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_There is no result found with keyword  or 11--'), 
    'There is no result found with keyword: \' or 1=1--')

WebUI.setText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/input_The best offer that we offer to the w_af0838'), 
    '<script>alert("hihiihi")</script>')

WebUI.verifyElementText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_Invalid searching keyword'), 
    'Invalid searching keyword')

WebUI.setText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/input_The best offer that we offer to the w_af0838'), 
    'b')


WebUI.verifyElementText(findTestObject('Object Repository/Searching/Page_Vite  React  TS/p_Searching keyword should be more than 1 letter'), 
    'Searching keyword should be more than 1 letter')

WebUI.closeBrowser()
