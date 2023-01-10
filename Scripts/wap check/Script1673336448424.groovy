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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.comment('Story: Verify correct alarm message')

Mobile.comment('Given that user has started an application')

Mobile.startExistingApplication('com.whatsapp')

Mobile.tap(findTestObject('wap sample/Whats app bot'), 0)

'Get Device Height and Store in device_height variable'
wap_device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
wap_device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int wap_startX = wap_device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int wap_endX = wap_startX

'Storing the startY value'
int wap_startY = wap_device_Height * 0.30

'Storing the endY value'
int wap_endY = wap_device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(wap_startX, wap_endY, wap_endX, wap_startY)

Mobile.tap(findTestObject('Object Repository/wap sample/android.widget.TextView -   Submit'), 0)

def publicLink = Mobile.getText(findTestObject('wap sample/android.widget.TextView link text'), 0)

Mobile.tap(findTestObject('Object Repository/wap sample/android.widget.Button - CONTINUE'), 0)

Mobile.tap(findTestObject('Object Repository/wap sample/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/wap sample/android.widget.Button -'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.KEYCODE_4)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_5)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_6)

driver.pressKeyCode(AndroidKeyCode.BACK)

'Get Device Height and Store in device_height variable'
public_device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
public_device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int public_startX = public_device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int public_endX = public_startX

'Storing the startY value'
int public_startY = public_device_Height * 0.30

'Storing the endY value'
int public_endY = public_device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(public_startX, public_endY, public_endX, public_startY)

Mobile.tap(findTestObject('Object Repository/wap sample/android.widget.Button - Submit'), 0)

Mobile.tap(findTestObject('Object Repository/wap sample/android.widget.Button - Yes'), 0)

Mobile.closeApplication()

