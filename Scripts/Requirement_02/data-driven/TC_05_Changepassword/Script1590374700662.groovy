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

WebUI.navigateToUrl('https://mattermost-cdnc.herokuapp.com/xuan-nghiem-210/channels/town-square')

WebUI.setText(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'xuanghjem')

WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    password)

WebUI.click(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Town Square - Xun Nghim Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Town Square - Xun Nghim Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Town Square - Xun Nghim Mattermost/button_Security'))

WebUI.click(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Town Square - Xun Nghim Mattermost/span_Edit'))

WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Town Square - Xun Nghim Mattermost/input_Current Password_currentPassword'), 
    password)

WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Town Square - Xun Nghim Mattermost/input_New Password_newPassword'), 
    new_password)

WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Town Square - Xun Nghim Mattermost/input_Retype New Password_confirmPassword'), 
    retype_password)

WebUI.click(findTestObject('Object Repository/data-driven/05_Changepassword/Page_Town Square - Xun Nghim Mattermost/span_Save'))

WebUI.closeBrowser()

