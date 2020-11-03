package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.UserInfoImportAndExportSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/*
 * File: WebTestUserInfoImportAndExport.java
 * Purpose: The Admin able to Import/Export the xlsx file (FR1-2356)
 * Number of Test cases: 07
 * Created by: Vigneshwaran R
 * Created on: 20-Oct-2020
 * Updated on: 03-Nov-2020
 */
public class WebTestUserInfoImportAndExport extends FractalBaseWebTest {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
	public void AdminImportExport(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		siteAdminLoginwithcookies(driver);
		UserInfoImportAndExportSteps adminSteps=new UserInfoImportAndExportSteps(driver);
		adminSteps.verifyDownloadTemplate();
		Reporter.writeSummary("FR1-2359_AdminImportExport_TC-001,Verify admin is able to download the sample template .xlsx file," +adminSteps.getResult());
		adminSteps.verifyUserRadioBtn();
		Reporter.writeSummary("FR1-2359_AdminImportExport_TC-002,Verify admin is able to select the user type," +adminSteps.getResult());	
		adminSteps.verifyUploadTemplate();
		Reporter.writeSummary("FR1-2359_AdminImportExport_TC-003,Verify admin is able to upload the template .xlsx file," +adminSteps.getResult());	
		adminSteps.verifyInvalidUploadTemplate();
		Reporter.writeSummary("FR1-2359_AdminImportExport_TC-004,Verify admin is able to see the warning message. When upload the invalid template .xlsx file," +adminSteps.getResult());	
		adminSteps.verifyExportTemplate();
		Reporter.writeSummary("FR1-2359_AdminImportExport_TC-005,Verify admin is able to Export the template .xlsx file," +adminSteps.getResult());	
		adminSteps.verifyBtnExportTemplate();
		Reporter.writeSummary("FR1-2359_AdminImportExport_TC-006,Verify admin is NOT able to Export the template .xlsx file. when the users list is Zero," +adminSteps.getResult());	
		adminSteps.DeleteUser();
		Reporter.writeSummary("FR1-2359_AdminImportExport_TC-007,Verify admin is able to delete the imported user," +adminSteps.getResult());	

	}
}