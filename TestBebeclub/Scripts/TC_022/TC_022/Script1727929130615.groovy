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

WebUI.openBrowser('https://bebeclub.co.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('TC_018/menu_masuk'))

WebUI.setText(findTestObject('TC_018/ussername'), '081282317906')

WebUI.setText(findTestObject('TC_018/password'), 'Wahyu123*')

WebUI.click(findTestObject('TC_018/btn_masuk'))

WebUI.click(findTestObject('TC_022/icon(x)'))

WebUI.click(findTestObject('TC_022/menu_akun'))

WebUI.click(findTestObject('TC_022/btn_editProfile'))

WebUI.setText(findTestObject('TC_022/setText_Name'), 'Putri')

WebUI.click(findTestObject('TC_022/tanggal_lahir'))

WebUI.click(findTestObject('TC_022/tanggal_1'))

WebUI.click(findTestObject('TC_022/btn_simpanInfo'))

