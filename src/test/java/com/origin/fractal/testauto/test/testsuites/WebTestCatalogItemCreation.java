package com.origin.fractal.testauto.test.testsuites;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.CatalogItemSteps;
import com.origin.fractal.testauto.steps.CustomizationRolesSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;
/* File Name: WebTestCatalogItemCreation.java
 * Purpose: Check for due date field in Catalog items -FR1-2770
 * Number of Testcases: 7
 * Created by: DivyaDharshini
 * Created on: 17-July-2020
 */

public class WebTestCatalogItemCreation extends FractalBaseWebTest {
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
		@Test(dataProvider = "browers", groups= {"pilot"}, enabled= true, description="")
		public void testCatalogCreation(String row, String strBrowserName) throws IOException {
			
			driver = BrowserFactory.getBrowser(strBrowserName);
			loginToContentAdmin(driver);
			CatalogItemSteps catalogsteps = new CatalogItemSteps(driver);
			CustomizationRolesSteps rolestep = new CustomizationRolesSteps(driver);
			catalogsteps.clickManageContents();
			catalogsteps.clickCatalogitem();
			//creation of Bundle
			catalogsteps.addBundle();
			catalogsteps.catalogTitle();
			catalogsteps.catalogCreation();
			catalogsteps.catalogSecondPage();
			Reporter.writeSummary("FR1-2770_CatalogitemTC_01,Creation of Bundle with duedate validation.," +catalogsteps.getResult() );
			//creation of learning path with both lbl
			catalogsteps.addLearnPath();
			catalogsteps.catalogTitle();
			catalogsteps.catalogCreation();
			catalogsteps.clickBothlbl();
			catalogsteps.catalogSecondPage();
			Reporter.writeSummary("FR1-2770_CatalogitemTC_02,Creation of Learningpath(Both) with duedate validation.," +catalogsteps.getResult() );
			//creation of resource
			catalogsteps.addResource();
			catalogsteps.catalogTitle();
			catalogsteps.catalogCreation();
			catalogsteps.catalogSecondPage();
			Reporter.writeSummary("FR1-2770_CatalogitemTC_03,Creation of Resource with duedate validation., " +catalogsteps.getResult() );
			//creation of podcast
			catalogsteps.addPodcast();
			catalogsteps.catalogTitle();
			catalogsteps.catalogCreation();
			catalogsteps.catalogSecondPage();
			Reporter.writeSummary("FR1-2770_CatalogitemTC_04,Creation of Podcast with duedate validation., " +catalogsteps.getResult() );
			//creation of course
			catalogsteps.addCourse();
			catalogsteps.catalogTitle();
			catalogsteps.courseCreation();
			Reporter.writeSummary("FR1-2770_CatalogitemTC_05,Creation of Course with duedate validation., " +catalogsteps.getResult() );
			rolestep.adminLogout();
			//user part commented as due date validation (content) is not present as of now.
		/*	login(driver);
			catalogsteps.bundleDueDateCheck();
			Reporter.writeSummary("FR1-2770_CatalogitemTC_06,Check for duedate Popup in user side., " +catalogsteps.getResult() );
			catalogsteps.bellNotificationDueCheck();
			Reporter.writeSummary("FR1-2770_CatalogitemTC_07,Check for bell notification for due date., " +catalogsteps.getResult() );
		*/	
		}
}