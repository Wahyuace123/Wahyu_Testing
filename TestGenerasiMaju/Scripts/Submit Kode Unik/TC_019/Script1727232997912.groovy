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

WebUI.openBrowser('https://www.generasimaju.co.id/klub-generasi-maju/submit-kode-unik')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Submit kode unik/TC_019/no_Hp'), '081282317906')

WebUI.setText(findTestObject('Submit kode unik/TC_019/kodeunik_1'), '1')

WebUI.setText(findTestObject('Submit kode unik/TC_019/kodeunik_2'), '2')

WebUI.setText(findTestObject('Submit kode unik/TC_019/kodeunik_3'), '3')

WebUI.setText(findTestObject('Submit kode unik/TC_019/kodeunik_4'), '4')

WebUI.setText(findTestObject('Submit kode unik/TC_019/kodeunik_5'), '5')

WebUI.setText(findTestObject('Submit kode unik/TC_019/kodeunik_6'), '6')

WebUI.setText(findTestObject('Submit kode unik/TC_019/kodeunik_7'), '7')

WebUI.setText(findTestObject('Submit kode unik/TC_019/kodeunik_8'), '8')

WebUI.setText(findTestObject('Submit kode unik/TC_019/kodeunik_9'), '9')

WebUI.setText(findTestObject('Submit kode unik/TC_019/kodeunik_10'), '10')

