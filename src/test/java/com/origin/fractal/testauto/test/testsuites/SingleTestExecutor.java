package com.origin.fractal.testauto.test.testsuites;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.origin.fractal.testauto.steps.HomeSteps;
import com.origin.fractal.testauto.steps.LoginSteps;
import com.origin.fractal.testauto.steps.MyLearningSteps;
import com.origin.fractal.testauto.test.FractalBaseWebTest;
import com.wv.auto.framework.BrowserFactory;
import com.wv.auto.framework.utils.Reporter;

public class SingleTestExecutor extends FractalBaseWebTest {


	@Test(dataProvider = "browers", groups = {
			"pilot" }, enabled = true, description = "TCID_004 : Verify navigation to My Learning page")
	public void testMyLearningPage(String row, String strBrowserName) {
		String result = "Passed";
	
		driver = BrowserFactory.getBrowser(strBrowserName);
		LoginSteps loginSteps = new LoginSteps(driver);
		//TCID_26:Verify the UI of the login page. User name, Password, Remember me fields and Login button are available in the login page.
		loginSteps.loginPageVerification();
		//TCID_36:Verify the login page with valid user name and blank password
		loginSteps.blankPasswordVerification();
		//TCID_30:Verify the login page with blank user name and valid password
		loginSteps.blankUserName();
		//TCID_38:Verify the login page with invalid user name and invalid password
		loginSteps.inValid();
		//TCID_72:Verify the Remember me function
		loginSteps.rememberMe();
		//TCID_74:Verification of Register link  function 
		loginSteps.registerFunction();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Reporter.writeSummary("TCID_004, MyLearning Page, Verify Navigation to MyLearningPage," +  result );
		Reporter.writeSummary("TCID_005, MyLearning Page, Verify Navigation to MyLearningPage," +  "FAILED" );
	}

	@DataProvider
	public Object[][] browers() {
		return new Object[][] {
//			new Object[] { "1", "msedge" }, 
				new Object[] { "2", "chrome" }
//			new Object[] { "3", "firefox" }

		};
	}

}
