package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.ReportSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
public class WebTestReportsAdmin extends FractalBaseWebTest{
	
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "Verify whether a group name is present in the reports.")

public void WebTestAdminReports(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		wait(10);//added on august 16 2019
		menuSteps.clickMenu();
		ReportSteps reportSteps= new ReportSteps(driver);
		reportSteps.verifyGroupName();
		Reporter.writeSummary("TCID_017, Verify group name in the reports., " +  reportSteps.getResult() );
		
   }
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "Verify whether a group name is present in the reports.")

	public void WebTestAdminContentReports(String row, String strBrowserName) throws IOException {
			driver = BrowserFactory.getBrowser(strBrowserName);
			loginToContentAdmin(driver);
			MenuSteps menuSteps = new MenuSteps(driver);
			wait(10);
			menuSteps.clickMenu();
			ReportSteps reportSteps= new ReportSteps(driver);
			reportSteps.contentReport();
			Reporter.writeSummary("TCID_4351_Reports_01, User should be able to select the created catalog item and generate the detailed completion status report in on screen and in exported report , " +  reportSteps.getResult() );
			Reporter.writeSummary("TCID_4351_Reports_02, User can select catalog with assignment and view the count in both on-screen and export report, " +  reportSteps.getResult() );
			
		}
}