package com.origin.fractal.testauto.test.testsuites;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.DefaultGroupSettingsSteps;
import com.origin.fractal.testauto.steps.InstructorModuleSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;

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
	@Test(dataProvider = "browers", groups = { "pilot", "Home" }, enabled = true,
			// description="Verify categories are available as expected" )
			description = "")
	public void DefaultGroupSettingstestInstructorPage(String row, String strBrowserName) throws IOException {
		driver = BrowserFactory.getBrowser(strBrowserName);
		DefaultGroupSettingsSteps defaultGroupSettingsSteps = new DefaultGroupSettingsSteps(driver);
		
		loginToContentAdmin(driver);
		defaultGroupSettingsSteps.googleBtnRegistration();//completed
		defaultGroupSettingsSteps.facebookButton();//completed
		defaultGroupSettingsSteps.verifyAssignUnassignUser();
		
}
}
