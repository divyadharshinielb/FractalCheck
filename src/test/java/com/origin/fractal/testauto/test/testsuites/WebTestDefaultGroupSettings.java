package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.DefaultGroupSettingsSteps;
import com.origin.fractal.testauto.steps.InstructorModuleSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class WebTestDefaultGroupSettings extends FractalBaseWebTest {



	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
		new Object[] { "1", "chrome" }
//		, new Object[] { "2", "firefox" },
//		 new Object[] { "3", "msedge" } ,
//		 new Object[] { "4", "ie11" }
		};
	}
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,priority=1,
			// description="Verify categories are available as expected" )
			description = "")
	public void DefaultGroupSettingstestInstructorPage(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		DefaultGroupSettingsSteps defaultGroupSettingsSteps = new DefaultGroupSettingsSteps(driver);
		
		//		loginToContentAdmin(driver); // commented by vignesh 30-Nov-20
		siteAdminLogin(driver);//Added by vignesh on 30- Nov-20
		// Added by vignesh
		defaultGroupSettingsSteps.assignContentsToGroup();
		Reporter.writeSummary("FR1-1576_Assign content_TC-001, Verify admin is able to Assign content to the Groups," +  defaultGroupSettingsSteps.getResult() );
		// Ends		
//		Reporter.writeSummary("TCID_DefaultGroup__001, Verify login using google button" +  defaultGroupSettingsSteps.getResult() );
//		defaultGroupSettingsSteps.googleBtnRegistration();//completed
//		Reporter.writeSummary("TCID_DefaultGroup__002, Delete the usere created for google button in admin" +  defaultGroupSettingsSteps.getResult() );
//		defaultGroupSettingsSteps.userdeletion_google();
//		Reporter.writeSummary("TCID_DefaultGroup__003, Verify login using facebook button" +  defaultGroupSettingsSteps.getResult() );
//		defaultGroupSettingsSteps.facebookButton();//completed
//		Reporter.writeSummary("TCID_DefaultGroup__004, Delete the usere created for facebook button in admin" +  defaultGroupSettingsSteps.getResult() );
//		defaultGroupSettingsSteps.userdelete_facebook();
//		Reporter.writeSummary("TCID_DefaultGroup__005, Verify whether we can assign and unassign users in General group" +  defaultGroupSettingsSteps.getResult() );
//		defaultGroupSettingsSteps.verifyAssignUnassignUser();
		
}
}
