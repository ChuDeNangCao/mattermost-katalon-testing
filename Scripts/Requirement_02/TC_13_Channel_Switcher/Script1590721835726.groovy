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

WebUI.navigateToUrl('https://mattermost-cdnc.herokuapp.com/xuan-nghiem/channels/town-square')

WebUI.setText(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'xuanghjem')

WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'vR0tJW96iAE=')

WebUI.click(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Mattermost/span_Sign in'))



for(int i = 0; i< 2; i++) {
	WebUI.click(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Town Square - xuan nghiem Mattermost/span'))
	WebUI.click(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Town Square - xuan nghiem Mattermost/span_Account Settings'))
	WebUI.click(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Town Square - xuan nghiem Mattermost/button_Sidebar'))
	if(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Town Square - xuan nghiem Mattermost/span_Off')){
		WebUI.click(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Town Square - xuan nghiem Mattermost/span_Off'))
	} else {
		WebUI.click(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Town Square - xuan nghiem Mattermost/span_On'))
	}
	
	WebUI.click(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Town Square - xuan nghiem Mattermost/input_Channel Switcher_channelSwitcher'))
	
	WebUI.click(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Town Square - xuan nghiem Mattermost/span_Save'))
	
	WebUI.click(findTestObject('Object Repository/data-driven/13_Channel_Switcher/Page_Town Square - xuan nghiem Mattermost/span_'))
}

WebUI.closeBrowser()

