import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://vivblind.play2pay.me/volunteer/register')

WebUI.setText(findTestObject('Page_ -/input_EMAIL'), 'zequence1@gmail.com')

WebUI.setText(findTestObject('Page_ -/input_PASSWORD'), '123465')

WebUI.setText(findTestObject('Page_ -/input_password_confirmation'), '123456')

WebUI.setText(findTestObject('Page_ -/input_FIRST_NAME_TH'), 'วรทร')

WebUI.setText(findTestObject('Page_ -/input_LAST_NAME_TH'), 'ทองปัตย์')

WebUI.setText(findTestObject('Page_ -/input_FIRST_NAME_EN'), 'Woratorn')

WebUI.setText(findTestObject('Page_ -/input_LAST_NAME_EN'), 'Thongpat')

WebUI.click(findTestObject('Page_ -/th_September 2017'))

WebUI.click(findTestObject('Page_ -/th_2017'))

WebUI.click(findTestObject('Page_ -/th_'))

WebUI.click(findTestObject('Page_ -/th_'))

WebUI.click(findTestObject('Page_ -/th_'))

WebUI.click(findTestObject('Page_ -/span_1985'))

WebUI.click(findTestObject('Page_ -/span_Jun'))

WebUI.click(findTestObject('Page_ -/td_23'))

WebUI.selectOptionByValue(findTestObject('Page_ -/select_RELIGION'), 'พุทธ', true)

WebUI.selectOptionByValue(findTestObject('Page_ -/select_EDUCATIONAL'), 'ปริญญาตรี', true)

WebUI.selectOptionByValue(findTestObject('Page_ -/select_CAREER'), 'อื่นๆ', true)

WebUI.setText(findTestObject('Page_ -/input_ADDRESS_NO'), '58')

WebUI.setText(findTestObject('Page_ -/input_ADDRESS_MOO'), '5')

WebUI.setText(findTestObject('Page_ -/input_ADDRESS_ROAD'), 'กรรม')

WebUI.selectOptionByValue(findTestObject('Page_ -/select_ADDRESS_SUBDISTRICT'), '15131', true)

WebUI.setText(findTestObject('Page_ -/input_ADDRESS_POSTCODE'), '50000')

WebUI.selectOptionByValue(findTestObject('Page_ -/select_STATUS_EDU_WORK'), 'กำลังทำงาน', true)

WebUI.setText(findTestObject('Page_ -/input_ADDRESS_ALL'), 'บ้าน')

WebUI.setText(findTestObject('Page_ -/input_PHONE'), '3')

WebUI.doubleClick(findTestObject('Page_ -/input_PHONE'))

WebUI.setText(findTestObject('Page_ -/input_PHONE'), '3')

WebUI.doubleClick(findTestObject('Page_ -/input_PHONE'))

WebUI.setText(findTestObject('Page_ -/input_PHONE'), '-3')

WebUI.doubleClick(findTestObject('Page_ -/input_PHONE'))

WebUI.setText(findTestObject('Page_ -/input_PHONE'), '-27')

WebUI.doubleClick(findTestObject('Page_ -/input_PHONE'))

WebUI.setText(findTestObject('Page_ -/input_PHONE'), '-25')

WebUI.doubleClick(findTestObject('Page_ -/input_PHONE'))

WebUI.setText(findTestObject('Page_ -/input_PHONE'), '-27')

WebUI.doubleClick(findTestObject('Page_ -/input_PHONE'))

WebUI.setText(findTestObject('Page_ -/input_PHONE'), '-24')

WebUI.doubleClick(findTestObject('Page_ -/input_PHONE'))

WebUI.setText(findTestObject('Page_ -/input_PHONE'), '-27')

WebUI.doubleClick(findTestObject('Page_ -/input_PHONE'))

WebUI.setText(findTestObject('Page_ -/input_PHONE'), '-27')

WebUI.setText(findTestObject('Page_ -/input_CELL_PHONE (1)'), '1')

WebUI.setText(findTestObject('Page_ -/input_CELL_PHONE (1)'), '2')

WebUI.doubleClick(findTestObject('Page_ -/input_CELL_PHONE (1)'))

WebUI.setText(findTestObject('Page_ -/input_CELL_PHONE (1)'), '7')

WebUI.doubleClick(findTestObject('Page_ -/input_CELL_PHONE (1)'))

WebUI.setText(findTestObject('Page_ -/input_CELL_PHONE (1)'), '11')

WebUI.click(findTestObject('Page_ -/div_col-sm-2'))

WebUI.setText(findTestObject('Page_ -/input_CELL_PHONE (1)'), '1231234515')

WebUI.click(findTestObject('Page_ -/div_col-sm-2'))

WebUI.click(findTestObject('Page_ -/div_col-md-12'))

WebUI.click(findTestObject('Page_ -/div_col-sm-2'))

WebUI.setText(findTestObject('Page_ -/input_CELL_PHONE (1)'), '123123')

WebUI.click(findTestObject('Page_ -/div_col-sm-2'))

WebUI.setText(findTestObject('Page_ -/input_EMAIL'), 'zequence12@gmail.com')

WebUI.click(findTestObject('Page_ -/input_btn btn-primary'))

WebUI.setText(findTestObject('Page_ -/input_PASSWORD'), '123456789')

WebUI.setText(findTestObject('Page_ -/input_password_confirmation'), '123456789')

WebUI.click(findTestObject('Page_ -/div_col-sm-3'))

WebUI.setText(findTestObject('Page_ -/input_CELL_PHONE (1)'), '1234567894')

WebUI.click(findTestObject('Page_ -/input_btn btn-primary'))

WebUI.selectOptionByValue(findTestObject('Page_ -/select_ADDRESS_SUBDISTRICT'), '15133', true)

WebUI.setText(findTestObject('Page_ -/input_PASSWORD'), '123456789')

WebUI.setText(findTestObject('Page_ -/input_password_confirmation'), '123456789')

WebUI.click(findTestObject('Page_ -/input_btn btn-primary'))

WebUI.closeBrowser()

