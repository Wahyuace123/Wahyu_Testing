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

WebUI.openBrowser('https://www.generasimaju.co.id/tools/kalkulator-kehamilan')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Kalkulator kehamilan/TC_015_pilih tanggal/field_HPHT'))

WebUI.click(findTestObject('Kalkulator kehamilan/TC_015_pilih tanggal/btn_tanggal'))

WebUI.click(findTestObject('Kalkulator kehamilan/TC_015_pilih tanggal/tanggal_31'))

WebUI.click(findTestObject('Kalkulator kehamilan/TC_015_pilih tanggal/btn_bulan'))

WebUI.click(findTestObject('Kalkulator kehamilan/TC_015_pilih tanggal/bulan_Desember'))

WebUI.click(findTestObject('Kalkulator kehamilan/TC_015_pilih tanggal/btn_tahun'))

WebUI.click(findTestObject('Kalkulator kehamilan/TC_015_pilih tanggal/tahun_2028'))

WebUI.click(findTestObject('Kalkulator kehamilan/TC_015_pilih tanggal/btn_simpan'))

WebUI.click(findTestObject('Kalkulator kehamilan/TC_015_pilih tanggal/btn_mulai_disini'))

