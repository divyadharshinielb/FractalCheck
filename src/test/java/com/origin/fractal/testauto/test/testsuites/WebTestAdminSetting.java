package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.AdminSettingSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

/* Created By: Vignesh
 * Created on: 30-Sep-20
 * FileName: WebTestAdminSetting.java
 * Purpose: Testing - Admin setting side - Dashboard tasks
 * Number of Test cases: 07
 */
public class WebTestAdminSetting extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot" }, enabled = true)
	public void AdminSetting(String row, String strBrowserName) throws InterruptedException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		AdminSettingSteps adminsettings=new AdminSettingSteps(driver);
		siteAdminLoginwithcookies(driver); 
		adminsettings.verifyWhiteLabel();
		Reporter.writeSummary("OKA32-4_Admin_White labeling_TC-001, Verify Admin is able to configure the branding details in white labeling," +  adminsettings.getResult());	adminsettings.verifyCreateandDeleteCategory();
		Reporter.writeSummary("FR-55_Admin_ManageCategory_TC-001, Verify Admin is able to create and delete the categories," +  adminsettings.getResult()); 
		adminsettings.checkClassroomSettings();
		Reporter.writeSummary("FR-121_Admin_ClassroomSettings_TC-001, Verify Admin is configuring the details for classroom.," +  adminsettings.getResult()); 
		adminsettings.verifyCurrency();
		Reporter.writeSummary("OKA32-8_Admin_Currency_TC-001, Verify Admin is able to configure the currency for application from currency section," +  adminsettings.getResult()); 
		adminsettings.verifyAddandDeleteLanguage();
		Reporter.writeSummary("OKA32-7_Admin_Language_TC-001, Verify Admin is able to add and delete language in application," +  adminsettings.getResult()); 
		adminsettings.verifyNotificationSettings();
		Reporter.writeSummary("OKA32-6_Admin_Notification_TC-001, Verify Admin is able to configure the notifications from settings," +  adminsettings.getResult()); 
		adminsettings.verifyAddandDeleteManageRole();
		Reporter.writeSummary("FR1-2019_Admin_Create Role_TC-001, Verify Admin is able to create a new role.," +  adminsettings.getResult()); 
	}
}
