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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mattermost-cdnc.herokuapp.com/login')

WebUI.setText(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'xuanghjem')

WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'vR0tJW96iAE=')

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Thanh rename Channel - minh thuy Mattermost/div_Su'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/button_xuanghjem_style--none sidebar-header_5a1823'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/button_Notifications'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/h4_Desktop notifications'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/label_Never'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/h4_Email notifications'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/span_Cancel'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/h4_Mobile push notifications'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/span_Cancel'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/h4_Words that trigger mentions'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/input_concat(Your non-case sensitive userna_46bbcd'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/h4_Reply notifications'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/label_Trigger notifications on messages in _3c6410'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/data-driven/46_NotificationSetting/Page_Town Square - Sun Mattermost/span_'))

WebUI.closeBrowser()

