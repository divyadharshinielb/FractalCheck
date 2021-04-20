package com.origin.fractal.testauto.test.testsuites;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.CatalogItemSteps;
import com.origin.fractal.testauto.steps.CustomizationRolesSteps;
import com.origin.fractal.testauto.steps.HelpFractalSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestHelpSuite.java
 * Purpose: Check Help Link  - FR1-3780
 * Number of Testcases: 6
 * Created by: DivyaDharshini
 * Created on: 05-02-2021
 */

public class WebTestHelpSuite extends FractalBaseWebTest {
	//edited by divya from here
		@DataProvider
		public Object[][] browers() {
		if(BrowserFactory.getOS().equalsIgnoreCase("win")) {
			return new Object[][] {
				//new Object[] { "1", "msedge" }, 
				new Object[] { "2", "Chrome" },
				//new Object[] { "3", "Firefox" }
			};
		}
		
		if(BrowserFactory.getOS().equalsIgnoreCase("mac")) {
			return new Object[][] {
					new Object[] { "1", "safari" }
				};
		}
		return null;
		}//ended by divya
		@Test(dataProviderClass = DataManager.class,dataProvider="browers", groups= {"pilot"}, enabled= true, description="")
		public void testCatalogCreation(String row, String strBrowserName) throws IOException {
			
			driver = BrowserFactory.getBrowser(strBrowserName);
			login(driver);
	//		driver = BrowserFactory.getBrowser(strBrowserName);
			helpLink(driver);
			HelpFractalSteps helpStep = new HelpFractalSteps(driver);
			helpStep.learnerViewAllCheck();
			Reporter.writeSummary("TCID_Help_01, Verify the learner part in help link, " +  helpStep.getResult() );
			helpStep.instructorViewAllCheck();
			Reporter.writeSummary("TCID_Help_02, Verify the Instructor part in help link, " +  helpStep.getResult() );
			helpStep.siteAdminAccountCheck();
			Reporter.writeSummary("TCID_Help_03, Verify the Site Admin account part in help link, " +  helpStep.getResult() );
			helpStep.siteAdminSettingCheck();
			Reporter.writeSummary("TCID_Help_04, Verify the site Admin settings part in help link, " +  helpStep.getResult() );
		    helpStep.siteAdminClassroomCheck();
			Reporter.writeSummary("TCID_Help_05, Verify the site Admin classroom part in help link, " +  helpStep.getResult() );
			helpStep.siteAdminReportsCheck();
			Reporter.writeSummary("TCID_Help_06, Verify the site Admin Reports part in help link, " +  helpStep.getResult() );
			driver.quit();
		}
}
