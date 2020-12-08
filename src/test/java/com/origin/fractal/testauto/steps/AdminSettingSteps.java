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
		result="PASSED";
		try { 
			settingpage.verifyCreateandDeleteCategory();		
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function: checkClassroomSettings()
	 * Purpose: check the Admin classroom settings
	 */
	public void checkClassroomSettings() {
		result="PASSED";
		try {
			settingpage.checkClassroomSettings();
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function: verifyAddandDeleteManageRole()
	 * Purpose: Add and delete the Manage Roles
	 */
	public void verifyAddandDeleteManageRole() {
		result="PASSED";
		try {
			settingpage.verifyAddandDeleteManageRole();
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function: verifyCurrency()
	 * Purpose: Verify the currency settings
	 */
	public void verifyCurrency() {
		result="PASSED";
		try {
			settingpage.verifyCurrency();
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function: verifyAddandDeleteLanguage()
	 * Purpose: Create and delete the language
	 */
	public void verifyAddandDeleteLanguage() {
		result="PASSED";
		try {
			settingpage.verifyAddandDeleteLanguage();
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function: verifyNotificationSettings()
	 * Purpose: verify the notification settings
	 */
	public void verifyNotificationSettings() {
		result="PASSED";
		try {
			settingpage.verifyNotificationSettings();
		}catch(Exception e) {
			result="FAILED";
		}
	}

	/* Function: verifyWhiteLabel()
	 * Purpose: verify the White label settings
	 */
	public void verifyWhiteLabel() {
		result="PASSED";
		try {
			settingpage.verifyWhiteLabel();
		}catch(Exception e) {
			result="FAILED";
		}
	}
}
