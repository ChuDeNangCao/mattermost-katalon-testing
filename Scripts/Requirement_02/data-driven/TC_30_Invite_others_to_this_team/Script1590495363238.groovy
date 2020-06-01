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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mattermost-cdnc.herokuapp.com/login')

WebUI.setText(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'vR0tJW96iAE=')

WebUI.click(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Mattermost/input_All team communication in one place s_703ef5'))

WebUI.setText(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'xuanghjem')

WebUI.click(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Town Square - minh thuy Mattermost/button_Invite others to this team'))

WebUI.click(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Town Square - minh thuy Mattermost/div_Add members'))

WebUI.setText(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Town Square - minh thuy Mattermost/input_Add members_react-select-2-input'), 
    inviteName)

WebUI.click(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Town Square - minh thuy Mattermost/div_xuanghjemTrng Quang LcNghiem ngao ngo'))

WebUI.click(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Town Square - minh thuy Mattermost/span_Invite Members'))

WebUI.click(findTestObject('Object Repository/data-driven/30_Invite_others_to_this_team/Page_Town Square - minh thuy Mattermost/span_Done'))

WebUI.closeBrowser()

