package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.MenuSteps;
import com.origin.fractal.testauto.steps.ReportSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
public class WebTestReportsAdmin extends FractalBaseWebTest{
	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
			new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" }
//		, new Object[] { "3", "msedge" } 
//		 new Object[] { "4", "ie11" }
		};
	}
	
	@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description = "Verify whether a group name is present in the reports.")
	

public void WebTestAdminReports(String row, String strBrowserName) {
		driver = BrowserFactory.getBrowser(strBrowserName);
		loginToContentAdmin(driver);
		MenuSteps menuSteps = new MenuSteps(driver);
		menuSteps.clickMenu();
	   ReportSteps reportSteps= new ReportSteps(driver);
		reportSteps.verifyGroupName();
		Reporter.writeSummary("TCID_017, Verify group name in the reports., " +  reportSteps.getResult() );
   }
}