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

WebUI.navigateToUrl('http://demoaut.katalon.com/')

WebUI.click(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_4/amenu-toggle'))

WebUI.doubleClick(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_4/a_Login'))

WebUI.setText(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_4/input_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_4/input_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.doubleClick(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_4/input_password'))

WebUI.click(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_4/button_Login'))

WebUI.click(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_4/h2_Make Appointment'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut.katalon.com/')

WebUI.click(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/i_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/a_Login'))

WebUI.setText(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/input_username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/input_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.doubleClick(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/button_Login'))

WebUI.click(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/button_Book Appointment'))

WebUI.setText(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/input_visit_date'), 
    '')

WebUI.click(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/div_datepicker datepicker-dropdown dropdown_b23739'))

WebUI.setText(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/input_visit_date'), 
    '')

WebUI.click(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/button_Book Appointment'))

WebUI.setText(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/input_visit_date'), 
    '')

WebUI.click(findTestObject('Object Repository/SatrioAdiPrawiro-day5/Page_CURA Healthcare Service_5/div_datepicker datepicker-dropdown dropdown_b23739'))

