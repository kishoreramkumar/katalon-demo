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

WebUI.navigateToUrl('https://app5.arisinfra.com:9443/')

WebUI.click(findTestObject('Page_/button_Sign in with Google'))

WebUI.setText(findTestObject('Page_Sign in  Google accounts/input_arisinfra.com_identifier'), 'kishore.r@arisinfra.one')

WebUI.click(findTestObject('Page_Sign in  Google accounts/span_Next'))

WebUI.setText(findTestObject('Page_Sign in  Google accounts/input_Too many failed attempts_password'), 'Rkishore@2017')

WebUI.click(findTestObject('Page_Sign in  Google accounts/span_Next'))

WebUI.click(findTestObject('Page_/div_Requirements'))

WebUI.click(findTestObject('Page_Requirements/button_Add New'))

WebUI.click(findTestObject('Page_/input__react-select-instance-id-project-input'))

WebUI.setText(findTestObject('Page_/input__react-select-instance-id-project-input'), 'Test Project')

WebUI.click(findTestObject('Project option'))

WebUI.click(findTestObject('Page_/div__select2-selection__input-container css-ackcql'))

WebUI.click(findTestObject('Select Customer option'))

WebUI.click(findTestObject('Add Requirement Actions/Page_/div_Search and select site address_select2-selection__input-container css-ackcql'))

WebUI.click(findTestObject('Add Requirement Actions/Site address option'))

WebUI.click(findTestObject('Add Requirement Actions/Page_/div_Billing address_select2-selection__input-container css-ackcql'))

WebUI.click(findTestObject('Add Requirement Actions/Billing address option'))

WebUI.setText(findTestObject('Page_/input__estimatedDate'), '10/01/2023')

WebUI.click(findTestObject('Add Requirement Actions/Page_/button_Save'))

WebUI.click(findTestObject('Add Requirement Actions/button_Add Item'))

WebUI.click(findTestObject('Add Requirement Actions/div_Search and select'))

WebUI.click(findTestObject('Add Requirement Actions/item category option'))

WebUI.click(findTestObject('Add Requirement Actions/div_Search and select_select2-selection__input-container css-ackcql'))

WebUI.click(findTestObject('Add Requirement Actions/item name option'))

WebUI.click(findTestObject('Add Requirement Actions/div_Select Grade_select2-selection__input-container css-ackcql'))

WebUI.click(findTestObject('Add Requirement Actions/item grade option'))

WebUI.setText(findTestObject('Add Requirement Actions/input__quantity'), '22')

WebUI.click(findTestObject('Add Requirement Actions/Page_/Page_/button_Save'))

WebUI.click(findTestObject('Add Requirement Actions/button_Generate RFQ'))

WebUI.click(findTestObject('Add Requirement Actions/button_Confirm'))

