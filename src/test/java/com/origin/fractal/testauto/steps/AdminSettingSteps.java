package com.origin.fractal.testauto.steps;

import org.openqa.selenium.WebDriver;

import com.origin.fractal.testauto.FractalBaseStep;
import com.origin.fractal.testauto.pages.AdminSettingPage;
/* Created By: Vignesh
 * Created on: 30-Sep-20
 * FileName: AdminSettingSteps.java
 * Purpose: Testing - Admin setting side -step level code
 */
public class AdminSettingSteps extends FractalBaseStep{
	public AdminSettingPage settingpage=null;
	public AdminSettingSteps(WebDriver driver) {
		settingpage = new AdminSettingPage(driver);
	} 

	/* Function: verifyCreateandDeleteCategory()
	 * Purpose: Create and delete the Category
	 */
	public void verifyCreateandDeleteCategory() throws InterruptedException {
		result="FAILED";
		try { 
			settingpage.verifyCreateandDeleteCategory(); {
				result="PASSED";
			}
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function: checkClassroomSettings()
	 * Purpose: check the Admin classroom settings
	 */
	public void checkClassroomSettings() {
		result="FAILED";
		try {
			settingpage.checkClassroomSettings();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function: verifyAddandDeleteManageRole()
	 * Purpose: Add and delete the Manage Roles
	 */
	public void verifyAddandDeleteManageRole() {
		result="FAILED";
		try {
			settingpage.verifyAddandDeleteManageRole();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function: verifyCurrency()
	 * Purpose: Verify the currency settings
	 */
	public void verifyCurrency() {
		result="FAILED";
		try {
			settingpage.verifyCurrency();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function: verifyAddandDeleteLanguage()
	 * Purpose: Create and delete the language
	 */
	public void verifyAddandDeleteLanguage() {
		result="FAILED";
		try {
			settingpage.verifyAddandDeleteLanguage();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function: verifyNotificationSettings()
	 * Purpose: verify the notification settings
	 */
	public void verifyNotificationSettings() {
		result="FAILED";
		try {
			settingpage.verifyNotificationSettings();
			result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
	
	/* Function: verifyWhiteLabel()
	 * Purpose: verify the White label settings
	 */
	public void verifyWhiteLabel() {
		result="FAILED";
		try {
			settingpage.verifyWhiteLabel();
				result="PASSED";
		}catch(Exception e) {
			result="FAILED";
		}
	}
}
