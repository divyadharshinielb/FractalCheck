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
}