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

WebUI.click(findTestObject('TC_040/Menu_Daftar'))

WebUI.setText(findTestObject('TC_040/SetText_namaLengkapIbu'), 'Caterlina Angelina Putri')

WebUI.setText(findTestObject('TC_040/SetText_NomorHP'), '081282317906')

WebUI.setText(findTestObject('TC_040/SetText_Password'), 'P@ssw0rd')

WebUI.click(findTestObject('TC_040/apakah_ibu_sedang_hamil'))

WebUI.setText(findTestObject('TC_040/Nama_lengkap_anak'), 'Putri Angelina')

WebUI.click(findTestObject('TC_040/tanggal_lahir'))

WebUI.setText(findTestObject('TC_040/SetText_Tanggal_Lahir'), '20-08-1990', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC_040/btn_daftar'))

