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
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('https://bebeclub.co.id/membership/login-otp')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('yyyyy/input_nomorHP'), '081282317906')

WebUI.click(findTestObject('yyyyy/btn_kirim kode'))

// Initialize WebDriver
WebDriver driver = DriverFactory.getWebDriver()

// Trigger the pop-up to appear (you may need to interact with the page, e.g., clicking a button to open the pop-up)
WebElement triggerPopupButton = driver.findElement(By.id("triggerPopupButton")) // Replace with actual button ID
triggerPopupButton.click()

// Wait for the pop-up to be visible
WebDriverWait wait = new WebDriverWait(driver, 10) // 10 seconds timeout
WebElement popupElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popupElementId"))) // Replace with actual popup ID

// Validate the presence of the pop-up message
assert popupElement.isDisplayed()
println("Pop-up is displayed")

// Find and click the 'X' button to close the pop-up
WebElement closeButton = popupElement.findElement(By.xpath("//div[@class='modal-sukses-otp-form_close']//img[@alt='close']")) // Replace with actual locator for the 'X' button
closeButton.click()

// Wait for the pop-up to disappear after clicking 'X'
wait.until(ExpectedConditions.invisibilityOf(popupElement))

// Validate that the pop-up is closed
assert !popupElement.isDisplayed()
println("Pop-up is closed")


WebUI.clickImage(findTestObject('yyyyy/pop up _message'))

