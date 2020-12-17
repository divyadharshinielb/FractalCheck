package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.UsageReportSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File name: WebTestUsageReport.java
 * Purpose: Check FR1-3400 & FR1-3401 user, usage report for Learning objects
 * Number of test cases:9
 * Created by: Vignesh R
 * Created on: 23-Nov-2020
 * Updated Date:2-Dec-2020
 */
public class WebTestUsageReport extends FractalBaseWebTest {
		@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "pilot"}, enabled = true,priority=0)
	public void TestUsageReport(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		login(driver);
		UsageReportSteps usageReport = new UsageReportSteps(driver);
		usageReport.gotoUsageReport();
		usageReport.verifyAllItemOption();
		Reporter.writeSummary("FR1-3400_UsageReport_TC-001,Verify the admin is able to generate the usage report for All catalog items option," +usageReport.getResult());
		usageReport.verifyExportBtnUsageReport();
		Reporter.writeSummary("FR1-3400_UsageReport_TC-002,Verify the usage report for All catalog item option Export button is active and clickable," +usageReport.getResult());
		usageReport.verifyLeastAccessedItemOption();
		Reporter.writeSummary("FR1-3400_UsageReport_TC-003,Verify the admin is able to generate the usage report for Least Accessed Item," +usageReport.getResult());
		usageReport.verifyExportBtnUsageReport();
		Reporter.writeSummary("FR1-3400_UsageReport_TC-004,Verify the usage report for Least Accessed Item option Export button is active and clickable," +usageReport.getResult());
		usageReport.verifyMostUsedItemOption();
		Reporter.writeSummary("FR1-3400_UsageReport_TC-005,Verify the admin is able to generate the usage report for Most Used Item," +usageReport.getResult());
		usageReport.verifyExportBtnUsageReport();
		Reporter.writeSummary("FR1-3400_UsageReport_TC-006,Verify the usage report for Most Used Item option Export button is active and clickable," +usageReport.getResult());
		usageReport.verifyUserReport();
		Reporter.writeSummary("FR1-3401_UserReport_TC-001,Verify the admin is able to generate the User Report with view count details," +usageReport.getResult());
		usageReport.verifyExportBtnUserReport();
		Reporter.writeSummary("FR1-3401_UserReport_TC-002,Verify the Export button is active and clickable in User Report," +usageReport.getResult());
		usageReport.verifyItemCount();
		Reporter.writeSummary("FR1-3401_UserReport_TC-003,Verify the admin is able to see the number of count in user report," +usageReport.getResult());
		
		}

}
