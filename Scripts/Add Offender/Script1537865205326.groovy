import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('https://offshore-jail.azurewebsites.us')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Add Offender/Page_Sign in to your account/input_loginfmt'), 'Akhterul.mustafa@techsharegov.onmicrosoft.com')

WebUI.click(findTestObject('Add Offender/Page_Sign in to your account/input_idSIButton9'), FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Add Offender/Page_Sign in to your account/input_passwd'), '+mwF+4XtW79VM62BWTqiIg==')

WebUI.click(findTestObject('Add Offender/Page_Sign in to your account/input_idSIButton9'))

WebUI.mouseOver(findTestObject('Add Offender/Page_Dashboard/a_Offender'))

WebUI.click(findTestObject('Add Offender/Page_Dashboard/a_Add Offender'))

WebUI.setText(findTestObject('Add Offender/Page_Add Offender/input_LastName'), 'Lamje')

WebUI.setText(findTestObject('Add Offender/Page_Add Offender/input_FirstName'), 'Arti')

WebUI.setText(findTestObject('Add Offender/Page_Add Offender/input_MiddleName'), 'Test')

WebUI.click(findTestObject('Add Offender/Page_Add Offender/input_DateOfBirth'))

WebUI.setText(findTestObject('Add Offender/Page_Add Offender/input_DateOfBirth'), '11/06/1995')

WebUI.click(findTestObject('Add Offender/Page_Add Offender/span_Race'))

WebUI.setText(findTestObject('Add Offender/Page_Add Offender/Black__select2-search__field'), 'Black')

WebUI.sendKeys(findTestObject('Add Offender/Page_Add Offender/Black__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Add Offender/Page_Add Offender/span_Sex'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Add Offender/Page_Add Offender/Male__select2-search__field'), 'Male')

WebUI.sendKeys(findTestObject('Add Offender/Page_Add Offender/Male__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Add Offender/Page_Add Offender/span_Ethenicity'))

WebUI.setText(findTestObject('Add Offender/Page_Add Offender/Hispanic__select2-search__field'), 'Hispanic')

WebUI.sendKeys(findTestObject('Add Offender/Page_Add Offender/Hispanic__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Add Offender/Page_Add Offender/span_Skintone'))

WebUI.setText(findTestObject('Add Offender/Page_Add Offender/Fair__select2-search__field'), 'Fair')

WebUI.sendKeys(findTestObject('Add Offender/Page_Add Offender/Fair__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Add Offender/Page_Add Offender/input_HasRefused'))

WebUI.click(findTestObject('Add Offender/Page_Add Offender/button_Save'))

not_run: WebUI.closeBrowser()

