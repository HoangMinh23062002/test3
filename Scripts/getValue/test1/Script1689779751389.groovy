import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5173')


WebUI.click(findTestObject('hmmm/Page_Vite  React  TS/p_product'))

def minVal, maxVal, getValue

String allPrice



WebUI.waitForElementPresent(findTestObject('Object Repository/test/minValue'), 20)

WebUI.delay(10)

 minVal = (WebUI.getAttribute(findTestObject('Object Repository/test/minValue'), 'aria-valuenow'))
 
 

 maxVal = (WebUI.getAttribute(findTestObject('Object Repository/test/maxValue'), 'aria-valuenow'))
 
def result = WebUI.getText(findTestObject('Object Repository/test/Price'))


for (int i =1 ; i <= 9; i++ ) {
	
	TestObject to = new TestObject()
	
	to.addProperty('xpath', ConditionType.EQUALS, "//*[@id=\"root\"]/div/div[2]/div/div[3]/div[2]/div[1]/div[" + i +"]/a/div/div/div/p ")
	
	println(WebUI.getText(to) )
}



 
// cắt bỏ chữ d
// convert từ sang int
// lưu vô mảng
// compare min max

