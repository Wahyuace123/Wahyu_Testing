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

WebUI.openBrowser('https://www.generasimaju.co.id/tools/cek-resiko-alergi')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Cek Kemungkinan si Kecil Tidak Cocok Susu Sapi/TC_016/field_namaAnak'), 'Ace')

WebUI.selectOptionByValue(findTestObject('Cek Kemungkinan si Kecil Tidak Cocok Susu Sapi/TC_016/btn_tanggal'), '31', true)

WebUI.selectOptionByValue(findTestObject('Cek Kemungkinan si Kecil Tidak Cocok Susu Sapi/TC_016/btn_bulan'), '12', true)

WebUI.selectOptionByValue(findTestObject('Cek Kemungkinan si Kecil Tidak Cocok Susu Sapi/TC_016/btn_tahun'), '2024', true)

WebUI.selectOptionByValue(findTestObject('Cek Kemungkinan si Kecil Tidak Cocok Susu Sapi/TC_016/btn_susuyangdikonsumsi'), 
    'FG4', true)

WebUI.click(findTestObject('Cek Kemungkinan si Kecil Tidak Cocok Susu Sapi/TC_016/btn_next'))

WebUI.click(findTestObject('Cek Kemungkinan si Kecil Tidak Cocok Susu Sapi/Kuisioner/kuisioner _1'))

WebUI.click(findTestObject('Cek Kemungkinan si Kecil Tidak Cocok Susu Sapi/Kuisioner/kuisioner_2'))

WebUI.click(findTestObject('Cek Kemungkinan si Kecil Tidak Cocok Susu Sapi/Kuisioner/kuisioner_3'))

