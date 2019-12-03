package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.VersionSteps;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;


import com.origin.fractal.testauto.test.FractalBaseWebTest;

public class WebTestVersionCheck extends FractalBaseWebTest  {
	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = { "Phase1.0" }, enabled = true, description = "Login Page")
	public void testLogin(String row, String strBrowserName) {
		
		driver = BrowserFactory.getBrowser(strBrowserName);
		Reporter.setBrowserAppOS(strBrowserName);
		VersionSteps versionCheck = new VersionSteps(driver);
		//versionCheck.VersionCheck();
		//Reporter.writeSummary("TCID_Ver,  Verify whether there are 13 columns in the table of version, " +  versionCheck.getResult() );
		versionCheck.VersionCheck1();
		Reporter.writeSummary("TCID_Ver,  Verify whether there are 269 columns in the table of version, " +  versionCheck.getResult() );
	}
}
