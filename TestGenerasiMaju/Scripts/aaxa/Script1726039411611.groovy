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

WebUI.navigateToUrl('https://www.generasimaju.co.id/')

WebUI.click(findTestObject('Object Repository/hhh/Page_Pusat Informasi untuk Dukung Tumbuh Ke_0e822a/a_Daftar'))

WebUI.setText(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/input_Nama Lengkap_firstname'), 'ggg')

WebUI.setText(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/input_Nomor Ponsel_msisdn'), '081282317906')

WebUI.setEncryptedText(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/input_Password_password'), 
    '1weX/veqtQI=')

WebUI.click(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/i_Password_fa fa-eye-slash toggle-password-_7adcac'))

WebUI.setText(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/input_Password_password_1'), 'ica123*Q')

WebUI.click(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/div_Kondisi Bunda'))

WebUI.click(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/div_Tidak Hamil'))

WebUI.click(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/input_Format tanggal lahir salah_is_code_re_8935c4'))

WebUI.click(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/input_Format tanggal lahir salah_is_code_re_8935c4'))

WebUI.click(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/input_Format tanggal lahir salah_is_code_re_8935c4'))

WebUI.click(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/label_Kode Referral'))

WebUI.click(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/div_Saya telah membaca Kebijakan Privasi da_c2cad4'))

WebUI.click(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/input_Saya telah membacadan_sayasetuju'))

WebUI.click(findTestObject('Object Repository/hhh/Page_Daftar Klub Generasi Maju SGM/button_Daftar'))

