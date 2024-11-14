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

WebUI.openBrowser('https://bebeclub.co.id')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('TC_019/menu_uploadStruk'))

WebUI.click(findTestObject('TC_019/btn_upload_struk'))

'Passing the path of the file'
WebUI.uploadFile(findTestObject('TC_019/upload_struk'), '//Users//wahyurunnianto//Documents//MyDocs//2.1.png')

'Capturing the file name after upload and storing it in a variable'
FilePath = WebUI.getAttribute(findTestObject('TC_019/upload_struk'), 'value')

'Verifying the Actual path and Expected path of file'
WebUI.verifyMatch(FilePath, '//Users//wahyurunnianto//Documents//MyDocs//2.1.png', false)

