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

// Daftar username dan password
def users = [[('username') : '081282317906', ('password') : 'pass1'], [('username') : '081282317906', ('password') : 'pass2']
    , [('username') : '081282317906', ('password') : 'pass3']]

// Looping untuk setiap kombinasi login
for (def user : users) {
    WebUI.openBrowser('https://bebeclub.co.id/membership/login')

    // Navigasi ke halaman login
    WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('TC_007/noHp_EditText'), '081282317906')

    // Set password
    WebUI.setText(findTestObject('TC_007/password_EditText'), 'Wahyu123**')

    // Klik tombol login
    WebUI.click(findTestObject('newFolder/btn_Masuk'))

    // Verifikasi apakah login berhasil (disesuaikan dengan kondisi aplikasi)
    boolean loginSuccess = WebUI.verifyElementPresent(findTestObject('Page_Home/element_loggedIn'), 10, FailureHandling.CONTINUE_ON_FAILURE)

    if (loginSuccess) {
        println('Login berhasil untuk user: ' + (user['username']))
    } else {
        println('Login gagal untuk user: ' + (user['username']))
    }
    
    // Logout atau tutup browser untuk tes berikutnya
    WebUI.closeBrowser()
}

