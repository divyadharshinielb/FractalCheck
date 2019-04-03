package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.DataManager;
import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.MyLearningSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class SingleTestExecutor extends FractalBaseWebTest {


	@Test(dataProviderClass=DataManager.class, dataProvider = "browers", groups = {
			"pilot" }, enabled = true, description = "TCID_004 : Verify navigation to My Learning page")
	public void testMyLearningPage(String row, String strBrowserName) {
		String result = "Passed";
	
		driver = BrowserFactory.getBrowser(strBrowserName);
		LoginSteps loginSteps = new LoginSteps(driver);		
		Reporter.writeSummary("TCID_NNN, Test Page, Verify Login ," +  result );
		Reporter.writeSummary("TCID_FFF, Test Page, Verify Failure," +  "FAILED" );
	}

}
