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

WebUI.navigateToUrl('https://107d-sg-studio.teleows.com/dspcas/login?service=https%3A%2F%2F107d-sg-studio.teleows.com%2Fportal%2Fweb%2Frest%2Fsso%2Findex%3Fori_url%3Dhttps%253A%252F%252F107d-sg-studio.teleows.com%252Fportal-web%252Fportal%252Fhomepage.html')

WebUI.setText(findTestObject('login/username_field', [('variable') : 'idcbr.sitih']), 'idcbr.sitih')

WebUI.setText(findTestObject('login/password_field'), 'testing123$')

WebUI.click(findTestObject('login/login_button'))

WebUI.verifyElementText(findTestObject('login/username_verifyAfterLogin'), 'idcbr.sitih')

WebUI.closeBrowser()

