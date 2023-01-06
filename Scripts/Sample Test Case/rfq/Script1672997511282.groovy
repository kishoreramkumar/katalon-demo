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

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/button_Sign in with Google'))

WebUI.setText(findTestObject('Object Repository/automate crawl/Page_Sign in  Google accounts/input_arisinfra.com_identifier'), 
    'kishore.r@arisinfra.one')

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Sign in  Google accounts/span_Next'))

WebUI.setText(findTestObject('Object Repository/automate crawl/Page_Sign in  Google accounts/input_Too many failed attempts_password'), 
    'Rkishore@2017')

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Sign in  Google accounts/span_Next'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Requirements'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Requirements/button_Add New'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/input__react-select-instance-id-project-input'))

WebUI.setText(findTestObject('Object Repository/automate crawl/Page_/input__react-select-instance-id-project-input'), 'Test Project')

WebUI.click(findTestObject('Object Repository/Project option'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div__select2-selection__input-container css-ackcql'))

WebUI.click(findTestObject('Object Repository/Select Customer option'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/svg__css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/Site address option'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/svg_Office Address - Test Address, , Bangalore Karnataka_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/Billing address option'))

WebUI.setText(findTestObject('Object Repository/automate crawl/Page_/input__estimatedDate'), '10/01/2023')

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/button_Add Item'))

WebUI.click(findTestObject('Add Requirement Actions/Page_/button_Save'))

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/div_Search and select'))

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/item category option'))

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/div_Search and select_select2-selection__input-container css-ackcql'))

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/item name option'))

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/div_Select Grade_select2-selection__input-container css-ackcql'))

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/item grade option'))

WebUI.setText(findTestObject('Object Repository/automate crawl/Add Requirement Actions/input__quantity'), '22')

WebUI.click(findTestObject('Page_/button_Save (2)'))

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/button_Generate RFQ'))

WebUI.click(findTestObject('Object Repository/automate crawl/Add Requirement Actions/button_Confirm'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app5.arisinfra.com:9443/login?redirect_uri=/')

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Sign in with Google'))

WebUI.setText(findTestObject('Object Repository/automate crawl/Page_Sign in  Google accounts/input_arisinfra.com_identifier'), 
    'kishore.r@arisinfra.one')

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Sign in  Google accounts/span_Next'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Sign in  Google accounts/div_Terms_ANuIbb IdAqtf'))

WebUI.setEncryptedText(findTestObject('Object Repository/automate crawl/Page_Sign in  Google accounts/input_Too many failed attempts_password'), 
    '+s/YOehuqTRclL6qxfEh7A==')

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Sign in  Google accounts/span_Next'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Requirements'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Requirements/button_Add New'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Search and select project_select2-selec_3d4045'))

WebUI.setText(findTestObject('Object Repository/automate crawl/Page_/input__react-select-instance-id-project-input'), 'test pro')

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Test Project'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div__select2-selection__input-container css-ackcql_1'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Test Customer'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Test Customer_1'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Search and select project_select2-selec_3d4045'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Test location Test Address'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Office Address - Test Address, , Bangal_8e7834'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Test Address, Bangalore, Karnataka'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/button_Save (2)'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/button_Add Item'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Search and select_select2-selection__in_46360a'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Steel'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Search and select'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_MS TMT Bar 12mm'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_Search and select_select2-selection__in_46360a'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/div_FE550D'))

WebUI.setText(findTestObject('Object Repository/automate crawl/Page_/input__quantity'), '23')

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/button_Save (2)'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/button_Generate RFQ'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_/button_Confirm'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Rfqs/div_Edit Draft'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Rfq Detail/button_Confirm Draft'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Rfq Detail/button_Send RFQ to vendors'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/button_Add vendor'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/div_Search and select vendor_select2-select_452e0a'))

WebUI.setText(findTestObject('Object Repository/automate crawl/Page_Send Rfq/input__react-select-instance-id-vendor-input'), 
    'test')

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/div_Test Vendor Legal'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/div_Search and select_select2-selection__in_46360a'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/div_Kishore, Purchase Officer'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/button_Save'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/button_Send'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/span_Yes_checkmark'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/span_Yes_checkmark'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/button_Save'))

WebUI.click(findTestObject('Object Repository/automate crawl/Page_Send Rfq/button_Confirm'))

