import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.ArrayList;

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import org.apache.commons.lang3.StringUtils
import com.kms.katalon.core.util.KeywordUtil
WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5173')

WebUI.click(findTestObject('hmmm/Page_Vite  React  TS/p_product'))

def minVal, maxVal, getValue

String allPrice

WebUI.waitForElementPresent(findTestObject('Object Repository/test/minValue'), 20)

WebUI.delay(10)


 minVal = (WebUI.getAttribute(findTestObject('Object Repository/test/minValue'), 'aria-valuenow'))
 
 def myIntMin = minVal.toInteger()
 
 println(myIntMin.getClass())

 maxVal = (WebUI.getAttribute(findTestObject('Object Repository/test/maxValue'), 'aria-valuenow'))
 
 def myIntMax = maxVal.toInteger()
 
 println(myIntMax.getClass())
 
def result = WebUI.getText(findTestObject('Object Repository/test/Price'))

ArrayList<String> list = new ArrayList<String>();
for (int i =1 ; i <= 9; i++ ) {
	TestObject to = new TestObject()
	to.addProperty('xpath', ConditionType.EQUALS, "//*[@id=\"root\"]/div/div[2]/div/div[3]/div[2]/div[1]/div[" + i +"]/a/div/div/div/p ")
	list.add(WebUI.getText(to))
}
println(Arrays.toString(list));

def newArray = []
ArrayList<String> newList = list;
for (int i = 0; i < list.size(); i++) {
    String s = StringUtils.remove(list[i], ".").replaceAll("[₫]", "").trim()
   newArray.add(Integer.parseInt(s))
}

def resultValue = false
for(int r : newArray) {
	if (r >= myIntMin && r <= myIntMax) {
		resultValue = true
	}
}

KeywordUtil.logInfo(newArray.toString())

println(resultValue)


WebUI.closeBrowser()

 
// cắt bỏ chữ d
// convert từ sang int
// lưu vô mảng
// compare min max



