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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('https://www.nutriclub.co.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('UploadStruk/menu_Uploadstruk'))

WebUI.setText(findTestObject('UploadStruk/nomorHp_EditText'), '081282317906')

WebUI.click(findTestObject('UploadStruk/upload_struk'))

WebUI.delay(5)

String dirName = RunConfiguration.getProjectDir()

println('Project Directory: /Users/wahyurunnianto/Documents/MyDocs/2 copy.jpeg' + dirName)

WebUI.sendKeys(findTestObject('OR File Upload/Page_Multiple Uploads Sample/input_Upload multiple_File'), ((dirName + ' /Users/wahyurunnianto/Documents/MyDocs/2 copy.jpeg') + 
    dirName) + 'MyDocs/2 copy.jpeg')

String filePath = ' /Users/wahyurunnianto/Documents/MyDocs/2 copy.jpeg'

// Verifikasi bahwa elemen input sudah memiliki nilai file path yang benar
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/FileUploadInput'), 'value', filePath, 10)

WebUI.delay(10)

WebUI.closeBrowser()

