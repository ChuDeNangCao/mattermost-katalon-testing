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

WebUI.setText(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'xuanghjem')

WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'vR0tJW96iAE=')

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Thanh rename Channel - minh thuy Mattermost/div_Su'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/button_xuanghjem_style--none sidebar-header_5a1823'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/button_Advanced'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/span_Send messages on CTRLENTER'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/input_On only for code blocks starting with_89a4ae'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/button_Save'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/span_Enable Post Formatting'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/input_On_formatting'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/button_Save'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/span_Enable JoinLeave Messages'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/input_Enable JoinLeave Messages_joinLeave'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/h4_Preview pre-release features'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/span_Cancel'))

WebUI.click(findTestObject('Object Repository/data-driven/47_AdvancedSetting/Page_Town Square - Sun Mattermost/span_'))

WebUI.closeBrowser()

