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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://vivblind.play2pay.me/volunteer/register')

WebUI.setText(findTestObject('add by aunz/Page_ -/input_ADDRESS_NO'), 'a')

WebUI.click(findTestObject('add by aunz/Page_ -/div_col-sm-2'))

WebUI.setText(findTestObject('add by aunz/Page_ -/input_ADDRESS_NO'), 'a')

WebUI.selectOptionByIndex(findTestObject('add by aunz/Page_ -/select_ADDRESS_SUBDISTRICT'), '9178', FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://vivblind.play2pay.me/volunteer/register')

WebUI.selectOptionByValue(findTestObject('add by aunz/Page_ - (1)/select_RELIGION'), 'พุทธ', true)

WebUI.selectOptionByValue(findTestObject('add by aunz/Page_ - (1)/select_CAREER'), 'เกษตรกร', true)

WebUI.selectOptionByValue(findTestObject('add by aunz/Page_ - (1)/select_ADDRESS_SUBDISTRICT'), '8888', true)

WebUI.closeBrowser()

WebUI.selectOptionByValue(findTestObject('add by aunz/Page_ -/select_ADDRESS_SUBDISTRICT'), '9181', true)

WebUI.selectOptionByValue(findTestObject('add by aunz/Page_ -/select_ADDRESS_SUBDISTRICT'), '9179', true)

WebUI.selectOptionByValue(findTestObject('add by aunz/Page_ -/select_ADDRESS_SUBDISTRICT'), '9183', true)

WebUI.closeBrowser()

WebUI.setText(findTestObject('test5/Page_ -/input_EMAIL'), 'woratorn.aun@mfu.ac.th')

WebUI.setText(findTestObject('test5/Page_ -/input_PASSWORD'), '123456')

WebUI.setText(findTestObject('test5/Page_ -/input_password_confirmation'), '123456')

WebUI.setText(findTestObject('test5/Page_ -/input_FIRST_NAME_TH'), 'นายจันทร์')

WebUI.setText(findTestObject('test5/Page_ -/input_LAST_NAME_TH'), 'อังคาร')

WebUI.setText(findTestObject('test5/Page_ -/input_FIRST_NAME_EN'), 'Jan')

WebUI.setText(findTestObject('test5/Page_ -/input_LAST_NAME_EN'), 'Ungkarn')

WebUI.doubleClick(findTestObject('test5/Page_ -/input_CITIZEN_ID'))

WebUI.setText(findTestObject('test5/Page_ -/input_BIRTH_DATE'), '06/09/1995')

WebUI.selectOptionByValue(findTestObject('test5/Page_ -/select_RELIGION'), 'อื่นๆ', true)

WebUI.selectOptionByValue(findTestObject('test5/Page_ -/select_EDUCATIONAL'), 'ต่ำกว่าปริญญาตรี', true)

WebUI.selectOptionByValue(findTestObject('test5/Page_ -/select_CAREER'), 'นักศึกษา', true)

WebUI.setText(findTestObject('test5/Page_ -/input_ADDRESS_NO'), '12')

WebUI.setText(findTestObject('test5/Page_ -/input_ADDRESS_MOO'), '4')

WebUI.setText(findTestObject('test5/Page_ -/input_ADDRESS_ROAD'), 'ถนน')

not_run: WebUI.click(findTestObject('test5/Page_ -/div_col-sm-2'), FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('test5/Page_ -/select_ADDRESS_SUBDISTRICT'), '8888', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('test5/Page_ -/input_ADDRESS_POSTCODE'), '10100')

WebUI.selectOptionByValue(findTestObject('test5/Page_ -/select_STATUS_EDU_WORK'), 'กำลังศึกษา', true)

WebUI.setText(findTestObject('test5/Page_ -/input_ADDRESS_ALL'), 'บ้าน')

WebUI.setText(findTestObject('test5/Page_ -/input_CELL_PHONE'), '0437776253')

WebUI.setText(findTestObject('test5/Page_ -/input_PHONE'), '053232522')

WebUI.click(findTestObject('test5/Page_ -/input_btn btn-primary'))

not_run: WebUI.closeBrowser()

