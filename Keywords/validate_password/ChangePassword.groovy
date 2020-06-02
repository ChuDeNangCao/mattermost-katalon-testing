package validate_password

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ChangePassword {
	@Keyword
	public void getPassword() {
		for(int i=0; i< 3; i++){
			WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/11_ValidatePassword/Page_Town Square - xuan nghiem Mattermost/input_Current Password_currentPassword'),
					'vR0tJW96iAE=')
			if(i==0){

				WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/11_ValidatePassword/Page_Town Square - xuan nghiem Mattermost/input_New Password_newPassword'),
						"HeCM15nHKBI=")
				WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/11_ValidatePassword/Page_Town Square - xuan nghiem Mattermost/input_Retype New Password_confirmPassword'),
						"HeCM15nHKBI=")
			} else {
				WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/11_ValidatePassword/Page_Town Square - xuan nghiem Mattermost/input_New Password_newPassword'),
						"vR0tJW96iAE=")
				WebUI.setEncryptedText(findTestObject('Object Repository/data-driven/11_ValidatePassword/Page_Town Square - xuan nghiem Mattermost/input_Retype New Password_confirmPassword'),
						"vR0tJW96iAE=")
			}


			WebUI.click(findTestObject('Object Repository/data-driven/11_ValidatePassword/Page_Town Square - xuan nghiem Mattermost/span_Save'))

			if (i==1) {
				System.out.print('password valid in case 2')
				return;
			}
		}
	}
}
