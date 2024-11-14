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

WebUI.openBrowser('https://www.generasimaju.co.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('CodeUnik_TC04/codeunik'))

WebUI.setText(findTestObject('CodeUnik_TC04/no_HP'), '081282317906')

WebUI.setText(findTestObject('CodeUnik_TC04/input code Unik/code01'), '1')

WebUI.setText(findTestObject('CodeUnik_TC04/input code Unik/code02'), '2')

WebUI.setText(findTestObject('CodeUnik_TC04/input code Unik/code03'), '3')

WebUI.setText(findTestObject('CodeUnik_TC04/input code Unik/code04'), '4')

WebUI.setText(findTestObject('CodeUnik_TC04/input code Unik/code05'), '5')

WebUI.setText(findTestObject('CodeUnik_TC04/input code Unik/code06'), '2')

WebUI.setText(findTestObject('CodeUnik_TC04/input code Unik/code07'), '2')

WebUI.setText(findTestObject('CodeUnik_TC04/input code Unik/code08'), '1')

WebUI.setText(findTestObject('CodeUnik_TC04/input code Unik/code09'), '7')

WebUI.setText(findTestObject('CodeUnik_TC04/input code Unik/code10'), '4')

WebUI.setText(findTestObject('CodeUnik_TC04/code_Voucher'), 'Bunda')

WebUI.click(findTestObject('CodeUnik_TC04/btn_lanjut'))

