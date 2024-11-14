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

WebUI.openBrowser('https://bebeclub.co.id')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('TC_014/menu_daftarbebeclub'))

WebUI.click(findTestObject('TC_014/uploadstruk'))

WebUI.setText(findTestObject('TC_014/nomorHpEditText'), '081282317906')

WebUI.click(findTestObject('TC_014/uploadFile'))

WebUI.delay(5)

String dirName = RunConfiguration.getProjectDir()

println('Project Directory: /Users/wahyurunnianto/Documents/MyDocs/2 copy.jpeg' + dirName)

WebUI.sendKeys(findTestObject('OR File Upload/Page_Multiple Uploads Sample/input_Upload multiple_File'), ((dirName + ' /Users/wahyurunnianto/Documents/MyDocs/2 copy.jpeg') + 
    dirName) + 'MyDocs/2 copy.jpeg')

WebUI.delay(10)

WebUI.closeBrowser()

