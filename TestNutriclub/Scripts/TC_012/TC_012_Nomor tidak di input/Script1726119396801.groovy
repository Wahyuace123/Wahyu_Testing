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

WebUI.openBrowser('https://www.nutriclub.co.id/membership/register?referrer=shop')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Daftar/usernameSetText'), 'kiki')

WebUI.setText(findTestObject('Daftar/nomoHpSetText'), '')

WebUI.setText(findTestObject('Daftar/passwordSetText'), 'Kiki123**')

WebUI.click(findTestObject('Daftar/kondisimama'))

WebUI.click(findTestObject('Daftar/list_kondisimama'))

WebUI.click(findTestObject('Daftar/Cockieceklis'))

WebUI.click(findTestObject('Daftar/btn_Daftar'))


