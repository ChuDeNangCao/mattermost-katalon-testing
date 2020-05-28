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

WebUI.setText(findTestObject('data-driven/49_DisplaySetting/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'xuanghjem')

WebUI.setEncryptedText(findTestObject('data-driven/49_DisplaySetting/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'vR0tJW96iAE=')

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Thanh rename Channel - minh thuy Mattermost/div_Su'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/svg'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Account Settings'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/button_Display'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/div_ThemeEdit'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/img_Mattermost_img-responsive'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Save'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Clock Display'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/label_24-hour clock (example 1600)'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Save'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Teammate Name Display'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/label_Show nickname if one exists otherwise_1e5f83'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Save'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Default appearance of image previews'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Cancel'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Message Display'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Cancel'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Channel Display'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Cancel'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_Language'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/button_Save'))

WebUI.click(findTestObject('data-driven/49_DisplaySetting/Page_Town Square - Sun Mattermost/span_'))

WebUI.closeBrowser()

