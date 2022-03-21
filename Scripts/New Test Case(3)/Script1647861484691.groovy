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

WebUI.openBrowser('https://strategicerpcloud.com/strategicerp/')

WebUI.setText(findTestObject('ERP-Login/Page_StrategicERP/input_Company Name  Web OTP_companyName'), 'loma')

WebUI.click(findTestObject('ERP-Login/Page_StrategicERP/input_What is a Web OTP_next_button'))

WebUI.setText(findTestObject('ERP-Login/Page_StrategicERP/input_Please enter username and password_loginNameTemp'), 'Chaitali.Dube')

WebUI.setText(findTestObject('ERP-Login/Page_StrategicERP/input_Please enter username_passwd'), '#Tester@22')

WebUI.click(findTestObject('ERP-Login/Page_StrategicERP/input_Forgot password_button'))

WebUI.closeBrowser()

