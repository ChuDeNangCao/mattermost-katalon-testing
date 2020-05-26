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

WebUI.setText(findTestObject('data-driven/33_Edit_channel_purpose/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'xuanghjem')

WebUI.setEncryptedText(findTestObject('data-driven/33_Edit_channel_purpose/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'vR0tJW96iAE=')

WebUI.sendKeys(findTestObject('data-driven/33_Edit_channel_purpose/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('data-driven/33_Edit_channel_purpose/Page_Thanh rename Channel - minh thuy Mattermost/span_Thanh rename Channel_channelHeaderDrop_f0ebc7'))

WebUI.click(findTestObject('data-driven/33_Edit_channel_purpose/Page_Thanh rename Channel - minh thuy Mattermost/span_Edit Channel Purpose'))

WebUI.setText(findTestObject('data-driven/33_Edit_channel_purpose/Page_Thanh rename Channel - minh thuy Mattermost/textarea_Thanh edit channel purpos'), 
    channelPurpose)

WebUI.click(findTestObject('data-driven/33_Edit_channel_purpose/Page_Thanh rename Channel - minh thuy Mattermost/span_Save'))

